package overloading;

public class MainMethodOverloading {
    public static void main(String[] args) { //This is the main method that's executed first
        System.out.println("This is my main method");
        MainMethodOverloading.main("Hey");
    }

    public static void main(String args) { // then this is called, since we called it in line 6.
        System.out.println("This is my overloaded main method with one String arg.");
        MainMethodOverloading.main("Hey", "There");
    }

    public static void main(String args1, String args2) { // at last this is called, since we called in line 11.
        System.out.println("This is my overloaded main method with two String args.");
    }
}
