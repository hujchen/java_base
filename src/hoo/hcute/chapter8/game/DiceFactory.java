package hoo.hcute.chapter8.game;

public class DiceFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}
