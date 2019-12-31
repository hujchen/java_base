package hoo.hcute.chapter10.matter4.matter42;

import hoo.hcute.chapter10.matter4.matter41.Action;

public class Dog {

    protected class DogAction implements Action {


        public DogAction() {
        }

        @Override
        public void eat() {
            System.out.println("一般的够喜欢吃骨头");
        }

        @Override
        public void run() {
            System.out.println("一般的够喜欢奔跑");
        }
    }
}
