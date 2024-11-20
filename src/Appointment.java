public class Appointment {
    // 患者的详细信息
    private String patientName;
    private String patientPhone;
    
    // 患者首选的时间段
    private String preferredTimeSlot;
    
    // 选定的医生（全科医生或营养师）
    private HealthProfessional selectedDoctor;

    // 默认构造函数
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.preferredTimeSlot = "";
        this.selectedDoctor = null;
    }

    // 带参构造函数，用于初始化所有实例变量
    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 打印所有实例变量的方法
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

   
}
