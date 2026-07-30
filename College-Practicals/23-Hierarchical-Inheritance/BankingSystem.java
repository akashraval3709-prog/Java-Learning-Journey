import java.util.Scanner;


class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBaseInfo() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Base Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); 
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("\n---Savings Account Details ---");
        displayBaseInfo(); 
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Yearly Interest Amount: ₹" + interest);
    }
}


class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance); 
        this.overdraftLimit = overdraftLimit;
    }

    void displayCurrentDetails() {
        System.out.println("\n---Current Account Details ---");
        displayBaseInfo(); 
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}


public class program_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Hierarchical Inheritance: Banking System ===\n");

       
        System.out.println("--- Enter Savings Account Details ---");
        System.out.print("Enter Account Number: ");
        String saAccNo = input.nextLine();

        System.out.print("Enter Balance: ");
        double saBal = input.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double saRate = input.nextDouble();
        input.nextLine(); 

       
        SavingsAccount sa = new SavingsAccount(saAccNo, saBal, saRate);

      
        System.out.println("\n--- Enter Current Account Details ---");
        System.out.print("Enter Account Number: ");
        String caAccNo = input.nextLine();

        System.out.print("Enter Balance: ");
        double caBal = input.nextDouble();

        System.out.print("Enter Overdraft Limit: ");
        double caLimit = input.nextDouble();

       
        CurrentAccount ca = new CurrentAccount(caAccNo, caBal, caLimit);

       
        sa.calculateInterest();
        ca.displayCurrentDetails();

        input.close();
    }
}
