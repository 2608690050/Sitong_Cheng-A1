public class Appointment {
    //Patient's detailed information
    private String patientName;
    private String patientPhone;
    
    //Patient's preferred time period
    private String preferredTimeSlot;
    
    //Selected doctor (general practitioner or nutritionist)
    private HealthProfessional selectedDoctor;

    //Default constructor
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.preferredTimeSlot = "";
        this.selectedDoctor = null;
    }

    //Constructor with parameters, used to initialize all instance variables
    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    //Method for printing all instance variables
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (selectedDoctor != null) {
            selectedDoctor.printDetails();
        } else {
            System.out.println("The selection is incorrect. No doctor selected.");
        }
    }

    //Method: Getter and Setter
    public String getpatientName() {
        return patientName;
    }

    public void setpatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getpatientPhone() {
        return patientPhone;
    }

    public void setpatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getpreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setpreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional selectedDoctor() {
        return selectedDoctor;
    }

    public void selectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

}
