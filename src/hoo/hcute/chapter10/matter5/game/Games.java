package hoo.hcute.chapter10.matter5.game;

public class Games {
    public static void playGame(GameFactory gameFactory){
        Game s = gameFactory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
