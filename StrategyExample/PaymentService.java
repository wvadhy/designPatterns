package org.example.StrategyExample;

public class PaymentService {

    private final int cost = 100;
    private boolean includeDelivery;

    private PaymentStrategy strategy;

    void processOrder(){
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()){
            strategy.pay(getTotal());
        }
    }

    void setStrategy(PaymentStrategy p){
        strategy = p;
    }
    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
