package hoo.hcute.chapter10.matter4;



public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents contents = p.contents();
        Destination hello = p.destination("hello");
    }
}

class Parcel4 {
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{

        private String label;

        private PDestination(String label){
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        PContents pContents = new PContents();
        return pContents;
    }
}
