package Day8.is_a_relationship;

public class Executor {
    public static void main(String[] args) {
        Employee emp = new Employee("Rushikesh", 101, "IT", 1234567890);
        System.out.println(emp);
        Manager mgr = new Manager("Rahul", 101, "IT", 1234567890, 5);
        System.out.println(mgr);
    }
    
}
