package type_casting;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        int intVal = 100;
        //Automatic or implicit type casting to long type...
        long longVal = intVal;
        //Automatic or implicit type casting to double type...
        double doubleVal = longVal;

        System.out.println(intVal);
        System.out.println(longVal);
        System.out.println(doubleVal);
    }
}
