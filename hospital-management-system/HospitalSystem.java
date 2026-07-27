public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();
        int choice;
        
        do{
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. Display Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Hospital Report");
            System.out.println("8. Doctor Wise Report");
            System.out.println("0. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Patient Name : ");
                    String name = sc.nextLine();

                    System.out.print("Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Disease : ");
                    String disease = sc.nextLine();

                    hospital.addPatient(name, age, disease);
                }
                case 2 -> hospital.displayPatients();
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Doctor Name : ");
                    String name = sc.nextLine();

                    System.out.print("Specialization : ");
                    String specialization = sc.nextLine();

                    hospital.addDoctor(name, specialization);
                }
                case 4 -> hospital.displayDoctors();
                case 5 -> {
                    System.out.print("Patient ID : ");
                    int patientId = sc.nextInt();

                    System.out.print("Doctor ID : ");
                    int doctorId = sc.nextInt();

                    hospital.bookAppointment(patientId, doctorId);
                }
                case 6 -> hospital.displayAppointments();
                case 7 -> hospital.hospitalReport();
                case 8 -> hospital.doctorWiseAppointments();
                case 0 -> System.out.println("Thank You!");
                default -> System.out.println("Invalid Choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}