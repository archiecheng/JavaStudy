package com.archie_02;

import java.util.Random;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j];
                int x = r.nextInt(arr.length);
                int y = r.nextInt(arr[x].length);

//                元素交换
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
