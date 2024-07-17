package org.example.array;

/*
 * 创建一个长度为6的int型数组。要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同
 * */
public class ExerArray04 {
    public static void main(String[] args) {
        //创建数组
        int[] arr1 = new int[6];

        for (int i = 0; i < arr1.length; i++) {
            double random1 = Math.random();
//            int b= (int)(random1 * 30 +1 );

            arr1[i] = (int) (random1 * 30 + 1);

            boolean flag = false;

            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr1[i] == arr1[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    arr1[i] = (int) (random1 * 30 + 1);
                    flag = false;
                    continue;
                }
                break;
            }

        }

//       TODO 更优化的写法
        for (int i = 0; i < arr1.length; i++) {
            double random1 = Math.random();
            arr1[i] = (int) (random1 * 30 + 1);
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    i--;
                    break;
                }
            }
        }
//遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        pkp();

    }

    public static void pkp() {
        String[] hua = {"黑桃", "红桃", "方片", "梅花"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7"};
        for (int i = 0; i < hua.length; i++) {
            for (int i1 = 0; i1 < dian.length; i1++) {
                System.out.print(hua[i] + dian[i1] + " ");
            }
            System.out.println();
        }
    }

 /*   public static void reactRange() {
//        回行数
        int arr[][] = new int[4][4];

//        定义常量 指明方向 1 右 2 左 3 上 4 下
        int k = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (k == 1) {
                    arr[i][j]=j;
                }
            }

        }
    }*/
}
