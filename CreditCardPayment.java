interface Payment {
    void pay(double amount);
}

class CreditCardPayment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class NetBankingPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(500);

        p = new NetBankingPayment();
        p.pay(2000);
    }
}
