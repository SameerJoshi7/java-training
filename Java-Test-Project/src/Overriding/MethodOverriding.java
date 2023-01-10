package Overriding;

import java.util.Scanner;

/**
 * BANK APPLICATION
 * SAVINGS, CURRENT, FD ACCOUNT AND RECURRING ACCOUNT TYPES
 * EVERY ACCOUNT TYPE HAS DEPOSIT, WITHDRAW, BALANCE
 */

abstract class BankAccount extends BOA{
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();
}

abstract class BOA {
    public abstract void openAnAccount();
    public abstract void closeAnAccount();

    BOA(){
        System.out.println("CONSTRUCTOR FOR BANK OF AMERICA");
    }

    void welocome() {
        System.out.println("Welcome to Bank of America");
    }

    static void termsAndConditions() {
        System.out.println("No Terms and Conditions at the moment. You can withdraw amount if you have zero balance in your account. HAPPY BANKING!!!");
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount() {

    }

    @Override
    void deposit() {
        System.out.println("Deposit in Savings Account: ");

    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Savings Account: ");

    }

    @Override
    void balance() {
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

class CurrentAccount extends BankAccount {

    CurrentAccount() {
super(); //Not needed to write this explicitly as super() gets called automatically when a constructor is created.
    }

    @Override
    void deposit() {
        System.out.println("Deposit in Current Account: ");

    }

    @Override
    void withdraw() {
        System.out.println("Withdraw from Savings Account: ");

    }

    @Override
    void balance() {
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

public class MethodOverriding {
    public static void main(String[] args) {
        BOA.termsAndConditions();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1-Open Account 2-Close Account");
        int account = input.nextInt();
        switch (account) {
            case 1:
                System.out.println("Choose 1-Savings Account or 2-Current Account: ");
                int accType = input.nextInt();
                switch (accType) {
                    case 1:
                        SavingsAccount SA = new SavingsAccount();
                        SA.welocome();
                        System.out.print("Choose 1-Deposit 2-Withdraw 3-Balance: ");
                        int operation = input.nextInt();
                        switch (operation) {
                            case 1:
                                SA.deposit();
                                break;
                            case 2:
                                SA.withdraw();
                                break;
                            case 3:
                                SA.balance();
                                break;
                            default:
                                System.out.println("INVALID OPERATION");
                                break;
                        }
                        break;
                    case 2:
                        CurrentAccount CA = new CurrentAccount();
                        CA.welocome();
                        System.out.print("Choose 1-Deposit 2-Withdraw 3-Balance: ");
                        int op = input.nextInt();
                        switch (op) {
                            case 1:
                                CA.deposit();
                                break;
                            case 2:
                                CA.withdraw();
                                break;
                            case 3:
                                CA.balance();
                                break;
                            default:
                                System.out.println("INVALID OPERATION");
                                break;
                        }
                        break;
                    default:
                        System.out.println("INVALID ACCOUNT TYPE");
                        break;
                }
                break;
            case 2:
                System.out.println("Choose 1-Savings Account or 2-Current Account: ");
                int accType1 = input.nextInt();
                switch (accType1) {
                    case 1:
                        System.out.println("Savings Account Closed");
                        break;
                    case 2:
                        System.out.println("Current Account Closed");
                        break;
                    default:
                        System.out.println("INVALID ACCOUNT TYPE");
                        break;
                }
                break;
            default:
                System.out.println("INVALID OPTION");
        }
    }
}
