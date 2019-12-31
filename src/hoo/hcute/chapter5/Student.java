package hoo.hcute.chapter5;

public class Student {
    String name = "hoo";

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student("hjc");
        System.out.println(s.name);
    }
}
