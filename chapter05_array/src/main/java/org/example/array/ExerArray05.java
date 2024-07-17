package org.example.array;

public class ExerArray05 {
    public static void main(String[] args) {
//        数组反转
        int[] num = {10, 3, 4, 5, 6};

        int tmp=0;
        for (int i = 0; i < num.length/2; i++) {
            tmp = num[i];
            num[i]=num[num.length-1-i];
            num[num.length-1-i]=tmp;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
