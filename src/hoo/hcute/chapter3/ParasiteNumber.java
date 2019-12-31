package hoo.hcute.chapter3;



public class ParasiteNumber {
    public static void main(String[] args) {
        int sum = 0;
        int[] start = new int[4];
        int[] end = new int[4];

        for (int i = 10; i <=99 ; i++) {
            for (int j = i; j <=99 ; j++) {
                if ((i * j)%9 != (i + j) % 9){
                    continue;
                }
                int result = i * j;

                start[0] = i /10;
                start[1] = i % 10;
                start[2] = j /10;
                start[3] = j % 10;

                end[0] = result/1000;
                end[1] = result%1000/100;
                end[2] = result%1000%100/10;
                end[3] = result%1000%100%10;

                int count = 0;

                for (int k = 0; k < 4 ; k++) {
                    for (int l = 0; l < 4 ; l++) {
                        if (start[k] == end[l]){
                            count++;
                            start[k] = -1;
                            end[l] = -2;
                            if (count == 4) {
                                sum++;
                                System.out.println("第" + sum + "组：" + i + "*" + j + "：" + result);
                            }
                        }
                    }
                }

            }
        }

        System.out.println("方法共找到" + sum + "组吸血鬼数字");
    }
}
