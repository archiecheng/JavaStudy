package com.archie_05;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
//        public Student(String name)
        Student s2 = new Student("林青霞");
        s2.show();

//        public Student(int age)
        Student s3 = new Student(30);
        s3.show();

//        public Student(String name, int age)
        Student s4 = new Student("林青霞",30);
        s4.show();
    }
}
