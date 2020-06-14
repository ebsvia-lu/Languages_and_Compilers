import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.PrintWriter;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    private final static String DIR = "input/";

    public static void main(String[] args) {
        try { //text file
            String infile = "Factorial.txt";
            CharStream ch = fromFileName(DIR + infile);
            assignment2Lexer lex = new assignment2Lexer(ch);
            org.antlr.v4.runtime.CommonTokenStream tok = new CommonTokenStream(lex);
            assignment2Parser parser = new assignment2Parser(tok);
            ParseTree tree = parser.start();

            String fine3 = new SecondBaseVisitor().visit(tree);
            System.out.printf("%s\n", fine3);

            //produce python file

            PrintWriter writer = new PrintWriter(DIR + infile.split(".txt")[0] + ".py");
            writer.print(fine3);
            writer.close();

            //Abstract Syntax Tree:
    /*        JFrame frame = new JFrame("AST");
            TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            treeViewer.setScale(1.5);
            frame.add(treeViewer);
            frame.setSize(640, 480);
            frame.setVisible(true);
        }
*/
    //AST - display the AST
        String display = String.valueOf(new ASTvisitor().visit(tree));
        System.out.printf("%s\n", display);
    }
        catch(Exception e){
            System.out.println("....Warning: Some Other exception!");
        }


    }
}

