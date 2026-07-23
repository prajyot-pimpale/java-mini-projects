public class ContactSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        manager.loadContacts();
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Total Contacts");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    manager.addContact(name, phone, email);
                }
                case 2 -> manager.displayContacts();
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    manager.searchContact(name);
                }
                case 4 -> {
                    System.out.print("Enter ID: ");
                    int id =sc.nextInt();

                    sc.nextLine();
                    System.out.print("New Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("New Email: ");
                    String email = sc.nextLine();

                    manager.updateContact(id, phone, email);
                }
                case 5 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    manager.deleteContact(id);
                }
                case 6 -> manager.sortContacts();
                case 7 -> manager.totalContacts();
                case 0 -> {
                    manager.saveContacts();
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}