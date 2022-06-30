package com.archie;

// 需求, 求 1~5 之间的数据和, 并把求和结果放在控制台输出
public class ForTest02 {
    public static void main(String[] args) {
//        使用 for 循环获取数据 1 ~ 5
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
