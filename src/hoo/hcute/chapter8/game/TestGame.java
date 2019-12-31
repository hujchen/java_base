package hoo.hcute.chapter8.game;

public class TestGame {

    public static void play(GameFactory gameFactory){
        gameFactory.getGame().play();
    }

    public static void main(String[] args) {
        play(new DiceFactory());
        play(new TossACoinFactory());
    }
}
