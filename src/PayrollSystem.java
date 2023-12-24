import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayrollSystem {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new FixedSalaryEmployee("Иванов", 3000, 20));
        employees.add(new HourlySalaryEmployee("Сидоров", 40, 200));
        Map<String, Integer> works = new HashMap<String, Integer>();
        works.put("Работа 1", 2000);
        works.put("Работа 2", 3500);
        employees.add(new PieceworkEmployee("Петров", works));

        System.out.println("ФИО\t\tВид оплаты\tСумма");
        for (Employee employee : employees) {
            System.out.println(employee.name + "\t\t" +
                    getPaymentType(employee) + "\t" +
                    employee.calculateSalary());
        }
    }

    private static String getPaymentType(Employee employee) {
        if (employee instanceof FixedSalaryEmployee) {
            return "ставка";
        } else if (employee instanceof HourlySalaryEmployee) {
            return "почасовая";
        } else if (employee instanceof PieceworkEmployee) {
            return "сдельная";
        }
        return "";
    }

}
