package com.archie_02;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);

//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);

//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
//        System.out.println(arr[2][2]);

//        for (int i = 0; i < arr[0].length; i++) {
//            System.out.println(arr[0][i]);
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
