package basic;

import java.awt.*;

public class PrimitiveVSNonPrimitiveTypes {
    public static void main(String[] args) {
        //PRIMITIVES...
        int i1 = 100;
        int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);
        i1 = 200;
        System.out.println(i1);
        System.out.println(i2);

        //NON PRIMITIVES...
        Point p1 = new Point(10, 20);
        Point p2 = p1;
        System.out.println(p1);
        System.out.println(p2);
        p1.x = 30;
        p1.y = 40;
        System.out.println(p1);
        System.out.println(p2);
    }
}
