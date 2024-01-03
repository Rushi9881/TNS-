package Day8.Static;

public class Employee {

    private String name;
    private int id;

    //Declartion of Static Variable
    static String companyName="GHRCEM";

    //Parametrized Constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", companyName=" + companyName + "]";
    }
    
}
