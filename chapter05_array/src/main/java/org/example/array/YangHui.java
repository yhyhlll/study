package org.example.array;

/*
 *使用二维数组打印一个10行 杨辉三角
 * 00 10\11 20\22 30\33 40\44
 * */
public class YangHui {
    public static void main(String[] args) {
//        初始化数组
        int[][] yanghui = new int[10][];

//        for (int i = 0; i < yanghui.length; i++) {
//            yanghui[i]=new int[i+1];
//        }


//        数组赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];

            yanghui[i][i] = 1;
            yanghui[i][0] = 1;
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
/*  //优化钱的写法
            for (int j = 0; j <=i; j++) {
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }*/
        }

        for (int i = 0; i < yanghui.length; i++) {
            System.out.println("第" + i + "行");
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }

        /*for (int i = 0; i < yanghui.length; i++) {

            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }*/
    }
}
