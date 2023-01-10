package exceptions;

class ArithmeticOperation {
    public void Exception1(int n1, int n2) {
        try{
            int div = n1/n2;
            System.out.println("division: " + div);
        } catch(Exception e) {
            System.out.println("exception caught");
            System.out.println(e.getMessage());
            System.out.println(e.getCause()); // prints the cause of exception
            System.out.println(e.toString());
            e.getStackTrace(); // Prints where exception caused and where it ended.
        }
    }

    public void Exception2() {
        int arr[] = {1,2,3,4,5,6};
        try{
            int div = 50/5;
            System.out.println("division: " + div);
            System.out.println("find element in an array"+ arr[7]);
        } catch(ArithmeticException AE) {
            System.out.println("AE caught");
            System.out.println(AE.getMessage());
        } catch(ArrayIndexOutOfBoundsException AIOE) {
            System.out.println("AIOE caught");
            System.out.println(AIOE.getMessage());
        }
    }

    public void Exception3(int n1, int n2) {
        int res = 0;
        try{
            res = n1/n2;
        } finally {
            System.out.println("Division result: " + res);
            System.out.println("Entered finally block");
        }
        System.out.println("this is displayed outside exception handling block ");
    }
}

class AgeException extends Exception {
    AgeException() {
        super("You're not eligible to vote");
    }
    AgeException(String msg) {
        super(msg);
    };
}

public class Exceptions {
    static void validateAge(int age) throws AgeException {
        if(age >= 18) System.out.println("You're eligible to vote");
        else throw new AgeException("You're not eligible to vote");
    }
    public static void main(String[] args) {
        ArithmeticOperation arithOp = new ArithmeticOperation();
        arithOp.Exception1(2,0);
        arithOp.Exception2();
        arithOp.Exception3(5,0);
        try{
            validateAge(18);
        } catch(AgeException AE) {
            System.out.println(AE.getMessage());
        }
    }
}
