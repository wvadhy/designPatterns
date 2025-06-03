package org.example.StrategyExample;

public class PaymentByPaypal implements PaymentStrategy{

    private String email;
    private String password;

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Paypal!");
    }

    @Override
    public void collectPaymentDetails() {
        email = "...";
        password = "***";
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }
}
