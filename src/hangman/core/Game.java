package hangman.core;

import hangman.io.Input;
import hangman.io.Output;

@SuppressWarnings("ALL")
public class Game {

    public void start() {

        Dictionary dictionary = Dictionary.instance();
        Word word = dictionary.nextWord();
        Output.writeToConsole(word);

        while (true) {
            String text = Input.readFromKeyboard("Letter");
            word.reveal(text.charAt(0));

            Output.writeToConsole(word);
        }
    }
}
