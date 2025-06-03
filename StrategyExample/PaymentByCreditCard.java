package org.example.StrategyExample;

public class PaymentByCreditCard implements PaymentStrategy{

    private CreditCard card;

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using " + card.getCardholder() + "'s card");
        card.setBalance(card.getBalance() - amount);
    }

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard(1098.34, "WVAD", 375, "467587345218567");
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }
}
