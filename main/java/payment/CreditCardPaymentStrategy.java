package payment;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "Enter your Credit Card info: ";
    }
}
