import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class ExpenseManager {

    private List<Expense> expenses = new ArrayList<>();

    private int nextId = 1;

    public void addExpense(String title, String category, double amount ) {
        Expense expense = new Expense(nextId++, title, category, amount, LocalDate.now());
        expenses.add(expense);
        System.out.println("Expense Added Successfully.");
    }

    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        System.out.printf("%-5s %-20s %-15s %-10s %-12s%n", "ID", "TITLE", "CATEGORY", "AMOUNT", "DATE");
        expenses.forEach(System.out::println);
    }

    public void searchExpense(String title) {
        boolean found = false;
        for (Expense expense : expenses) {
            if (expense.getTitle().equalsIgnoreCase(title)) {
                System.out.println(expense);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Expense Not Found.");
        }
    }

    public void updateExpense(int id, String newTitle, String newCategory, double newAmount) {
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.setTitle(newTitle);
                expense.setCategory(newCategory);
                expense.setAmount(newAmount);
                expense.setDate(LocalDate.now());
                System.out.println("Expense Updated Successfully.");
                return;
            }
        }
        System.out.println("Expense Not Found.");
    }

    public void deleteExpense(int id) {
        Iterator<Expense> iterator = expenses.iterator();

        while (iterator.hasNext()) {
            Expense expense = iterator.next();
            if (expense.getId() == id) {
                iterator.remove();
                System.out.println("Expense Deleted Successfully.");
                return;
            }
        }
        System.out.println("Expense Not Found.");
    }
     
    public void searchByCategory(String category) {
        boolean found = false;
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Expenses Found.");
        }
    }
}