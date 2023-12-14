package hangman.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public final class Input {

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
}