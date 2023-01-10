package AssignmentTasks.DateOn020123;
import java.util.*;

interface IBankOperations {
    void deposit(float amount);
    void withdraw(float amount);
    void balance();
}

class SavingsAccount implements IBankOperations {

    public static float savingBalance;
    public static float debitedAmount;

    @Override
    public void deposit(float amount) {
        System.out.println("Your Savings account balance: Rs "+savingBalance);
    }

    @Override
    public void withdraw(float amount) {
        if (amount > savingBalance) System.out.println("Insufficient Funds");
        else if(amount > 20_000 || debitedAmount > 20000) System.out.println("You cannot withdraw more than Rs 20,000 in a day.");
        else System.out.println("You successfully withdrawn: Rs "+amount);
        System.out.println("Your Savings account balance: Rs "+savingBalance);
    }

    @Override
    public void balance() {
        System.out.println("Your Savings account balance: Rs "+savingBalance);
//        System.out.println("DEBITS: Rs "+debitedAmount); JUST TO CHECK
    }

}

class CurrentAccount implements IBankOperations {

    public static float currentBalance;

    @Override
    public void deposit(float amount) {
        System.out.println("Your Savings account balance: Rs "+currentBalance);
    }

    @Override
    public void withdraw(float amount) {
        if (amount > currentBalance) System.out.println("Insufficient Funds");
        else System.out.println("You successfully withdrawn: Rs "+amount);
        System.out.println("Your Savings account balance: Rs "+currentBalance);
    }

    @Override
    public void balance() {
        System.out.println("Your Savings account balance: Rs "+currentBalance);
    }
}


public class Task100123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Kitty Bank");
            System.out.print("Choose below option to proceed\n1 for Savings Account\n2 for Current Account\nType any number to Exit ");
            int accType = input.nextInt();
            boolean enter = true;
            while (enter) {
                switch (accType) {
                    case 1:
                        SavingsAccount savings = new SavingsAccount();
                        System.out.print("\nChoose 1-Deposit 2-Withdraw 3-Balance 4-Back: ");
                        int operation = input.nextInt();
                        switch (operation) {
                            case 1:
                                System.out.print("Enter Amount to deposit: ");
                                float savingDepositAmount = input.nextFloat();
                                SavingsAccount.savingBalance += savingDepositAmount;
                                savings.deposit(savingDepositAmount);
                                break;
                            case 2:
                                System.out.print("Enter Amount to withdraw: ");
                                float savingWithdrawAmount = input.nextFloat();
                                if(SavingsAccount.savingBalance-savingWithdrawAmount >= 0 && SavingsAccount.debitedAmount+savingWithdrawAmount <= 20000)
                                    SavingsAccount.savingBalance -= savingWithdrawAmount;
                                SavingsAccount.debitedAmount += savingWithdrawAmount;
                                savings.withdraw(savingWithdrawAmount);
                                if(SavingsAccount.debitedAmount > 20000) SavingsAccount.debitedAmount -= savingWithdrawAmount;
                                break;
                            case 3:
                                savings.balance();
                                break;
                            case 4:
                                enter = false;
                                break;
                            default:
                                System.out.println("INVALID OPERATION");
                                break;
                        }
                        break;
                    case 2:
                        CurrentAccount current = new CurrentAccount();
                        System.out.print("\nChoose 1-Deposit 2-Withdraw 3-Balance 4-Back: ");
                        int mode = input.nextInt();
                        switch (mode) {
                            case 1:
                                System.out.print("Enter Amount to deposit: ");
                                float currentDepositAmount = input.nextFloat();
                                CurrentAccount.currentBalance += currentDepositAmount;
                                current.deposit(currentDepositAmount);
                                break;
                            case 2:
                                System.out.print("Enter Amount to withdraw: ");
                                float currentWithdrawAmount = input.nextFloat();
                                if(CurrentAccount.currentBalance-currentWithdrawAmount >= 0)
                                    CurrentAccount.currentBalance -= currentWithdrawAmount;
                                current.withdraw(currentWithdrawAmount);
                                break;
                            case 3:
                                current.balance();
                                break;
                            case 4:
                                enter = false;
                                break;
                            default:
                                System.out.println("INVALID OPERATION");
                                break;
                        }
                        break;
                    default:
                        System.out.println("You successfully exited the process");
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
