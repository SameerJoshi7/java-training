package oops;

import java.util.Scanner;

class Student extends Object {
    int studentId;
    String studentName;
    byte age;

    void acceptInputDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.studentName = input.nextLine();
        System.out.print("Enter Student Id: ");
        this.studentId = input.nextInt();
        System.out.print("Enter Student Age: ");
        this.age = input.nextByte();
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Age: " + age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.acceptInputDetails();
        s1.displayStudentDetails();
    }
}
