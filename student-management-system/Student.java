public class Student {

    private int id;
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

    public Student(int id, String name, double marks1, double marks2, double marks3){
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPercentage(){
        return (marks1 + marks2 + marks3)/ 3.0;
    }

    public String getGrade() {
        double percentage = getPercentage();
        if (percentage >= 90)
            return "A+";
        if (percentage >= 80)
            return "A";
        if (percentage >= 70)
            return "B";
        if (percentage >= 60)
            return "C";
        if (percentage >= 50)
            return "D";
        return "F";
    }

    public String toString() {
        return String.format("%-5d %-15s %-10.2f %-5s", id, name, getPercentage(), getGrade());
    }
}