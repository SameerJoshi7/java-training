package interfaces;

interface IBOA {
    void openAnAccount();
    void closeAnAccount();
}
interface IBankAccount {
    void deposit();
    void withdraw();
    void balance();

    static void welcome() {             // Non Abstract methods cannot be added inside an interface.. need to be a static method or it should be a default methods
        System.out.println("Welcome");
    }
    default void terms() {
        System.out.println("These are terms and conditions");
    }
}

class SavingsAccount implements IBankAccount, IBOA {

    SavingsAccount() {

    }

    @Override
    public void deposit() {
        System.out.println("Deposit in Savings Account: ");

    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from Savings Account: ");

    }

    @Override
    public void balance() {
        System.out.println("Balance in Savings Account: ");

    }

    @Override
    public void openAnAccount() {
        System.out.println("Open a Savings Account");
    }

    @Override
    public void closeAnAccount() {
        System.out.println("Close a Savings Account");
    }
}

class CurrentAccount implements IBankAccount, IBOA {

    CurrentAccount() {
        super(); //Not needed to write this explicitly as super() gets called automatically when a constructor is created.
    }

    @Override
    public void deposit() {
        System.out.println("Deposit in Current Account: ");

    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from Savings Account: ");

    }

    @Override
    public void balance() {
        System.out.println("Balance in Current Account: ");

    }

    @Override
    public void openAnAccount() {
        System.out.println("Open a Current Account");
    }

    @Override
    public void closeAnAccount() {
        System.out.println("Close a Current Account");
    }
}



public class InterfaceEx {
    public static void main(String[] args) {
        IBankAccount.welcome();
        SavingsAccount s1 = new SavingsAccount();
        s1.deposit();
        s1.balance();
        s1.openAnAccount();
        s1.closeAnAccount();
        s1.withdraw();
        s1.terms();
    }
}
