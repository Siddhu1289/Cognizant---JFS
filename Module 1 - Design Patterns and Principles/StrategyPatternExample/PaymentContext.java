public class PaymentContext {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(double amount) {

        if (strategy != null) {
            strategy.pay(amount);
        } else {
            System.out.println("No Payment Strategy Selected");
        }

    }
}