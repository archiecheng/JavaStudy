package com.archie;

public class IfTest03 {
    public static void main(String[] args) {
//        1. 定义变量(money1) 记录不适用以旧换新的花费
        int money1 = 7988 - 1500;

//        2. 定义变量(money2) 记录使用以旧换新的花费
        double money2 = 7988 * 0.8;

//        3. 用 if 语句格式2 进行判断 money1 是否大于 money2
        if (money1 > money2) {
            System.out.println("使用以旧换新更省钱");
        } else {
            System.out.println("不使用以旧换新更省钱");
        }
//        4. 根据判断结果, 给出相应的提示
    }
}
