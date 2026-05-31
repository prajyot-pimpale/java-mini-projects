class Student {
    private int    id;
    private String name;
    private int    age;
    private double marks;

    Student(int id, String name, int age, double marks) {
        this.id    = id;
        this.name  = name;
        this.age   = age;
        this.marks = marks;
    }

    public int    getId()    { return id; }
    public String getName()  { return name; }
    public int    getAge()   { return age; }
    public double getMarks() { return marks; }
    public void   setMarks(double marks) { this.marks = marks; }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return String.format("%-4d %-15s %-4d %-6.1f %s",
                             id, name, age, marks, getGrade());
    }
}
