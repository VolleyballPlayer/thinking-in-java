package reusing.classes;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i); //constructor would complain without it
        System.out.println("BoardGame constructor");
    }
}
class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
        //super(11); constructo would complain if super would be called after print
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
