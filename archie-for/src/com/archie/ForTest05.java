package com.archie;

// 统计水仙花数个数，并输出
public class ForTest05 {
    public static void main(String[] args) {
        var num = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i /10 % 10;
            int bai = i /100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                num += 1;
            }
        }
        System.out.println(num);
    }
}
