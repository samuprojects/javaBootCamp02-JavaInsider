package hangman.core;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

@SuppressWarnings("ALL")
public class Dictionary {

    private static final String FILE_PATH = "/hangman/resources/dictionary.txt";

    private final List<String> words;
    private final Random random = new Random();

    public Dictionary()  throws Exception {
        URL url = getClass().getResource(FILE_PATH);
        words = Files.readAllLines(Path.of(url.toURI()));
    }

    // escolher palavra aleatoriamente
    public String nextWord(){
        int randomIndex = random.nextInt(0, words.size());
        return words.get(randomIndex);
    }
}
