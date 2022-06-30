package com.archie_06;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s.getAge()+ ","+s.getName());
    }
}
