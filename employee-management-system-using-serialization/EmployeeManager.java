import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

public class EmployeeManager{
    List<Employee> employees = new ArrayList<>();
    
    private int nextId = 1;

    private static final String FILE_NAME = "employees.dat";

    @SuppressWarnings("unchecked")
    public void loadEmployees(){

        File file = new File(FILE_NAME);

        if(!file.exists())
            return;

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){

            employees = (List<Employee>) in.readObject();

            nextId = employees.stream()
                            .mapToInt(Employee::getId)
                            .max()
                            .orElse(0)+1;
            System.out.println("Employees loaded successfully.");
        }catch(IOException e){
            System.out.println("Error loading employees!!");
        }
    }

    public void saveEmployees(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(employees);
        } catch (Exception e) {
            System.out.println("Error saving employees.");
        }
    }

    public void addEmployee(String name, String department, double salary){
        employees.add(new Employee(nextId++, name, department, salary));
        saveEmployees();
        System.out.println("Employee added successfully.");
    }

    public void displayEmployee(){
        if(employees.isEmpty()){
            System.out.println("No Employee Found!!");
            return;
        }
        System.out.println("\n==================================================");
        System.out.printf("%-4s %-15s %-15s %s%n", "ID", "NAME", "DEPARTMENT", "SALARY");
        System.out.println("--------------------------------------------------");
        employees.forEach(System.out::println);
        System.out.println("\n==================================================");
    }

    public void searchEmployee(String name){
        List<Employee> result = employees.stream()
                                        .filter(e -> e.getName.equalsIgnoreCase(name))
                                        .toList();
        if(result.isEmpty)
            System.out.println("Employee Not Found!!");
        else
            employees.forEach(System.out::println);
    }

    public void updateSalary(int id, double salary){
        employees.stream()
                .filter(e -> e.getId == id)
                .findFirst()
                .ifPresentOrElse(e -> {
                                        e.setSalary(salary);
                                        saveEmployees();
                                        System.out.println("Salary updated successfully.");
                                    },
                                    () -> System.out.println("Employee not found.")
                                );
    }

    public void deleteEmployee(int id) {

        boolean removed = employees.removeIf(e -> e.getId() == id);

        if(removed){
            saveEmployees();
            System.out.println("Employee deleted successfully.");
        }else{
            System.out.println("Employee not found.");
        }
    }

    public void salaryStatistics(){
        if(employees.isEmpty){
            System.out.println("No Employee Data.");
            return;
        }

        DoubleSummaryStatistics stats = employees.stream()
                                                .mapToDouble(Employee::getSalary)
                                                .sumaryStatistics();

        System.out.println("\n===== Salary Statistics =====");
        System.out.println("Total Employees : "+ employees.size());
        System.out.println("Highest Salary : "+ stats.getMax());
        System.out.println("Lowest Salary : "+ stats.getMin());
        System.out.println("Average Salary : "+ stats.getAverage());
        System.out.println("Total Salary : "+ stats.getSum());
    }

    public void departmentReport(){
        if(employees.isEmpty){
            System.out.println("No Employee Data.");
            return;
        }
        System.out.println("\n===== Department Report =====");

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .forEach((dept, count) -> System.out.println(dept + " : " + count));
    }

    public void topEarners(int n){
        if(employees.isEmpty){
            System.out.println("No Employee Data.");
            return;
        }
        System.out.println("\n===== Top " + n + " Earners =====");

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(n)
                .forEach(System.out::println);
    }
}