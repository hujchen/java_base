package hoo.hcute.chapter7;

public class Bone {

    int weight;

    public Bone(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "当前有" + this.weight + "斤骨头";
    }
}
