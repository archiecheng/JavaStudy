package com.archie;

public class IfTest04 {
    public static void main(String[] args) {
//        1. 定义一个 int 类型的变量来表示你的年龄
        int age = 22;

//        2. 用 if 语句格式2来进行判断看你是否属于青年人
        //        3. 根据是否是青年人给出不同的提示信息
        if (age >= 18 && age <= 65) {
            System.out.println("你是青年人");
        } else {
            System.out.println("你不是青年人");
        }

    }
}
