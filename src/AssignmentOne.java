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
        System.out.println("------------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------------");
        
        // 打印营养师信息
        dietitian1.printDetails();
        System.out.println("------------------------------------");
        dietitian2.printDetails();
    }
}
