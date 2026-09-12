interface PaymentMethod {
    void processMethod(double amount);
}
class CreditCard implements PaymentMethod {
    public void processMethod(double amount) {
        System.out.println("Payment success by Credit card of $"+amount);
    }
}
class UPIPayment implements PaymentMethod {
    public void processMethod(double amount) {
        System.out.print("Payment by UPI of $"+amount);
    }
}
public class InterfaceClass {
    public static void main(String [] arg) {
        CreditCard obj1 = new CreditCard();
        obj1.processMethod(100);
    }
}