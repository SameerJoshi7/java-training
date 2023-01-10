package inheritance;

public class Result extends Sports {
    public void calculateStudentResult(){
        acceptInputDetails();
        displayStudentDetails();
        String passed = "congratulations!, you made it. YOU'VE CLEARED THIS ROUND";
        String failed = "Sorry!! YOU DIDN'T MAKE IT. Better luck next time";
        if( this.totalMarks >=75) System.out.println(passed.toUpperCase());
        else System.out.println(failed.toUpperCase());
    }
}
