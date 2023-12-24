import java.util.HashMap;
import java.util.Map;

public class TaxReport {
    public static void main(String[] args) {


        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 2);
        employees.put("Emma", 0);
        employees.put("Alex", 1);


        for (Map.Entry<String, Integer> employee : employees.entrySet()) {
            String name = employee.getKey();
            int children = employee.getValue();
            double taxRate = employees.get(children);

            if (children == 0) {

                taxRate += 0.05;
            }

            System.out.println(name + ": " + taxRate);
        }
    }


    public  double getTaxRate(int children) {
        double baseRate = 0.2;


        double childRate = children * 0.02;

        return baseRate + childRate;
    }
}


