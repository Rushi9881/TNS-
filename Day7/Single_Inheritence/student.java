package Day7.Single_Inheritence;

public class student extends person {
    //Data Members
    private int rollno;
    private String collegename;
    private String branch;
    //Default Constructor
    public student(){
        System.out.println("Student object created successfully");
    }

    //Parametrized Constructor
    public student(int rollno, String collegename, String branch, String name, int id, String address, int age, String birthplace, String gender){
        super(name, id, address, age, birthplace, gender);
        this.rollno = rollno;
        this.collegename = collegename;
        this.branch = branch;
    }

    

    //Getters
    public int getRollno(){
        return rollno;
    }
    public String getCollegename(){
        return collegename;
    }
    public String getBranch(){
        return branch;
    }
    //Setters
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setCollegename(String collegename){
        this.collegename = collegename;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    
    //Display
    //toString() is a method that returns the value given to it in a string format
    public String toString(){
        return "rollno: " + rollno + "\n" +
                "collegename: " + collegename + "\n" +
                "branch: " + branch + "\n" +
                "name: " + getName() + "\n" +
                "id: " + getId() + "\n" +
                "address: " + getAddress() + "\n" +
                "age: " + getAge() + "\n" +
                "Birthplace: " + getBirthplace() + ", Gender: " + getgender();
        }



    
}
