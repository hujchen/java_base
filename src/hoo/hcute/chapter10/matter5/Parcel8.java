package hoo.hcute.chapter10.matter5;

public class Parcel8 {

    public Wrapping wrapping(int x){
        return new Wrapping(x) {
            public int value(){
                return super.value()*47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping wrapping = p.wrapping(11);

        System.out.println(wrapping.value());

    }
}
