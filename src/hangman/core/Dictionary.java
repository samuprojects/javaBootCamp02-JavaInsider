package hangman.core;

import hangman.io.Input;

import java.util.List;
import java.util.Random;

@SuppressWarnings("ALL")
public class Dictionary {

    private static final String FILE_PATH = "/hangman/resources/dictionary.txt";
    private static final Dictionary INSTANCE = new Dictionary(); // transformando o Dictionary em Singleton

    private final List<String> words;
    private final Random random = new Random();

    private Dictionary() {
        words = Input.readLinesFromFile(FILE_PATH); // operações de IO movidas para classe específica
    }

    // escolher palavra aleatoriamente
    public String nextWord() {
        int randomIndex = random.nextInt(0, words.size());
        return words.get(randomIndex);
    }

    // professor explicou que o segredo para refatorar e sempre melhorar seu código é ter experiência codificando, coisa que somente vem com o tempo

    public static Dictionary instance() {
        return INSTANCE;
    }
}
