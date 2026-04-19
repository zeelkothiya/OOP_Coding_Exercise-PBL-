//AIM
/*Define a base class BankAccount with common attributes like accountNumber,
accountHolderName, and balance. Then, define two subclasses: SavingAccount and
FixedDepositAccount, which inherit from BankAccount. Implement basic operations like
openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The SavingAccount
should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount
should have a maturityAmount() method considering fixed deposit terms. */

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance * Math.pow(1.06, years);
    }
}

public class practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        SavingAccount s = new SavingAccount();
        s.openAccount(acc, name, bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        s.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        s.withdraw(wd);

        s.checkBalance();
        System.out.println("Interest: " + s.calculateInterest());

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(acc + 1, name, bal);

        System.out.print("Enter years for FD: ");
        int years = sc.nextInt();
        System.out.println("Maturity Amount: " + f.maturityAmount(years));
    }
}
