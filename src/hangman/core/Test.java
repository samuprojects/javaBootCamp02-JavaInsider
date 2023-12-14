package hangman.core;

@SuppressWarnings("ALL")
public class Test {

    public static void main(String[] args) {
//        Word w = new Word("java");
//        System.out.println(w); // testar a palavra com visualização do caractere coringa
//        System.out.println();
//
//        System.out.println(w.reveal('a'));
//        System.out.println(w);
//        System.out.println();
//
//        System.out.println(w.reveal('x'));
//        System.out.println(w);

//        Dictionary dictionary = new Dictionary();
        Dictionary dictionary = Dictionary.instance();
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());
    }
}
