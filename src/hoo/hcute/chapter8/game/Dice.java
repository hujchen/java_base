package hoo.hcute.chapter8.game;

public class Dice implements Game {

    @Override
    public void play() {
       int val =  random.nextInt(6) + 1;

       switch (val) {
           case 1:
               System.out.println("1点");
               break;
           case 2:
               System.out.println("2点");
               break;
           case 3:
               System.out.println("3点");
               break;
           case 4:
               System.out.println("4点");
               break;
           case 5:
               System.out.println("5点");
               break;
           case 6:
               System.out.println("6点");
               break;
           default:
               System.out.println("i no");
       }
    }
}
