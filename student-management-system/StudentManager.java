import java.util.*;
import java.util.stream.*;

class StudentManager {

    private List<Student> students = new ArrayList<>();
    private int nextId = 1;

    // Add
    void addStudent(String name, int age, double marks) {
        students.add(new Student(nextId++, name, age, marks));
        System.out.println("Student added: " + name);
    }

    // Display all
    void displayAll() {
        if (students.isEmpty()) { System.out.println("No students"); return; }
        System.out.println("\n" + "=".repeat(45));
        System.out.printf("%-4s %-15s %-4s %-6s %s%n",
                          "ID", "Name", "Age", "Marks", "Grade");
        System.out.println("-".repeat(45));
        students.forEach(System.out::println);
        System.out.println("=".repeat(45));
    }

    // Search by name
    void searchByName(String name) {
        List<Student> found = students.stream()
            .filter(s -> s.getName().equalsIgnoreCase(name))
            .collect(Collectors.toList());
        if (found.isEmpty()) System.out.println("Not found: " + name);
        else found.forEach(System.out::println);
    }

    // Update marks
    void updateMarks(int id, double newMarks) {
        students.stream()
            .filter(s -> s.getId() == id)
            .findFirst()
            .ifPresentOrElse(s -> {
                s.setMarks(newMarks);
                System.out.println("Updated marks for ID: " + id);
            }, () -> System.out.println("ID not found: " + id));
    }

    // Delete
    void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        System.out.println(removed ? "Deleted ID: " + id : "ID not found: " + id);
    }

    // Statistics
    void showStats() {
        if (students.isEmpty()) return;
        DoubleSummaryStatistics stats = students.stream()
            .mapToDouble(Student::getMarks)
            .summaryStatistics();

        System.out.println("\n=== Statistics ===");
        System.out.printf("Total   : %d%n",    students.size());
        System.out.printf("Highest : %.1f%n",  stats.getMax());
        System.out.printf("Lowest  : %.1f%n",  stats.getMin());
        System.out.printf("Average : %.2f%n",  stats.getAverage());

        long passed = students.stream().filter(s -> s.getMarks() >= 50).count();
        System.out.printf("Passed  : %d/%d%n", passed, students.size());

        System.out.println("\n=== Grade Distribution ===");
        students.stream()
            .collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()))
            .entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e -> System.out.println("Grade " + e.getKey() + ": " + e.getValue()));
    }

    // Top N students
    void topStudents(int n) {
        System.out.println("\n=== Top " + n + " Students ===");
        students.stream()
            .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
            .limit(n)
            .forEach(System.out::println);
    }
}