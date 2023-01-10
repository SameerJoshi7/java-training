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
        this.amount = 5000.32F;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Amount: " + this.amount);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.displayDetails();

        Employee e1 = new Employee();
        e1.displayDetails();

        Customer c1 = new Customer();
        c1.displayDetails();
    }
}
*/