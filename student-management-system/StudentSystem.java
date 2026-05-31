import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        StudentManager mgr = new StudentManager();
        Scanner sc = new Scanner(System.in);

        // Add sample data
        mgr.addStudent("Alice",   20, 95.5);
        mgr.addStudent("Bob",     22, 42.0);
        mgr.addStudent("Charlie", 21, 88.0);
        mgr.addStudent("Diana",   23, 76.5);
        mgr.addStudent("Eve",     20, 55.0);
        mgr.addStudent("Frank",   22, 91.0);

        int choice;
        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Display All");
            System.out.println("2. Add Student");
            System.out.println("3. Search by Name");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Statistics");
            System.out.println("7. Top Students");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    mgr.displayAll();
                    break;
                case 2 :
                    sc.nextLine();
                    System.out.print("Name: ");   String name = sc.nextLine();
                    System.out.print("Age: ");    int age     = sc.nextInt();
                    System.out.print("Marks: ");  double m    = sc.nextDouble();
                    mgr.addStudent(name, age, m);
                    break;
                case 3 :
                    sc.nextLine();
                    System.out.print("Name: ");
                    mgr.searchByName(sc.nextLine());
                    break;
                case 4 :
                    System.out.print("ID: ");     int id   = sc.nextInt();
                    System.out.print("Marks: ");  double m1 = sc.nextDouble();
                    mgr.updateMarks(id, m1);
                    break;
                case 5 :
                    System.out.print("ID: ");
                    mgr.deleteStudent(sc.nextInt());
                    break;
                case 6 :
                    mgr.showStats();
                    break;
                case 7 :
                    System.out.print("Top N: ");
                    mgr.topStudents(sc.nextInt());
                    break;
                case 0 :
                    System.out.println("Goodbye!");
                    break;
                default :
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}