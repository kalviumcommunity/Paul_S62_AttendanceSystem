package com.school;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Teajuice");
        Student s2 = new Student("Joshua kuttan");
        Student s3 = new Student("kiesha");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("History");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
