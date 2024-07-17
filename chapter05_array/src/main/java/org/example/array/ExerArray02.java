package org.example.array;

import java.util.Scanner;

/*
 * 学生考试等级划分
 *
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级
 * */
public class ExerArray02 {
    public static void main(String[] args) {
        System.out.println("请输入学生人数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] score = new int[num];
        System.out.println("请输入学生成绩：");

        int maxScore = score[0];
        for (int i = 0; i < num; i++) {
            int grade = scanner.nextInt();
            if (maxScore < grade){
                maxScore = grade;
            }
            score[i]=grade;
        }
        System.out.println("所有成绩的最高分为：" + maxScore);

        char flag='0';
        for (int i = 0; i < score.length; i++) {
            if (score[i] > maxScore-10){
                flag='a';
            }else if (score[i] > maxScore-20){
                flag='b';
            } else if (score[i] > maxScore-30){
                flag='c';
            }else {
                flag='d';
            }
            System.out.println("学生"+i+"等级为A"+"分数为"+score[i]);
        }


//        for (int i = 0; i < num; i++) {
//            int grade = scanner.nextInt();
//            score[i] = grade;
//        }
//
//        int maxScore = score[0];
////求出最高分
//        for (int i = 1; i < score.length; i++) {
//            if (score[i] > maxScore) {
//                maxScore = score[i];
//            }
//        }
//        System.out.println("所有成绩的最高分为：" + maxScore);

//        根据成绩划分等级

//        for (int i = 0; i < score.length; i++) {
//            if (score[i] > maxScore-10) {
//                System.out.println("学生"+i+"等级为A"+"分数为"+score[i]);
//            } else if (score[i] > maxScore-20) {
//                System.out.println("等级为B");
//            } else if (score[i] > maxScore-30) {
//                System.out.println("等级为C");
//            }else{
//                System.out.println("等级为D");
//            }
//        }
        scanner.close();
    }
}
