package hangman.core;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@SuppressWarnings("ALL")
public class Dictionary {

    private static final String FILE_PATH = "/hangman/resources/dictionary.txt";

    private final List<String> words;

    public Dictionary()  throws Exception {
        URL url = getClass().getResource(FILE_PATH);
        words = Files.readAllLines(Path.of(url.toURI()));
        System.out.println(words);
    }
}
