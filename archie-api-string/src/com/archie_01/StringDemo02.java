package com.archie_01;

public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "archie";
        String s2 = "archie";
        String s3 = "Archie";
//        equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("------------------");

        String s4 = " archie";
        System.out.println(s4);
        System.out.println(s4.trim());

    }
}
