package hoo.hcute.chapter10.matter4.matter43;

import hoo.hcute.chapter10.matter4.matter41.Action;
import hoo.hcute.chapter10.matter4.matter42.Dog;

public class Husky extends Dog {

    class HuskyAction extends DogAction{
        @Override
        public void eat() {
            System.out.println("哈奇士更喜欢吃苦瓜，嘎嘣脆，鸡肉味");
        }

        @Override
        public void run() {
            System.out.println("哈奇士更喜欢奔跑的时候用脸刹车");
        }


    }

    public Action getHuskyAction(){
        return new HuskyAction();
    }

    public Action getDogAction(){ // 这个时候为什么要提供默认的无参数的构造函数？？？
        return new DogAction();
    }

}
