package inheritance;

import models.Student;

import java.util.Scanner;

public class Marks extends Student {
    private float objectiveMarks;
    private float subjectiveMarks;
    float totalMarks;

    public void acceptInputDetails(){
        super.acceptInputDetails(); //Its parents acceptDetails will be run
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subjectiveMarks: ");
        subjectiveMarks = input.nextFloat();
        System.out.print("Enter objectiveMarks: ");
        objectiveMarks = input.nextFloat();
    }

    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("subjectiveMarks: " + subjectiveMarks);
        System.out.println("objectiveMarks: " + objectiveMarks);
        totalMarks = subjectiveMarks+objectiveMarks;
        System.out.println("Total Marks scored: " + totalMarks);

    }


}
