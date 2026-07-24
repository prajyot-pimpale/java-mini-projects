import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("%-4d %-15s %-15s %.2f", id, name, department, salary);
    }
}