import java.util.Scanner;
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {
    double interestRate = 5.0; // default interest rate
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned (Savings): " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    double interestRate = 7.0;
    int years;
    void maturityAmount(int years) {
        this.years = years;
        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount (FD): " + maturity);
    }
}
public class CES4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Savings Account");
        SavingAccount sa = new SavingAccount();
        System.out.print("Enter account number: ");
        String acc1 = sc.next();
        System.out.print("Enter name: ");
        String name1 = sc.next();
        System.out.print("Enter initial balance: ");
        double bal1 = sc.nextDouble();
        sa.openAccount(acc1, name1, bal1);
        sa.deposit(1000);
        sa.withdraw(500);
        sa.checkBalance();
        sa.calculateInterest();
        System.out.println("\nFixed Deposit Account");
        FixedDepositAccount fd = new FixedDepositAccount();
        System.out.print("Enter account number: ");
        String acc2 = sc.next();
        System.out.print("Enter name: ");
        String name2 = sc.next();
        System.out.print("Enter initial deposit: ");
        double bal2 = sc.nextDouble();
        fd.openAccount(acc2, name2, bal2);
        System.out.print("Enter FD years: ");
        int years = sc.nextInt();
        fd.maturityAmount(years);
        sc.close();
    }
}
