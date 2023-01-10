package type_casting;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double doubleVal = 100.645;
        //explicit type casting from double type to long type...
        long longVal = (long) doubleVal;
        //explicit type casting from long type to int type...
        int intVal = (int) longVal;
        System.out.println(doubleVal);
        System.out.println(longVal);
        System.out.println(intVal);
    }
}
