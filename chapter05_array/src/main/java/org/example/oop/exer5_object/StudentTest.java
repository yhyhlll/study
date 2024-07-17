package org.example.oop.exer5_object;

import static java.lang.Math.round;

public class StudentTest {
    public static void main(String[] args) {
//        创建对象数组
        Student[] students = new Student[20];

        double random = Math.random();


        for (int i = 0; i < students.length; i++) {
//            此行不能省略 否则出现空值针 具体为对象不存在 无法进行赋值
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 100 + 1);

//            System.out.println("第"+students[i].number +"个学生的班级为，"+ students[i].state +"分数为："+students[i].score);
        }

//        for (int i = 0; i < students.length; i++) {
//            if (3 == students[i].state) {
//                System.out.println(students[i].state + students[i].score);
//            }
//        }
        new Student().show3(students,3);


       /* for (int i = 0; i < students.length; i++) {
            System.out.println("students[j].score"+students[i].score);
        }*/
        new Student().loop(students);

//使用冒泡排序，按学生成绩排序，并遍历所有学生信息
    /*    for (int i = 0; i < students.length; i++) {
            Student s = new Student();
            for (int j = 0; j < students.length-i-1; j++) {
             if(students[j].score > students[j+1].score){
             }else {
                 Student sf = students[j];
                 students[j]=students[j+1];
                 students[j+1]=sf;
             }
            }

        }*/
        new Student().sortByScore(students);
       /* for (int i = 0; i < students.length; i++) {
            System.out.println("交换顺序之后的=----");
            System.out.println("students[j].score"+students[i].score);
        }*/
        System.out.println("-------------------- ");
        new Student().loop(students);
    }
}
