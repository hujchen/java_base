package hoo.hcute.chapter10.matter5.game;

public class Checkers implements Game {

    private int moves = 0;

    private static final int MOVES = 5;

    private Checkers(){

    }
    @Override
    public boolean move() {
        System.out.println("Checkers move" + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}
