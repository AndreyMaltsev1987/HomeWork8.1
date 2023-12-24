import java.util.Map;

public class PieceworkEmployee extends Employee {

    private Map<String, Integer> works;

    public PieceworkEmployee(String name, Map<String, Integer> works) {
        super(name);
        this.works = works;
    }
    public int calculateSalary() {
        int totalSalary = 0;
        for (int salary : works.values()) {
            totalSalary += salary;
        }
        return totalSalary;
    }
}



