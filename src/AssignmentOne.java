import java.util.ArrayList;
public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // 创建全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Brown", 10,"Physician qualifications", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Smith", 5, "Physician qualifications", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(103,"Dr. Davis", 8, "Physician qualifications", "Internal Medicine");
        
        // 创建营养师对象
        Dietitian dietitian1 = new Dietitian(301, "Dr. Jones", 3, "Bachelor of Dietetics", "Food Safety");
        Dietitian dietitian2 = new Dietitian(302, "Dr. Lee", 15, "Registered Dietitian", "Physiology and pharmacology");

        // 打印所有卫生专业人员的详细信息
        System.out.println("----- All Healthcare Professionals -----");
        
        // 打印全科医生信息
        gp1.printDetails();
        System.out.println("\n");
        gp2.printDetails();
        System.out.println("\n");
        gp3.printDetails();
        System.out.println("\n");
        
        // 打印营养师信息
        dietitian1.printDetails();
        System.out.println("\n");
        dietitian2.printDetails();
        System.out.println("");
        System.out.println("------------------------------");
    

    // 第5部分 - 预约集合
        
        // 声明一个可以存储 Appointment 类实例的 ArrayList
        ArrayList<Appointment> appointments = new ArrayList<>();
        
        // 创建约会并添加到集合
        createAppointment(appointments, "张三", "13800000001", "8:00", gp1);
        createAppointment(appointments, "李四", "13800000002", "12:00", gp2);
        createAppointment(appointments, "12", "13800000003", "9:00", dietitian1);
        createAppointment(appointments, "23", "13800000004", "14:00", dietitian2);

        // 打印现有预约
        printExistingAppointments(appointments);
        
        // 取消其中一个预约
        cancelBooking(appointments, "13800000002");
        
        // 再次打印现有预约，显示更新后的约会集合
        printExistingAppointments(appointments);
        
        // 打印分隔线
        System.out.println("------------------------------------");
    
    }

    // 创建约会并将其添加到 ArrayList 中
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        // 检查必需的信息是否存在
        if (patientName.isEmpty() || patientPhone.isEmpty() || preferredTimeSlot.isEmpty() || selectedDoctor == null) {
            System.out.println("无法创建约会，所有信息都是必需的！");
            return;
        }
        
        // 创建新的约会对象并添加到集合
        Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTimeSlot, selectedDoctor);
        appointments.add(newAppointment);
        System.out.println("成功创建约会: " + patientName + " - " + preferredTimeSlot);
    }
    
    // 打印所有现有预约
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
    
    // 使用患者的手机号码取消预约
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientPhone) {
        Appointment toCancel = null;
        
        // 找到匹配的预约并取消
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
