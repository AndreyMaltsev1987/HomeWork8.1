public abstract class Employee {

    final String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract int calculateSalary();
}

