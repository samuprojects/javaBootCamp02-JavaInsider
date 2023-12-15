package hangman.core;

@SuppressWarnings("ALL")
public class Word {

    private static final char HIDDEN_CHAR = '_'; // definir qual será o caractere coringa

    private final char[] letters; // array para armazenar as letras da palavra
    private final char[] hiddenLetters; // array que vai possuir o mesmo tamanho de letters com caractere coringa

    public Word(String text){ // construtor que vai receber a palavra a ser descoberta
        letters = text.toCharArray(); // converte texto para array de char
        hiddenLetters = String.valueOf(HIDDEN_CHAR).repeat(text.length()).toCharArray(); // converte o char em String até o tamanho da palavra real
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char l : hiddenLetters){
            sb.append(l).append(" ");
        }

        return sb.toString().trim();
    }

    // método para exibir letra existente
    public boolean reveal(char letter){
        boolean replaced = false;

        for (int i = 0; i < letters.length; i++){
            if (letters[i] == letter){
                hiddenLetters[i] = letter;
                replaced = true;
            }
        }
        return replaced;
    }

    public boolean revealed() { // verificar se a palavra foi revelada
        return toString().indexOf(HIDDEN_CHAR) == -1;
    }

    public String show() { // mostrar a palavra real
        return String.valueOf(letters);
    }
}
