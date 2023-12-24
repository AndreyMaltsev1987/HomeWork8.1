import java.util.ArrayList;
import java.util.List;

public class PayrollCalculator {

    private List<Employee> employees;

    public PayrollCalculator() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void generateReport() {
        System.out.println("ФИО\t\tНалог, %\tСумма (грн)\t\tК оплате (грн/тугрики)\tКурс 1/8");
        System.out.println("---------------------------------------------------------------");

        for (Employee employee : employees) {
            double taxPercentage = getTaxPercentage(employee.getPaymentType());
            double taxAmount = employee.getAmount() * (taxPercentage / 100);
            double amountToPay = employee.getAmount() - taxAmount;

            System.out.print(employee.getName() + "\t\t" + taxPercentage + "\t\t" + employee.getAmount() + "\t\t" + amountToPay);

            if (employee.getPaymentType() == Employee.PaymentType.STAVKA.POCHASOVAYA) {
                double currencyAmount = amountToPay/ 8;
                System.out.print("\t\t" + currencyAmount);
            }

            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");
    }

    private double getTaxPercentage(Employee.PaymentType paymentType) {
        switch (paymentType) {
            case STAVKA:
            case POCHASOVAYA:
                return 20;
            case SDELNAYA:
                return 15;
            default:
                return 0;
        }
    }
}


