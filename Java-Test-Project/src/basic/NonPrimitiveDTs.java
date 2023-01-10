package basic;

import java.util.Date;

public class NonPrimitiveDTs {
    public static void main(String[] args) {
        String msg = "This is a string";
        System.out.println(msg);

        Date now = new Date();
        System.out.println(now.getTime());

        System.out.println(msg.startsWith("This"));
        System.out.println(msg.length());
        System.out.println(msg.replace("a string", "an extended string"));

        String new_msg = "This is a new message with some extra characters in it. \n Allow me introduce myself first. \t\t I'm Sameer Joshi";
        System.out.println(new_msg);

    }
}
