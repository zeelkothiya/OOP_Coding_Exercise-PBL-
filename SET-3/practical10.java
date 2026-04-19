//AIM
/*Design a class BankAccount with account_holder_name and balance. Use a static variable
interest_rate (same for all accounts). Include methods to calculate and display the interest earned.
Update interest rate using a static method. */

import java.util.Scanner;

class practical10 {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        BankAccount b1 = new BankAccount(name, bal);
        b1.display();

        System.out.print("Enter new interest rate: ");
        double rate = sc.nextDouble();

        BankAccount.updateInterestRate(rate);
        b1.display();
    }
}
