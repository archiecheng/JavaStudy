package com.archie_03;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
//        定义一个数组,并进行动态初始化
        int[] arr = new int[5];

//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);
////        录入第一个数据
//        System.out.println("请输入第一个数据:");
//        arr[0] = sc.nextInt();
//
////        录入第二个数据
//        System.out.println("请输入第二个数据:");
//        arr[1] = sc.nextInt();


//        println() 换行
//        print() 不换行
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + ( i + 1 ) + "个元素:");
            arr[i] = sc.nextInt();
        }

        printArray(arr);

    }
    //        参数: int[] arr
//        返回值: void
//    public static void printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
