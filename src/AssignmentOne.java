import java.util.ArrayList;
public class AssignmentOne {
    public static void main(String[] args) {
    // Part 3 – Using classes and objects
        //Create a general practitioner object
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Brown", 10,"Physician qualifications", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Smith", 5, "Physician qualifications", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(103,"Dr. Davis", 8, "Physician qualifications", "Internal Medicine");
        
        //Create a dietitian object
        Dietitian dietitian1 = new Dietitian(301, "Dr. Jones", 3, "Bachelor of Dietetics", "Food Safety");
        Dietitian dietitian2 = new Dietitian(302, "Dr. Lee", 15, "Registered Dietitian", "Physiology and pharmacology");

        //Print detailed information of all healthcare professionals
        System.out.println("----- All Healthcare Professionals -----");
        
        //Print general practitioner information
        gp1.printDetails();
        System.out.println("\n");
        gp2.printDetails();
        System.out.println("\n");
        gp3.printDetails();
        System.out.println("\n");
        
        //Print dietitian information
        dietitian1.printDetails();
        System.out.println("\n");
        dietitian2.printDetails();
        System.out.println("");
        System.out.println("------------------------------");
    

    //Part 5- Appointment Collection
        
        //Declare an ArrayList that can store instances of the Appointment class
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        //Create an appointment and add it to the collection
        createAppointment(appointments, "张三", "13800000001", "8:00", gp1);
        createAppointment(appointments, "李四", "13800000002", "12:00", gp2);
        createAppointment(appointments, "12", "13800000003", "9:00", dietitian1);
        createAppointment(appointments, "23", "13800000004", "14:00", dietitian2);

        //Print existing appointments
        printExistingAppointments(appointments);
        
        //Cancel one of the appointments
        cancelBooking(appointments, "13800000002");
        
        //Print the existing appointment again and display the updated appointment collection
        printExistingAppointments(appointments);
        
        //Print Separation Lines
        System.out.println("------------------------------------");
    
    }

    //Create an appointment and add it to an ArrayList
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        //Check if the necessary information exists
        if (patientName.isEmpty() || patientPhone.isEmpty() || preferredTimeSlot.isEmpty() || selectedDoctor == null) {
            System.out.println("无法创建约会，所有信息都是必需的！");
            return;
        }
        
        //Create a new date and add it to the collection
        Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTimeSlot, selectedDoctor);
        appointments.add(newAppointment);
        System.out.println("成功创建约会: " + patientName + " - " + preferredTimeSlot + "\n");
        
    }
    
    //Print all existing appointments
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("没有现有的约会！");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("");
            }
        }
    }
    
    //Cancel the appointment using the patient's mobile phone number
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientPhone) {
        Appointment toCancel = null;
        
        //Find a matching appointment and cancel it
        for (Appointment appointment : appointments) {
            if (appointment.getpatientPhone().equals(patientPhone)) {
                toCancel = appointment;
                break;
            }
        }
        
        if (toCancel != null) {
            appointments.remove(toCancel);
            System.out.println("成功取消预约：手机号 " + patientPhone);
            System.out.println("\n");
        } else {
            System.out.println("未找到匹配的预约，无法取消！");
        }
    }
}
