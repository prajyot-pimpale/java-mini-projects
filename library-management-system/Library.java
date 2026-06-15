import java.util.*;
import java.util.stream.*;

class Library {
    private List<Book> books = new ArrayList<>();
    private Map<String, Integer> issued = new HashMap<>();
    private int nextId = 1;

    void addBook(String title, String author, String genre) {
        books.add(new Book(nextId++, title, author, genre));
        System.out.println("Book added: " + title);
    }

    void displayAll() {
        System.out.println("\n" + "=".repeat(70));
        System.out.printf("%-4s %-25s %-20s %-12s %s%n", "ID", "Title", "Author", "Genre", "Status");
        System.out.println("-".repeat(70));
        books.forEach(System.out::println);
        System.out.println("=".repeat(70));
    }

    void searchByTitle(String title) {
        books.stream()
             .filter(b -> b.getTitle().toLowerCase().contains(title.toLowerCase()))
             .forEach(System.out::println);
    }

    void searchByAuthor(String author) {
        books.stream()
             .filter(b -> b.getAuthor().toLowerCase().contains(author.toLowerCase()))
             .forEach(System.out::println);
    }

    void issueBook(int id, String member) {
        books.stream()
             .filter(b -> b.getId() == id)
             .findFirst()
             .ifPresentOrElse(b -> {
                 if (!b.isAvailable()) {
                     System.out.println("Book already issued");
                 } else {
                     b.setAvailable(false);
                     issued.put(member + "_" + id, id);
                     System.out.println("'" + b.getTitle() + "' issued to " + member);
                 }
             }, () -> System.out.println("Book not found"));
    }

    void returnBook(int id, String member) {
        String key = member + "_" + id;
        if (!issued.containsKey(key)) {
            System.out.println("No record of this issue");
            return;
        }
        books.stream()
             .filter(b -> b.getId() == id)
             .findFirst()
             .ifPresent(b -> {
                 b.setAvailable(true);
                 issued.remove(key);
                 System.out.println("'" + b.getTitle() + "' returned by " + member);
             });
    }

    void showAvailable() {
        System.out.println("\n=== Available Books ===");
        books.stream()
             .filter(Book::isAvailable)
             .forEach(System.out::println);
    }

    void showStats() {
        long total     = books.size();
        long available = books.stream().filter(Book::isAvailable).count();
        long issued2   = total - available;

        System.out.println("\n=== Library Stats ===");
        System.out.println("Total     : " + total);
        System.out.println("Available : " + available);
        System.out.println("Issued    : " + issued2);

        System.out.println("\n=== Books by Genre ===");
        books.stream()
             .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()))
             .forEach((g, c) -> System.out.println(g + ": " + c));
    }
}