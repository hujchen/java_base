package hoo.hcute.chapter8.cycle;

public class TestCycleFactory {
    public static void main(String[] args) {
        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle cycle = bicycleFactory.getCycle();
        cycle.run();
    }
}
