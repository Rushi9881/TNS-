package Day8.is_a_relationship;

public class Employee {
    private String name;
    private int emp_id;
    private String department;
    private int mobile_no;

    //Default Constructor
    public Employee() {
        super();
    }
    //parameterized Constructor
    public Employee(String name, int emp_id, String department, int mobile_no){
        this.name= name;
        this.emp_id = emp_id;
        this.department = department;
        this.mobile_no = mobile_no;
    }

    //Getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department= department;
    }
    public int getMobile_no() {
        return mobile_no;
    }
    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    //toString method
    @Override
    public String toString() {
        return "Employee [name=" + name + ", emp_id=" + emp_id + ", department=" + department + ", mobile_no="
                + mobile_no + "]";
    }
    
}
