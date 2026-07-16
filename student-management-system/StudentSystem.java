import java.util.Scanner;
 
public class StudentSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;
        do{
            System.out.println("\n===== STUDENT RESULT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Rank Students");
            System.out.println("5. Topper");
            System.out.println("6. Class Statistics");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print( "Name : ");
                    String name =sc.nextLine();

                    System.out.print("Marks 1 : ");
                    double m1 = sc.nextDouble();

                    System.out.print("Marks 2 : ");
                    double m2 = sc.nextDouble();

                    System.out.print("Marks 3 : ");
                    double m3 = sc.nextDouble();

                    manager.addStudent(name, m1, m2, m3);
                }
                case 2 -> manager.displayStudents();
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Student Name : ");
                    manager.searchStudent(sc.nextLine());
                }
                case 4 -> manager.rankStudents();
                case 5 -> manager.topper();
                case 6 -> manager.classStatistics();
                case 0 -> System.out.println("Thank You!");
                default -> System.out.println("Invalid Choice.");
            }
        } while (choice != 0);
        sc.close();
    } 
}