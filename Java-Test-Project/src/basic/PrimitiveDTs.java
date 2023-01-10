package basic;

public class PrimitiveDTs {
    public static void main(String[] args) {
        byte b = 25;
        short s = 1000;
        int i = 123_456_789; // use _ for better readability....
//        int l = 12345678901   // Cannot be possible with int....
        long l = 12345678901L;
        float f = 123.12F;
        double d = 123.12345;
        char c = 'a';
        boolean bool = true;
        System.out.println("------All the Variables here------" +
                "byte--->" +b+
                "short-->" +s+
                "int---->" +i+
                "long--->" +l+
                "float-->" +f+
                "double->" +d+
                "char--->" +c+
                "boolean->" +bool
        );
    }
}
