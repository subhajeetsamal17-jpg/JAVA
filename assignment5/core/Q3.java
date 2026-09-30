import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;

    Account(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Account Number : " + accountNumber);
    }
}

class Savings_Account extends Account {
    double min_bal;
    double saving_bal;

    Savings_Account(String customerName, int accountNumber,
                    double min_bal, double saving_bal) {
        super(customerName, accountNumber);
        this.min_bal = min_bal;
        this.saving_bal = saving_bal;
    }

    void show() {
        super.display();
        System.out.println("Minimum Balance : " + min_bal);
        System.out.println("Saving Balance  : " + saving_bal);
    }
}

class Account_details extends Savings_Account {
    double deposit;
    double withdrawl;

    Account_details(String customerName, int accountNumber,
                    double min_bal, double saving_bal,
                    double deposit, double withdrawl) {

        super(customerName, accountNumber, min_bal, saving_bal);
        this.deposit = deposit;
        this.withdrawl = withdrawl;
    }

    void show1() {
        show();
        System.out.println("Deposit         : " + deposit);
        System.out.println("Withdrawal      : " + withdrawl);
        System.out.println("Final Balance   : " +
                           (saving_bal + deposit - withdrawl));
    }
}

public class Q3 {
    public static void main(String[] args) {

        Account_details customer = new Account_details(
                "Puchu",
                1001,
                1000,
                5000,
                3000,
                1500
        );

        System.out.println("--- CUSTOMER ACCOUNT DETAILS ---");
        customer.show1();
    }
}