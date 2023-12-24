import java.util.ArrayList;
import java.util.List;

public class PayrollReport {

    public static void main(String[] args) {
        List employees = new ArrayList();
        employees.add(new Employee("Иванов", "Ставка", 3000));
        employees.add(new Employee("Сидоров", "Почасовая", 800));
        employees.add(new Employee("Петров", "Сдельная", 5500));
        System.out.println("ФИО\tНалог, %\tСумма (грн)\tК оплате (грн)");

        for (Object employee : employees) {
        }
        double tax = 0.0;
        Employee employee = null;
        if (employee.getType().equals("Ставка") || employee.getType().equals("Почасовая")) {
            tax = 0.2;
        } else if (employee.getType().equals("Сдельная")) {
            tax = 0.15;
        }
        double taxAmount = employee.getSalary() * tax;
        double amountToPay = employee.getSalary() - taxAmount;
        System.out.println(employee.getName() + "\t" + (tax * 100) + "\t\t" + employee.getSalary() + "\t\t" + amountToPay);
    }
}
