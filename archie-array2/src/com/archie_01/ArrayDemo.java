package com.archie_01;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6}};
//        输出数组名
        System.out.println(arr); // [[I@f6f4d33
        System.out.println(arr[0]); // [I@23fc625e
        System.out.println(arr[1]); // [I@3f99bd52

//        如何获取到数据1，2，3呢?
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

    }
}
