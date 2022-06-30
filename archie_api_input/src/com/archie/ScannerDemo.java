package com.archie;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        创建 Scanner 对象
        Scanner sc = new Scanner(System.in);
//        获取数据
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
//        输出获取到的数据
        System.out.println("你输入的数据是:"+i);
    }
}
