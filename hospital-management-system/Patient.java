public class Patient{
    private int patientId;
    private String name;
    private int age;
    private String disease;

    Patient(int patientId, String name, int age, String disease){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public String toString(){
        return String.format("%-5d %-15s %-5d %-15s", patientId, name, age, disease);
    }
}