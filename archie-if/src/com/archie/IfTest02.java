package com.archie;

public class IfTest02 {
    public static void main(String[] args) {
//        1. 定义一个 int 类型的整数
        int number = 10;
        number = 9;
//        2. 用 if 语句格式2进行判断
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }
//        3. 根据是否是偶数给出不同的提示信息
    }
}
