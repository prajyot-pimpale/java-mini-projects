public class ExpenseTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpenseManager manager = new ExpenseManager();

        int choice;
        do {
            System.out.println("\n========== EXPENSE TRACKER ==========");
            System.out.println("1. Add Expense");
            System.out.println("2. Display Expenses");
            System.out.println("3. Search Expense");
            System.out.println("4. Update Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Search By Category");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    sc.nextLine();
                    System.out.print("Title : ");
                    String title = sc.nextLine();

                    System.out.print("Category : ");
                    String category = sc.nextLine();

                    System.out.print("Amount : ");
                    double amount = sc.nextDouble();

                    manager.addExpense(title, category, amount);
                }
                case 2 ->
                        manager.displayExpenses();
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Title : ");
                    manager.searchExpense(sc.nextLine());
                }
                case 4 -> {
                    System.out.print("Expense ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Title : ");
                    String title = sc.nextLine();

                    System.out.print("New Category : ");
                    String category = sc.nextLine();

                    System.out.print("New Amount : ");
                    double amount = sc.nextDouble();

                    manager.updateExpense(id, title, category, amount);
                }
                case 5 -> {
                    System.out.print("Expense ID : ");
                    manager.deleteExpense(sc.nextInt());
                }
                case 6 -> {
                    sc.nextLine();
                    System.out.print("Category : ");
                    manager.searchByCategory(sc.nextLine());
                }
                case 0 ->
                        System.out.println("Thank You!");
                default ->
                        System.out.println("Invalid Choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}