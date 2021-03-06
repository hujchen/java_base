package hoo.hcute.matter13.matter5;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {

    private String name;
    private Formatter f;

    public Turtle(String name,Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x,int y){
        f.format("%s The Turtle is at (%d,%d)\n",name,x,y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("tommy",new Formatter(System.out));
        Turtle terry = new Turtle("terry",new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
    }
}
