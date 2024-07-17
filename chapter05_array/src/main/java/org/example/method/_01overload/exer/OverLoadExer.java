package org.example.method._01overload.exer;

/*
 * 定义三个重载方法max()
 * 第一个：求两个int值中的最大值
 * */
public class OverLoadExer {
    public static void main(String[] args) {
        OverLoadExer overLoadExer = new OverLoadExer();
//        overLoadExer.max(1.3,1.3,1.5);
        System.out.println(overLoadExer.max(1, 2));
    }

    public int max(int a, int b) {
        return a>b?a:b;
//        if (a > b) {
//            System.out.println("a为最大值，值为 " + a);
//        }else if (a<b){
//            System.out.println("b为最大值，值为 " + b);
//        }else {
//            System.out.println("两者值相等");
//        }
    }

    public double max(double a,double b){
        if (a > b) {
            System.out.println("a为最大值，值为 " + a);
            return  a;
        }else if (a<b){
            System.out.println("b为最大值，值为 " + b);
            return b;
        }
            System.out.println("两者值相等");
            return a;

    }

    public double max(double a,double b,double c){
        double max1 = max(a, b);
        double rs = max(max1, c);
        return rs;
    }
}
