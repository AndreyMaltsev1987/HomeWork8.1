public class FixedSalaryEmployee extends Employee{
    private int rate;
    private int workDays;

    public FixedSalaryEmployee(String name, int rate, int workDays) {
        super(name);
        this.rate = rate;
        this.workDays = workDays;
    }
    public int calculateSalary() {
        return rate * workDays;
    }
}

