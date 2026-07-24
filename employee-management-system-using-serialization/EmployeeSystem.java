public class EmployeeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        manager.loadEmployees();
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Salary Statistics");
            System.out.println("7. Department Report");
            System.out.println("8. Top Earners");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Department : ");
                    String dept = sc.nextLine();

                    System.out.print("Salary : ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(name, dept, salary);
                }
                case 2 ->
                    manager.displayEmployees();
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    manager.searchEmployee(name);
                }
                case 4 -> {
                    System.out.print("Employee ID : ");
                    int id = sc.nextInt();

                    System.out.print("New Salary : ");
                    double salary = sc.nextDouble();

                    manager.updateSalary(id,salary);
                }
                case 5 -> {
                    System.out.print("Employee ID : ");
                    int id = sc.nextInt();

                    manager.deleteEmployee(id);
                }

                case 6 ->
                    manager.salaryStatistics();
                case 7 ->
                    manager.departmentReport();
                case 8 -> {
                    System.out.print("Top N : ");
                    int n = sc.nextInt();

                    manager.topEarners(n);
                }
                case 0 -> {
                    manager.saveEmployees();
                    System.out.println("Goodbye!");
                }
                default ->
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}