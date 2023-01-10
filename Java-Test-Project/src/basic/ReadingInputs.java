package basic;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //This is to scan the user entered inputs.
        System.out.print("Enter your Fullname: ");
        String name = input.nextLine();
        System.out.print("gender: ");
        char gender = input.next().charAt(0);
        System.out.print("age: ");
        byte age = input.nextByte();
        System.out.print("Bonus Amount: ");
        float bonus = input.nextFloat();

        System.out.println("Please check the details you entered");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Bonus Amount: " + bonus);
    }
}
