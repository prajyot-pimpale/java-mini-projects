public class Appointment{
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;

    public Appointment(int appointmentId, Patient patient, Doctor doctor){
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String toString() {
        return String.format("Appointment ID: %d | Patient: %s | Doctor: %s", appointmentId, patient.getName(), doctor.getName());
    }
}