import java.util.ArrayList;
import java.util.List;

public class OffshoreReport {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John", "Doe", 5000, false));
        employees.add(new Employee("Jane", "Smith", 6000, true));
        employees.add(new Employee("Mike", "Johnson", 4500, true));
        employees.add(new Employee("Emily", "Davis", 5500, false));


    }
    private static List<Employee> filterOffshoreEmployees(List<Employee> employees) {
        List<Employee> offshoreEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.isOffshore()) {
                offshoreEmployees.add(employee);
            }
        }

        return offshoreEmployees;
    }

    private static void generateReport(List<Employee> employees) {
        System.out.println("Offshore Employees Report:");
        System.out.println("-----------------------------------");
        System.out.println("Name\t\tSalary");
        System.out.println("-----------------------------------");

        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + "\t" + employee.getSalary());
        }
    }
}
