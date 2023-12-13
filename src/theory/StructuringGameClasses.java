package theory;

@SuppressWarnings("ALL")
public class StructuringGameClasses {

    /*
    *
    * O jogo tem o sentido de ocultar uma palavra escolhida aleatoriamente em um dicionário
    * o jogador deve descobrir conforme lança palpites das letras existentes
    *
    *
    *  -------            -------              ----------
    *  |     |            | --- |             | Dictionary|
    *  |    loop          | --- |              -----------
    *  |                  -------                |        ^
    *  |                                         |        |              Essas classes representam o CORE do jogo
    *  | p a l a v r a                           v        |
    *  | - - - - - - -                          Word      |
    *    |------------|                           ^------Game
    *                           InvalidLetterException    | |
    *                                                     | |
    *                                                     | |
    *                                                     v v
    *                                                 Input Output
    *
    *
    *
    * */
}
