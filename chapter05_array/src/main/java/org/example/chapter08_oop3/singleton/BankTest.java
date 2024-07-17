package org.example.chapter08_oop3.singleton;

public class BankTest {
    public static void main(String[] args) {
//        饿汉式
//        System.out.println(Bank.getBank());
//        System.out.println(Bank.getBank());
        System.out.println(new Bank());
    }
}


//        饿汉式
/*class Bank {
    public Bank() {

    }

    private static Bank instance = new Bank();

    public static Bank getBank() {
        return instance;
    }
}*/

//懒汉式
class Bank {
    public Bank() {

    }

    ;

    private static Bank instance = null;

    public static Bank getBank() {
        if (instance == null) {
            instance = Bank.getBank();
        }
        return instance;
    }
}