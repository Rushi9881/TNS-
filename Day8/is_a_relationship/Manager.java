package Day8.is_a_relationship;

//Child class is inheriting from Employee
public class Manager extends Employee{
    
    private int teamSize;

    //getter and setter
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize){
        this.teamSize =teamSize;
    }

    public Manager(){
        super();
    }
    
    public Manager(String name, int emp_id, String department, int mobile_no,int teamSize){
        super(name, emp_id, department, mobile_no);
        this.teamSize = teamSize;
    }
}
