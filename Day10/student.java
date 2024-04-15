package Day10;

public class student{
    //Data members
    private int rollNo;
    private String name;
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
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //Parameterized constructor
    public student(int rollNo,String name, String college, String branch){
        this.rollNo = rollNo;
        this.name = name;
        this.college = college;
        this.branch = branch;
    }
    //Default constructor
    public student(){

        System.out.println("Student class object created");
        rollNo = 62;
        name = "Rahul";
        college = "GHRCEM";
        branch = "Computer Science";
    }

    //toString method
    public String toString(){
        return "\nRoll No: "+rollNo+"\nname: "+name+"\nCollege: "+college+"\nBranch: "+branch;
    }



    public student clone() throws CloneNotSupportedException{
        return(student)super.clone();
    }
}
