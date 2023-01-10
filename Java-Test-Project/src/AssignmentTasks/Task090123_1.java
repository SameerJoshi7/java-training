package AssignmentTasks;

import java.util.Scanner;

class StudentDetail {
    private String name;
    private int age;
    private String email;
    private int rollNo;

    public StudentDetail(String name, int age, String email, int rollNo) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.rollNo = rollNo;
    }
    public String displayEntries() {
        return "\nName: " + name + "\nAge: " + age + "\nEmail: " + email + "\nRollNo: " + rollNo;
    }
}

public class Task090123_1{
    public static void main(String[] args) {
        int arraySize;
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        arraySize = input.nextInt();
        StudentDetail[] students = new StudentDetail[arraySize]; //Created Array of Objects... type-StudentDetail

        for(int i=0; i<arraySize; i++) {
            System.out.println(i+1+". Enter Student Details");
            System.out.print("name: ");
            String name = input.next();
            System.out.print("email: ");
            String email = input.next();
            System.out.print("age: ");
            int age = input.nextInt();
            System.out.print("rollNo: ");
            int rollNo = input.nextInt();
            students[i] = new StudentDetail(name, age, email, rollNo);
        }
        for(int i=0; i<arraySize; i++) {
            int count = i+1;
            System.out.println("Entered Student " + count + " Details: "+students[i].displayEntries());
        }
    }
}
