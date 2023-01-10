package inheritance;

import java.util.Scanner;

public class Sports extends Marks{
    private int score;
    public void acceptInputDetails(){
        super.acceptInputDetails();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the runs Scored by player "+ Marks.studentName + ": ");
        score = input.nextInt();
    }
    public void displayStudentDetails(){
        super.displayStudentDetails();
        System.out.println(Marks.studentName+" scored "+score+" runs");
    }
}
