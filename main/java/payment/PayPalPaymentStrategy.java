package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "Please enter your Pay Pal info: ";
    }
}
