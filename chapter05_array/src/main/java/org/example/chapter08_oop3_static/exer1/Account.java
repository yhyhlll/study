package org.example.chapter08_oop3_static.exer1;
/*
 * 编写一个类实现银行账户的概念，包含的属性有"账号"，"密码"，"存款余额"、"利率"、"最小余额"。
 * 定义封装这些属性的方法，账号要自动生成
 *
 * 编写账户主类，使用银行账户类，输入输出三个账户的上述信息
 * */

public class Account {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setPassword("a1");
        account1.setSave(1000.00);
        account1.setRatio(0.11);
        System.out.println(account1);

        Account account2 = new Account();
        account2.setPassword("a2");
        account2.setSave(2000.00);
//        account2.setRatio(0.12);
        System.out.println(account2);

        Account account3 = new Account("bbb", 3000);
        System.out.println(account3);
    }

    private int id;
    private String password;
    private double save;
    private static  double ratio;
    private static  double minSave;

    public Account() {
        this.id = init;
        init++;
    }

    public Account(String password, double save) {
        this();
        this.password = password;
        this.save = save;
    }

    static int init = 100;

    //    get
    public String getPassword() {
        return password;
    }

    public double getSave() {
        return save;
    }

    public double getRatio() {
        return ratio;
    }

    public double getMinSave() {
        return minSave;
    }

    //    set
    public void setPassword(String password) {
        this.password = password;
    }

    public void setSave(double save) {
        this.save = save;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public void setMinSave(double minSave) {
        this.minSave = minSave;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                "password='" + password + '\'' +
                ", save=" + save +
                ", ratio=" + ratio +
                ", minSave=" + minSave +
                '}';
    }
}
