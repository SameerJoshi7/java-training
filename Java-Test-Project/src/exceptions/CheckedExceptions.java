package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("/Users/sameerjoshi/Downloads/how_is_the_interest_calculated.pdf");
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
