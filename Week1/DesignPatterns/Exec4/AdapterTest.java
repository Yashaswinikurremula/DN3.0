

public class AdapterTest {

    public static void main(String[] args) {
        // Using PayPal through the adapter
        PaymentProcessor payPalProcessor = new PayPalAdapter();
        payPalProcessor.processPayment(100.00);

        // Using Stripe through the adapter
        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(250.00);
    }
}
