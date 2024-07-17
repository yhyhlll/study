package org.example.String.exer3;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("Tom", "8888");
        users[1] = new User("songhk", "123");
        users[2] = new User("Jerry", "6666");

        System.out.println("库中的用户有：");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
//       实例化scanner，获取输入的用户名和密码
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();

//        遍历数组元素，匹配用户名和密码

        boolean isFlag=true;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(name)) {
                isFlag=false;
                if (users[i].getPassWord().equals(password)){

                    System.out.println("用户登录成功");
                }else{
                    System.out.println("用户密码错误");
                }
                break;

            }
        }
        if (isFlag){
            System.out.println("用户不存在");
        }

    }
}
