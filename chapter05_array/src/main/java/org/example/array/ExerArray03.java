package org.example.array;

/*
 * 评委打分
 * 分析以下需求,并用代码实现
 * 1）在编程竞赛中,有10位评委为参赛的选手打分,分数分别为5,4,6,8,9,0,1,2,7,3
 * 2）求选手的最后的粉（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 * */
public class ExerArray03 {
    public static void main(String[] args) {
        int[] score = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        int maxScore = score[0];
        int minScore = score[0];
        int sum=0;

        for (int i = 0; i < score.length; i++) {
            if (maxScore < score[i])
                maxScore=score[i];
            if (minScore> score[i])
                minScore=score[i];
            sum+=score[i];
        }
        System.out.println("最高分为"+maxScore+"，最低分为"+minScore);
        sum=sum-maxScore-minScore;
        System.out.println(sum);

    }
}
