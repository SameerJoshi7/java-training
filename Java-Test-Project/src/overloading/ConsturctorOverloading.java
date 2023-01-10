package overloading;

class Person {

    private String name;
    private String gender;
    private int age;

    Person() {      // DEFAULT CONSTRUCTOR
        this.name = "Steve";
        this.gender = "Male";
        this.age = 40;
    }

    Person(String name, String gender, int age) {   // PARAMETERISED CONSTRUCTOR
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name: " + this.name + "\ngender: " + this.gender + "\nage: " + this.age;
    }

}

public class ConsturctorOverloading {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("Default constructor called:\n" + p1.toString());
        Person p2 = new Person("Tony", "Male", 35);
        System.out.println("Parameterised constructor called:\n" + p2.toString());
    }
}
