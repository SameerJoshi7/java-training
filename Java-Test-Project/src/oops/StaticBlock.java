package oops;


import java.util.Scanner;

class StudentData {

    String studentName;
    int studentId;
    int studentAge;
    static String universityName;  // This is a Static Variable | Class Variable | Static Data member

    static { //Static block where static Data Members are initialized
        universityName = "Jawaharlal Nehru Technological University";
    }
    void acceptInputDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.studentName = input.nextLine();
        System.out.print("Enter Student Id: ");
        this.studentId = input.nextInt();
        System.out.print("Enter Student Age: ");
        this.studentAge = input.nextByte();
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student Age: " + studentAge);
        System.out.println("University Name: " + universityName);
    }

}
public class StaticBlock {
    public static void main(String[] args) {
        StudentData s1 = new StudentData();
        s1.acceptInputDetails();
        s1.displayStudentDetails();

        StudentData.universityName = "JNTU Hyderabad";
        StudentData s2 = new StudentData();
        s2.acceptInputDetails();
        s2.displayStudentDetails();
    }
}
