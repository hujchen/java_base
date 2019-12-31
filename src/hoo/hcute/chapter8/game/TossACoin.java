package hoo.hcute.chapter8.game;


public class TossACoin implements Game {

    @Override
    public void play() {
        int val = random.nextInt(2);
        switch (val){
            case 0:
                System.out.println("花");
                break;
            case 1:
                System.out.println("字");
                break;
            default:
                System.out.println("i no");
        }
    }
}
