package Day7.Hierarchical_Inheritance;
//Child class
public class Employee extends Person{
    //Data members
    private int empId;
    private String company;
    private String designation;
    private double salary;

    //Getter and setter methods
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return designation;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    //Parameterized constructor
    public Employee(String name, String city, int age, int empId, String company, String designation, double salary){
        super(name, city, age);
        this.empId = empId;
        this.company = company;
        this.designation = designation;
        this.salary = salary;
    }
    //Default constructor
    public Employee(){
        super();
        System.out.println("Employee class object created");
        empId = 1;
        company = "XYZ";
        designation = "Manager";
        salary = 10000;
    }

    //toString method
    public String toString(){
        return super.toString()+"\nEmployee Id: "+empId+"\nCompany: "+company+"\nDesignation: "+designation+"\nSalary: "+salary;
    }

    
}
