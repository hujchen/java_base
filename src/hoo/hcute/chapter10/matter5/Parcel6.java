package hoo.hcute.chapter10.matter5;

public class Parcel6 {

    private class PDestination implements Destination{

        private String label;

        public PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

    }

    public Destination getDestination(){
        return new PDestination("beijing");
    }



}
