package org.example.array;

import java.util.Scanner;

public class ExerArray01 {
    public static void main(String[] args) {
        /*
         * 案例：输出英文星期几
         *用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
         *
         * */
        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Staurday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1-7");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 7) {

            System.out.println("今天是：" + (week[day - 1]));

        } else {
            System.out.println("你输入的数据有误");
        }
//        使用结束记得关闭
        scanner.close();
    }
}
