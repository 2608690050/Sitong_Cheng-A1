public class Dietitian extends HealthProfessional {
    private String qualification;
    private String specialization;

    //Default constructor
    public Dietitian() {
        super(); //Call the default constructor of the base class
        this.qualification = "";
        this.specialization = "";
    }

    //Constructor with parameters, initialize all instance variables
    public Dietitian(int id, String name, int yearsOfExperience, String qualification, String specialization) {
        super(id, name, yearsOfExperience); //Call the parameterized constructor of the base class
        this.qualification = qualification;
        this.specialization = specialization;
    }

    //Print detailed information of dietitian
    @Override
    public void printDetails() {
        System.out.println("The health professional details are: ");
        super.printDetails(); //Print detailed information of base classes
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Specialization: " + this.specialization);
        System.out.println("Professional type: Dietitian");
    }

    //Method: Getter and Setter
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
