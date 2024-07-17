package org.example.oop.exer5_object;

/*
*  案例：
1)定义类student,包含三个属性：学号number(int),年级state(int),成绩score(int).
2)创建20个学生对象，学号为1到20,年级和成绩都由随机数确定。
问题一：打印出3年级（state值为3)的学生信息。.
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示
1)生成随机数：math,random(),返回值类型double;
2)四舍五入取整：math,round(doubled),返回值类型long.
年级【1,6]:(int)(math.random()*6+1)
分娄数【0,100]:(int)(math.random()*101)
* */
public class Student {
    public int number;
    public int state;
    public int score;

    //打印三年级学生的相关信息
    public void show3(Student[] students, int className) {
        for (int i = 0; i < students.length; i++) {
            if (className == students[i].state) {
                System.out.println(students[i].state + students[i].score);
            }
        }
    }

//    遍历
    public  void loop(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println("score"+students[i].score);
        }
    }

//    冒泡排序
    public void sortByScore(Student[] students){
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length-i-1; j++) {
                if (students[j].score >students[j+1].score){
                    Student tmp = new Student();
                    tmp=students[j];
                    students[j+1]=students[j];
                    students[j]=tmp;
                }
            }
        }
    }

}
