public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(2500);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(1500);

    }
}