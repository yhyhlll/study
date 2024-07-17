package org.example.array;

public class LineSearch {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 10, 23};
        int target=101;
        boolean isflag=false;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i]==target){
//                System.out.println("找到了，索引位置为"+i);
                isflag=true;
                break;
            }
        }
        if (isflag){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }
    }
}
