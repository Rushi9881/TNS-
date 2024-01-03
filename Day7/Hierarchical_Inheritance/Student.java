package Day7.Hierarchical_Inheritance;

public class Student extends Person{
    //Data members
    private int rollNo;
    private String college;
    private String branch;

    //Getter and setter methods
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setCollege(String college){
        this.college = college;
    }
    public String getCollege(){
        return college;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public String getBranch(){
        return branch;
    }
    //Parameterized constructor
    public Student(String name, String city, int age, int rollNo, String college, String branch){
        super(name, city, age);
        this.rollNo = rollNo;
        this.college = college;
        this.branch = branch;
    }
    //Default constructor
    public Student(){
        super();
        System.out.println("Student class object created");
        rollNo = 62;
        college = "GHRCEM";
        branch = "Computer Science";
    }

    //toString method
    public String toString(){
        return super.toString()+"\nRoll No: "+rollNo+"\nCollege: "+college+"\nBranch: "+branch;
    }
}
