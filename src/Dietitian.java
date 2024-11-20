public class Dietitian extends HealthProfessional {
    private String qualification;
    private String specialization;

    // 默认构造函数
    public Dietitian() {
        super(); // 调用基类的默认构造函数
        this.qualification = "";
        this.specialization = "";
    }

    // 带参数的构造函数，初始化所有实例变量
    public Dietitian(int id, String name, int yearsOfExperience, String qualification, String specialization) {
        super(id, name, yearsOfExperience); // 调用基类的带参数构造函数
        this.qualification = qualification;
        this.specialization = specialization;
    }

    // 打印营养师的详细信息
    @Override
    public void printDetails() {
        System.out.println("The health professional details are: ");
        super.printDetails(); // 打印基类的详细信息
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Specialization: " + this.specialization);
        System.out.println("专业类型: 营养师");
    }

    //方法：Getter 和 Setter
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
