public class HealthProfessional {
    // 实例变量
    private int id;               //只包含数字
    private String name;          
    private int  yearsOfExperience;   //与医生类型无关
    
    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.yearsOfExperience = 0;
    }
    
    // 初始化所有实例变量的第二个构造函数
    public HealthProfessional(int id, String name, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("HealthProfessional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("YearsOfExperience: " + yearsOfExperience);
    }
    
    //方法:Getter和Setter
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
