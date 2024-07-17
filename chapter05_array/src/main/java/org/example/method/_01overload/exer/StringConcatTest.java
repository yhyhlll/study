package org.example.method._01overload.exer;

import java.nio.channels.Pipe;

public class StringConcatTest {
    public static void main(String[] args) {
//        n个字符串进行拼接，每一个字符串之间使用某字符串进行分割，如果没有传入字符串，那么返回空字符串""
        StringConcatTest sct = new StringConcatTest();
        sct.concatMeth("_", "hello", "world", "hi");

    }

    public String concatMeth(String b, String... a) {
        String result = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                result += a[i];
            }else {
                result+=(b+a[i]);
            }
        }
        System.out.println(result);
        return result;
    }
}
