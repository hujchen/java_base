package hoo.hcute.chapter7;

public class Dog {
    String name ;
    Bone bone;

    public void findBone(){
        if ( bone == null) {
            bone = new Bone(10);
            System.out.println("小狗找到了10斤骨头");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.bone);
        dog.findBone();
        System.out.println(dog.bone);
    }

}
