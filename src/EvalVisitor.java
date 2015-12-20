import java.util.ArrayList;

/**
 * Class for using Visitor pattern.
 * If you wish to use Listener pattern, create a class that extends LangBaseListener and override the methods.
 */
public class EvalVisitor extends LangBaseVisitor{
    public ArrayList<String> lineArray = new ArrayList<String>(); // holds the assembler code lines
    public int createMemAddr = 0;

    @Override
    public Object visitCreateWithValue(LangParser.CreateWithValueContext ctx) {
        lineArray.add("$" + ctx.VARNAME() + " " + createMemAddr++);
        lineArray.add("LOADN" + " " + ctx.VALUE());
        lineArray.add("STORE" + " " + "$" + ctx.VARNAME());
        return super.visitCreateWithValue(ctx);
    }

    @Override
    public Object visitCreateArray(LangParser.CreateArrayContext ctx) {
        for (int i=0; i<ctx.VALUE().size();i++) {
            lineArray.add("$" + ctx.VARNAME() + i + " " + createMemAddr++);
            lineArray.add("LOADN" + " " + ctx.VALUE(i));
            lineArray.add("STORE" + " " + "$" + ctx.VARNAME() + i);
        }
        return super.visitCreateArray(ctx);
    }

    @Override
    public Object visitAssVarVal(LangParser.AssVarValContext ctx) {
        lineArray.add("LOADV" + " " + "$" + ctx.VARNAME(1));
        lineArray.add("ADD" + " " + ctx.VALUE());
        lineArray.add("STORE" + " " + "$" + ctx.VARNAME(0));
        return super.visitAssVarVal(ctx);
    }

    @Override
    public Object visitAssVarVar(LangParser.AssVarVarContext ctx) {
        lineArray.add("LOADV" + " " + "$" + ctx.VARNAME(2));
        lineArray.add("SETR" + " ");
        lineArray.add("LOADV" + " " + "$" + ctx.VARNAME(1));
        lineArray.add("MUXR" + " ");
        lineArray.add("ADD" + " ");
        lineArray.add("MUXOP" + " ");
        lineArray.add("STORE" + " " + "$" + ctx.VARNAME(0));

        return super.visitAssVarVar(ctx);
    }

    @Override
    public Object visitAssValVal(LangParser.AssValValContext ctx) {
        lineArray.add("LOADN" + " " + ctx.VALUE(0));
        lineArray.add("add" + " " + ctx.VALUE(1));
        lineArray.add("STORE" + " " + "$" + ctx.VARNAME());
        return super.visitAssValVal(ctx);
    }

    @Override
    public Object visitAddToArrayElement(LangParser.AddToArrayElementContext ctx) {
        lineArray.add("LOADV" + " " + "$" + ctx.VARNAME() + ctx.VALUE(0));
        lineArray.add("ADD" + " " + ctx.VALUE(1));
        lineArray.add("STORE" + " " + "$" + ctx.VARNAME() + ctx.VALUE(0));
        return super.visitAddToArrayElement(ctx);
    }

    @Override
    public Object visitExitStmt(LangParser.ExitStmtContext ctx) {
        lineArray.add("HALT");
        return super.visitExitStmt(ctx);
    }

}
