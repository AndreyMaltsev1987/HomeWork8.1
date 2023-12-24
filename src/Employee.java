public class Employee {
    private String name;
    private PaymentType paymentType;
    private double amount;

    public Employee(String name, PaymentType paymentType, double amount) {
        this.name = name;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public double getAmount() {
        return amount;
    }
    enum PaymentType {
        STAVKA, POCHASOVAYA, SDELNAYA
    }
}
