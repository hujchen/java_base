package hoo.hcute.chapter8.game;

public class TossACoinFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new TossACoin();
    }
}
