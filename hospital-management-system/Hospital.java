public class Hospital{
    
    private int nextPatientId = 1;
    private int nextDoctorId = 101;
    private int nextAppointmentId = 1001;
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(String name, int age, String disease){
        patients.add(new Patient(nextPatientId++, name, age, disease));
        System.out.println("Patient added successfully.");
    }

    public void displayPatients(){
        if(patients.isEmpty()){
            System.out.println("No patients found.");
            return;
        }
        System.out.printf("%-5s %-15s %-5s %-15s%n", "ID", "NAME", "AGE", "DISEASE");
        patients.forEach(System.out::println);
    }

    public void addDoctor(String name , String specialization){
        doctors.add(new Doctor(nextDoctorId++,name, specialization));
        System.out.println("Doctor added successfully.");
    }

    public void displayDoctors(){
        if (doctors.isEmpty()){
            System.out.println("No doctors found.");
            return;
        }
        System.out.printf("%-5s %-15s %-20s%n","ID","NAME","SPECIALIZATION");
        doctors.forEach(System.out::println);
    }

    public Patient findPatient(int id){
        return patients.stream()
                    .filter(p -> p.getPatientId() == id)
                    .findFirst()
                    .orElse(null);
    }

    public Doctor findDoctor(int id){
        return doctors.stream()
                    .filter(d -> d.getDoctorId == id)
                    .findFirst()
                    .orElse(null);
    }

    public void bookAppointment(int patientId, int doctorId){
        Patient patient = findPatient(patientId);
        Doctor doctor = findDoctor(doctorId);

        if(patient != null && doctor != null){
            System.out.println("Invalid Patient or Doctor ID.");
            return;
        }
        appointments.add(new Appointment(nextAppointmentId++, patient, doctor));
        System.out.println("Appointment booked successfully.");
    }

    public void displayAppointments(){
        if(appointments.isEmpty()){
            System.out.println("No appointments found.");
            return;
        }
        appointments.forEach(System.out::println);
    }

    public void hospitalReport(){
        System.out.println("\n===== Hospital Report =====");
        System.out.println("Total Patients : "+ patients.size());
        System.out.println("Total Doctors : "+ doctors.size());
        System.out.println("Total Appointments : "+ appointments.size());

    }

    public void doctorWiseAppointments(){
        System.out.println("\n===== Doctor Wise Appointments =====");
        appointments.stream()
                .collect(Collectors.groupingBy(a -> a.getDoctor().getName(),Collectors.counting()))
                .forEach((doctor, count) -> System.out.println(doctor + " : " + count));
    }
}