class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void displayDetails() {
        System.out.println("Savings Account");
        super.displayDetails();
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void displayDetails() {
        System.out.println("Current Account");
        super.displayDetails();
    }
}

// Payment interface
interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("UPI Payment: Rs." + amount);
    }

    void verifyPayment() {
        System.out.println("UPI Payment Verified");
    }
}

class CardPayment implements Payment, OnlineTransaction {
    public void pay(double amount) {
        System.out.println("Card Payment: Rs." + amount);
    }
}

// Tagging interface
interface OnlineTransaction {
}

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism
        Account a;

        a = new SavingsAccount(101, 50000);
        a.displayDetails();

        System.out.println();

        a = new CurrentAccount(102, 75000);
        a.displayDetails();

        System.out.println();

        // Payment
        Payment p;

        p = new UPIPayment();
        p.pay(2000);

        UPIPayment u = new UPIPayment();
        u.verifyPayment();

        p = new CardPayment();
        p.pay(5000);

        System.out.println();

        // instanceof
        if (p instanceof OnlineTransaction) {
            System.out.println("Online Transaction");
        }
    }
}
