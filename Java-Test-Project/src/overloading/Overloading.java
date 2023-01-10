package overloading;


class Calculation {

    //    This is an example for method overloading, with which memory optimization technique is achieved...
    //    Method overloading can be achieved with the different method signatures -
    //    Types of Parameters
    //    Number of Parameters
    //    Sequence of Parameters
    void addition(int n1, int n2) {
        System.out.println("Addition of two 2 int nums: " + (n1+n2));
    }

    void addition(float n1, float n2) {
        System.out.println("Addition of two 2 float nums: " + (n1+n2));
    }

    void addition(int n1, int n2, int n3) {
        System.out.println("Addition of two 3 int nums: " + (n1+n2+n3));
    }

    void addition(int n1, float n2) {
        System.out.println("Addition of int and float nums: " + (n1+n2));
    }

    void addition(float n2, int n1) {
        System.out.println("Addition of int and float nums: " + (n1+n2));
    }


    //   --- Overloading is not possible for different return types -- Comment out the above methods to check the below methods ---
    //    Such as
    /** int addition(int n1, int n2) {
           return n1+n2;
        }
        float addition(int n1, int n2) {
            return n1+n2
        } */

    // --- Problems we might face in achieving method overloading ---

    /**   void addition(int n1, int n2) {                           // IN THIS CASE OF TWO OVERLOADED FUNCTIONS (int, int) and (byte, byte) --
             System.out.println("Addition of ints: " + (n1+n2));    //ONLY (int, int) GETS EXECUTED BCOZ BYTE INTERNALLY CONVERTS OR
        }                                                           // CONSIDERED AS INT. THIS NEEDS TO BE TAKEN CARE BY US. HAVE NO SOLUTION FOR THIS.
        void addition(byte n1, byte n2) {
           System.out.println("Addition of bytes: " + (n1+n2));
       } */


}
public class Overloading {
    public static void main(String[] args) {

        Calculation cal = new Calculation();
        cal.addition(3,5);
        cal.addition(3.5F, 5.7F);
        cal.addition(5,10,15);
        cal.addition(5, 8.4F);
        cal.addition(4.4F, 10);
    }
}
