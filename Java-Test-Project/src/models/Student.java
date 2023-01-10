package models;
import java.util.Scanner;

public class Student {

    public static String studentName;
    private int studentId;
    private int studentAge;
    private static String universityName;


    static {
        universityName = "Jawaharlal Nehru Technological University";
    }
    public void acceptInputDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.studentName = input.nextLine();
        System.out.print("Enter Student Id: ");
        this.studentId = input.nextInt();
        System.out.print("Enter Student Age: ");
        this.studentAge = input.nextByte();
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Age: " + studentAge);
        System.out.println("University Name: " + universityName);
    }

}