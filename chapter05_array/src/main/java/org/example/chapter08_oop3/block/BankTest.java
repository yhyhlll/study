package org.example.chapter08_oop3.block;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.printName();
    }
}

class Bank {
    private String name;
    static int id;

    //    创建构造器
    public Bank() {
        System.out.println("aaaa");
    }

    public void printName() {
        System.out.println("姓名 " + name+id);
    }

    //    创建静态代码块
    static {
        System.out.println("我是静态代码块---");
    }

    //    创建非静态代码块
    {
        System.out.println("我是非静态代码块-----");
        id=1;
    }

}