package hoo.hcute.chapter10.matter5.game;

public class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;
    private Chess(){

    }
    @Override
    public boolean move() {
        System.out.println("Chess move" + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}
