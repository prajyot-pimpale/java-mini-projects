import java.util.*;
import java.util.stream.*;

public class LibrarySystem {
    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc  = new Scanner(System.in);

        lib.addBook("Clean Code",          "Robert Martin",  "Programming");
        lib.addBook("The Pragmatic Programmer", "Hunt & Thomas", "Programming");
        lib.addBook("Design Patterns",     "Gang of Four",   "Programming");
        lib.addBook("Atomic Habits",       "James Clear",    "Self-Help");
        lib.addBook("Deep Work",           "Cal Newport",    "Self-Help");

        int choice;
        do {
            System.out.println("\n=== Library System ===");
            System.out.println("1. All Books");
            System.out.println("2. Available Books");
            System.out.println("3. Search by Title");
            System.out.println("4. Search by Author");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Statistics");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.displayAll();
                    break;

                case 2:
                    lib.showAvailable();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Title: ");
                    lib.searchByTitle(sc.nextLine());
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Author: ");
                    lib.searchByAuthor(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Book ID: ");
                    int issueId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Member: ");
                    lib.issueBook(issueId, sc.nextLine());
                    break;

                case 6:
                    System.out.print("Book ID: ");
                    int returnId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Member: ");
                    lib.returnBook(returnId, sc.nextLine());
                    break;

                case 7:
                    lib.showStats();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}