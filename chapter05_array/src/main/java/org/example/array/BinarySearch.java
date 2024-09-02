package org.example.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 10, 20, 23};
        int target = 110;


        int start = 0;
        int end = num1.length - 1;
        boolean isflag = false;
        while (start <= end) {
            if (num1[(start + end) / 2] == target) {
                System.out.println("z找到了" + (start + end) / 2);
                isflag=true;
                break;
            } else if (num1[(start + end) / 2] > target) {
                end = (start + end) / 2 - 1;
            } else if (num1[(start + end) / 2] < target) {
                start = (start + end) / 2 + 1;
            }
        }
        if (!isflag) {
            System.out.println("没找到。。。。。");
        }


        

    }
}
