package com.archie_03;

public class Student {
//    成员变量
    private String name;
//    int age;
    private int age;
//    public void setAge(int a) {
////        age = a;
//        if (a < 0 || a > 123) {
//            System.out.println("您给的年龄有误");
//        } else {
//            age = a;
//        }
//    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void setName(String n) {
//        name = n;
//    }
    public void setName(String name) {
//        name = name;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

//    成员方法
    public void show() {
        System.out.println(name + ", " +age);
    }
}
