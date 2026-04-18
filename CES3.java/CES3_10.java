import java.util.Scanner;
class BankAccount {
    String accountHolderName;
    double balance;
    static double interestRate = 5.0; // default interest rate
    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }
    void display() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter balance: ");
        double bal1 = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("\nEnter second account holder name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter balance: ");
        double bal2 = sc.nextDouble();
        BankAccount acc1 = new BankAccount(name1, bal1);
        BankAccount acc2 = new BankAccount(name2, bal2);
        System.out.println("\n--- Before Interest Rate Update ---");
        acc1.display();
        acc2.display();
        System.out.print("\nEnter new interest rate: ");
        double newRate = sc.nextDouble();
        BankAccount.updateInterestRate(newRate);
        System.out.println("\n--- After Interest Rate Update ---");
        acc1.display();
        acc2.display();
        sc.close();
    }
}
