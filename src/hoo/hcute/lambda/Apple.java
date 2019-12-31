package hoo.hcute.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apple {
    private String color;

    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        Apple a1 = new Apple("red",23);
        Apple a2 = new Apple("green",24);
        Apple a3 = new Apple("yellow",20);
        Apple a4 = new Apple("blue",28);
        inventory.add(a1);
        inventory.add(a2);
        inventory.add(a3);
        inventory.add(a4);

        inventory.sort(Comparator.comparing(Apple::getWeight));

        for (Apple apple : inventory) {
            System.out.println(apple);
        }
    }
}
