package com.archie;

public class ControlTest {
    public static void main(String[] args) {
        double dayMoney = 2.5;

        double sumMoney = 0;

        int result = 100;

        int dayCount = 1;

        while(true) {
            sumMoney += dayMoney;
//            判断存的钱是否大于等于 100
            if (sumMoney >= result) {
                break;
            }
            if (dayCount % 5 == 0) {
                sumMoney -= 6;
                System.out.println("第"+dayCount+"天,花了6元");
            }
            dayCount++;
        }
        System.out.println(dayCount);
    }
}
