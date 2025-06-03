package org.example.StrategyExample;

public interface PaymentStrategy {

    void pay(int amount);
    void collectPaymentDetails();
    boolean validatePaymentDetails();

}
