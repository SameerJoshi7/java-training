package Arrays;

import java.util.Scanner;

public class IterateOverArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Count: ");
        int size = input.nextInt();
        String names[] = new String[size];
        // for loop...
        System.out.println("There are " + size + " employees in the project");
        for(int i=0;i<size;i++) {
            System.out.println("Enter employee " + i);
            names[i] = input.nextLine();

        }
        //ForEach loop...
        for(String name: names) {
            System.out.println("name----->>> " + name);
        }
    }
}
