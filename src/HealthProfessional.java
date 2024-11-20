public class HealthProfessional {
    //Instance variable
    private int id;               //Only contains numbers
    private String name;          
    private int  yearsOfExperience;   //Not related to the type of doctor
    
    //Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.yearsOfExperience = 0;
    }
    
    //Initialize the second constructor of all instance variables
    public HealthProfessional(int id, String name, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    //Method for printing all instance variables
    public void printDetails() {
        System.out.println("HealthProfessional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("YearsOfExperience: " + yearsOfExperience);
    }
    
    //Method: Getter and Setter
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
