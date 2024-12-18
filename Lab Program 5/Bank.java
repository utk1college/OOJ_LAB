import java.util.Scanner;

class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    Account(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    private static final double INTEREST_RATE = 0.05;

    SavAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    void computeAndDepositInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurAcct extends Account {
    private static final double MINIMUM_BALANCE = 1000;
    private static final double PENALTY = 100;

    CurAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            if (balance < MINIMUM_BALANCE) {
                balance -= PENALTY;
                System.out.println("Penalty imposed: " + PENALTY);
            }
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Savings Account");
        System.out.print("Enter account holder name: ");
        String savName = sc.nextLine();
        System.out.print("Enter account number: ");
        String savAccNo = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double savBalance = sc.nextDouble();
        SavAcct savingsAccount = new SavAcct(savName, savAccNo, savBalance);

        System.out.println("Account Holder: " + savingsAccount.customerName);
        System.out.println("Account Number: " + savingsAccount.accountNumber);
        System.out.println("Balance: " + savingsAccount.balance);
        savingsAccount.computeAndDepositInterest();
        System.out.println("Account Holder: " + savingsAccount.customerName);
        System.out.println("Account Number: " + savingsAccount.accountNumber);
        System.out.println("Balance: " + savingsAccount.balance);

        System.out.println("\nCurrent Account");
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String curName = sc.nextLine();
        System.out.print("Enter account number: ");
        String curAccNo = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double curBalance = sc.nextDouble();
        CurAcct currentAccount = new CurAcct(curName, curAccNo, curBalance);

        System.out.println("Account Holder: " + currentAccount.customerName);
        System.out.println("Account Number: " + currentAccount.accountNumber);
        System.out.println("Balance: " + currentAccount.balance);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        currentAccount.withdraw(withdrawAmount);
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        currentAccount.deposit(depositAmount);

        System.out.println("Account Holder: " + currentAccount.customerName);
        System.out.println("Account Number: " + currentAccount.accountNumber);
        System.out.println("Balance: " + currentAccount.balance);

        System.out.println("\nUTKRISHT UMANG\n1BM23ET056");
        sc.close();
    }
}
