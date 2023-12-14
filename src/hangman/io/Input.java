package hangman.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.isNull;

@SuppressWarnings("ALL")
public final class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    private Input() {
    }

    public static List<String> readLinesFromFile(String path) {
        URL url = Input.class.getResource(path);

        if (url == null) {
            throw new RuntimeException("File not found: " + path); // erro para arquivo inexistente
        }

        try {
            return Files.readAllLines(Path.of(url.toURI()), UTF_8);
        } catch (URISyntaxException |
                 IOException e) { // multi catch, para tratar mais de um tipo de exceção no mesmo bloco catch
            throw new RuntimeException("Error loading dictionary", e); // exceção aninhada, para exibir o problema e a causa em outro nível
        }
    }

    public static String readFromKeyboard(String message){
        if (!isNull(message)) {
            System.out.format("%s: ", message);
        }
        return SCANNER.nextLine();
    }
}