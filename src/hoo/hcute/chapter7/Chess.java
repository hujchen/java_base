package hoo.hcute.chapter7;

public class Chess extends BoardGame{

    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

class Game{

    public Game() {
        System.out.println("Came void constructor");
    }

    Game(int i){
        System.out.println("Game constructor" + i);
    }
}

class BoardGame extends Game{

    public BoardGame() {
    }

    public BoardGame(int i) {
//        super(i);
        System.out.println("BoardGame constructor" + i);
    }
}
