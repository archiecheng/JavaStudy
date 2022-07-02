package com.archie_04;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
//        输出元素
//        System.out.println(arr[3]);
        System.out.println(arr[2]);

        arr = null;
        if (arr != null) {
            System.out.println(arr[0]);
        }
    }
}
