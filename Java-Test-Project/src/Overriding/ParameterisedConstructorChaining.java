package Overriding;

class Person {
    private int id;
    private String name;

    Person(){
        this.id = 100;
        this.name = "Steve";
    }

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void displayDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("NAME: " + this.name + "\n");
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

    Employee(String designation, int salary) {
        super(301, "Tony"); // IF WE DON'T DO THIS. PARENT's DEFAULT CONSTRUCTOR GETS CALLED AS WE DID super() in def. constructor. Line 29
        this.designation = designation;
        this.salary = salary;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary + "\n");
    }
}

class Customer extends Person {
    private float amount;
    Customer() {
        super(); //Calls Parent Constructor -- CONSTRUCTOR CHAINING
        this.amount = 5000.32F;
    }

    Customer(float amount) {
        super(301, "Tony"); //Calls Parent Parameterised Constructor -- PARAMETERISED CONSTRUCTOR CHAINING
        this.amount = amount;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Amount: " + this.amount + "\n");
    }
}


public class ParameterisedConstructorChaining {
    public static void main(String[] args) {
        //--- DEFAULT CONSTRUCTOR CHAINING ---
        Person p1 = new Person();
        p1.displayDetails();
        Employee e1 = new Employee();
        e1.displayDetails();
        Customer c1 = new Customer();
        c1.displayDetails();

        //--- PARAMETERISED CONSTRUCTOR CHAINING ---

        Person p2 = new Person(211, "Thor");
        p2.displayDetails();
        Employee e2 = new Employee("Consultant", 100000);
        e2.displayDetails();
        Customer c2 = new Customer(10000.43F);
        c2.displayDetails();
    }
}
