public class Task04 {

    public static void main(String[] args) {
        PayrollCalculator payrollCalculator = new PayrollCalculator();

        Employee employee1 = new Employee("Иванов", Employee.PaymentType.STAVKA, 3000);
        Employee employee2 = new Employee("Сидоров", Employee.PaymentType.POCHASOVAYA, 800);
        Employee employee3 = new Employee("Петров", Employee.PaymentType.SDELNAYA, 5500);

        payrollCalculator.addEmployee(employee1);
        payrollCalculator.addEmployee(employee2);
        payrollCalculator.addEmployee(employee3);

        payrollCalculator.generateReport();


    }
}