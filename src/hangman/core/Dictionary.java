package hangman.core;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

@SuppressWarnings("ALL")
public class Dictionary {

    private static final String FILE_PATH = "/hangman/resources/dictionar.txt";

    private final List<String> words;
    private final Random random = new Random();

    public Dictionary() {
        URL url = getClass().getResource(FILE_PATH);

        if (url == null){
            throw  new RuntimeException("File not found: " + FILE_PATH); // erro para arquivo inexistente
        }

        try {
            words = Files.readAllLines(Path.of(url.toURI()));
        } catch (URISyntaxException | IOException e) { // multi catch, para tratar mais de um tipo de exceção no mesmo bloco catch
            throw new RuntimeException("Error loading dictionary", e); // exceção aninhada, para exibir o problema e a causa em outro nível
        }

    }

    // escolher palavra aleatoriamente
    public String nextWord(){
        int randomIndex = random.nextInt(0, words.size());
        return words.get(randomIndex);
    }

    // professor explicou que o segredo para refatorar e sempre melhorar seu código é ter experiência codificando, coisa que somente vem com o tempo
}
