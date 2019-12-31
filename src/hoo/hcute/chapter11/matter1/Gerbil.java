package hoo.hcute.chapter11.matter1;

import java.util.ArrayList;
import java.util.List;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop(){
        System.out.println(gerbilNumber + "gerbils is hopping");
    }

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(4));
        gerbils.add(new Gerbil(5));

        for (Gerbil gerbil : gerbils) {
            gerbil.hop();
        }
    }
}
