import asm.AsmAnalyzer;
import asm.AsmLoader;
import asm.AsmReader;
import asm.InstrReader;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Hannes Kinks
 * @since 26.11.2015
 */
public class Main {

    public static final String INPUT_FILE = "data/input.lang";
    public static final String OUTPUT_ASM = "data/output.asm";
    public static final String OUTPUT_BIN = "data/output.bin";
    public static final String INSTRUCTIONS_CONF = "data/instructions.conf";
    public static final boolean DRAW_TREE = false;
    public static final int BIT_WIDTH = 8;

    public static void main(String[] args) {
        try {
            // feed input stream to antlr
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(INPUT_FILE));
            LangLexer lexer = new LangLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LangParser parser = new LangParser(tokens);

            if (DRAW_TREE) {
                drawTree(parser);
            } else {
                // convert language to assembler
                convertToAsm(parser);
            }

            // convert assembler to machine code
            convertToBin();
        } catch (IOException e) {
            System.err.println("[ERR] File " + INPUT_FILE + " not found.");
        }
    }

    private static void drawTree(LangParser parser) {
        //draw tree in gui
        System.out.println("[INFO] Drawing tree.");
        ParserRuleContext ruleContext = parser.prog();
            /* updated in 4.5.1 */
        Trees.inspect(ruleContext, parser);
            /* deprecated: ruleContext.inspect(parser); */
    }

    private static void convertToAsm(LangParser parser) {
        //walk the tree
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

        // Write the ASM lines into a file
        try {
            FileWriter fileWriter = new FileWriter(OUTPUT_ASM);
            for (String line : eval.lineArray) {
                fileWriter.write(line + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("[ERR] File cannot be created or opened. Make sure it is not already open somewhere " +
                    "or you have the required permissions.");
        }
    }

    /**
     * Running picoASM which converts assembler to machinecode
     */
    private static void convertToBin() {

        // parse the instructions from conf file
        Map<String, String[]> instructionMap = null;
        try {
            InputStream is = new FileInputStream(INSTRUCTIONS_CONF);
            InstrReader instrReader = new InstrReader();
            instructionMap = instrReader.readInstr(is, false);

        } catch (FileNotFoundException e) {
            System.err.println("[ERR] Operation codes file " + INSTRUCTIONS_CONF + " not found.");
        } catch (Exception e) {
            System.err.println("[ERR] Error reading the instructions.");
        }

        // parse the assembler code
        AsmLoader asmLoader = null;
        try {
            InputStream asmStream = new FileInputStream(OUTPUT_ASM);
            AsmReader asmReader = new AsmReader();
            asmLoader = asmReader.readAsm(asmStream, false);

        } catch (FileNotFoundException e) {
            System.err.println("[ERR] Output file was not found at " + OUTPUT_ASM);
        } catch (Exception e) {
            System.err.println("[ERR] Error parsing the assembler code.");
        }

        // get the machine code output
        AsmAnalyzer analyzer = new AsmAnalyzer();
        if (instructionMap != null && asmLoader != null) {
            ArrayList<String> machineCode = analyzer.analyze(instructionMap,
                    asmLoader.getLabelList(),
                    asmLoader.getConstList(),
                    asmLoader.getFileBuf(),
                    BIT_WIDTH);
            File file = new File(OUTPUT_BIN);

            String outputBuf = "";

            for (String line : machineCode) {
                outputBuf += line + "\n";
            }

            // write the machine code output to a file
            try {
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(outputBuf);
                bw.close();
            } catch (IOException e) {
                System.err.println("[ERR] Writing binary file failed.");
            }
        }
    }
}
