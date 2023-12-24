public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private boolean offshore;

    public Employee(String firstName, String lastName, double salary, boolean offshore) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.offshore = offshore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isOffshore() {
        return offshore;
    }
}
