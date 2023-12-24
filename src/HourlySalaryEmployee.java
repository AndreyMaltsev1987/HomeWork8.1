public class HourlySalaryEmployee extends Employee{

    private int rate;
    private int workHours;

    public HourlySalaryEmployee(String name, int rate, int workHours) {

        super(name);
        this.rate = rate;
        this.workHours = workHours;
    }
    public int calculateSalary() {
        return rate * workHours;
    }
}


