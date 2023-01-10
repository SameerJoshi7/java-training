/**
package Overriding;

class Person {
    private int id;
    private String name;

    Person(){
        this.id = 100;
        this.name = "Steve";
    }
    void displayDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("NAME: " + this.name);
    }
}

class Employee extends Person {
    private String designation;
    private int salary;

    Employee() {
        super(); //Calls Parent Constructor -- CONSTRUCTOR CHAINING
        this.designation = "Senior Software Engineer";
        this.salary = 500000;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}

class Customer extends Person {
    private float amount;
    Customer() {
        super(); //Calls Parent Constructor -- CONSTRUCTOR CHAINING
        this.amount = 5000.32F;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Amount: " + this.amount);
    }
}
public class DefaultConstructorChaining {
}
*/