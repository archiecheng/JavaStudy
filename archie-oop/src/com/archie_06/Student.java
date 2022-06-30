package com.archie_06;

// 学生 JavaBean
// private 变量
// setXXX() getXXX()
// 提供一个无参构造方法
public class Student {
    private String name;
    private int age;

    public Student() {}

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
