public class StudentManager {

    private List<Student> students = new ArrayList<>();

    private int nextId = 1;

    public void addStudent(String name, double m1, double m2, double m3 ) {
        students.add(new Student(nextId++, name, m1, m2, m3));
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.printf("%-5s %-15s %-10s %-5s%n", "ID", "NAME", "PERCENT", "GRADE");
        students.forEach(System.out::println);
    }

    public void searchStudent(String name){
        students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    public void rankStudents(){
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .forEach(System.out::println);
    }

    public void topper(){
        students.stream()
                .max(Comparator.comparingDouble(Student::getPercentage))
                .ifPresent(s -> System.out.println("\nTopper : "+ s));
    }

    public void classStatistics(){
        DoubleSummaryStatistics stats = students.stream()
                                                .mapToDouble(Student::getPercentage)
                                                .summaryStatistics();

        System.out.println("\n===== Class Statistics =====");
        System.out.println("Students : "+ students.size());
        System.out.println("Highest : "+ stats.getMax());
        System.out.println("Lowest : "+ stats.getMin());
        System.out.println("Average : "+ stats.getAverage());
    }
}