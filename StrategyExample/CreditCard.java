package org.example.StrategyExample;

public class CreditCard {

    private Double balance;
    private String cardholder;
    private Integer cvc;
    private String number;

    public CreditCard(Double balance, String cardholder, Integer cvc, String number){
        this.balance = balance;
        this.cardholder = cardholder;
        this.cvc = cvc;
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getCvc() {
        return cvc;
    }

    public String getNumber() {
        return number;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
