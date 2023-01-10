package oops;

import java.util.Scanner;

class Students extends Object {
    int studentId;
    String studentName;
    int age;

    //CONSTRUCTOR 1
    Students() {
        this.studentName = "Avengers";
        this.studentId = 123;
        this.age = 66;
    }

    //----- A CLASS CAN HAVE MULTIPLE CONSTRUCTORS, BUT NO TWO CONSTRUCTORS SHOULD HAVE SIMILAR SIGNATURES ------
    //CONSTRUCTOR 2
    Students(String name, int id, int age) {
        this.studentName = name;
        this.studentId = id;
        this.age = age;
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Age: " + age);
    }
}


public class ClassConstructor {

    public static void main(String[] args) {

        Students s0 = new Students(); // Default Constructor is called here
        s0.displayStudentDetails();

        Students s1;
        s1 = new Students("Tony Stark", 545, 26); // Parameterized Constructor gets called...
        s1.displayStudentDetails();
    }
}
