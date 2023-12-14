package hangman.io;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.isNull;

@SuppressWarnings("ALL")
public final class Output {
    private static final PrintWriter OUT = new PrintWriter(new OutputStreamWriter(System.out, UTF_8), true);

    private Output(){}

    public static void writeToConsole(){ // se não fornecer nada vai somente pular linha
        writeToConsole(null, true);
    }

    public static void writeToConsole(Object obj){ // se fornecer somente um objeto, faz a impressão dele e quebra linha
        writeToConsole(obj, true);
    }

    public static void writeToConsole(Object obj, boolean newLine){ // faz o controle manual da quebra de linha através do parâmetro newLine
        if (isNull(obj)){
            OUT.println();
        } else if (newLine){
            OUT.println(obj);
        } else {
            OUT.print(obj);
        }
    }
}
