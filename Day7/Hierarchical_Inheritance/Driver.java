package Day7.Hierarchical_Inheritance;

public class Driver {
    public static void main(String[] args) {
      //Using default constructor
       Student s = new Student();
        System.out.println(s +"\n");
        Employee e = new Employee(); 
        System.out.println(e +"\n");

          //Using parameterized constructor
        Student s1 = new Student("Rushikesh", "Pune", 21, 62, "GHRCEM", "Computer Science");
        s1.toString();
        System.out.println("\n");
        Employee e1 = new Employee("Rushikesh", "Pune", 21, 1, "XYZ", "Manager", 10000);
        e1.toString();

        //Instead of above we can do this also by Dynamic Binding //Runtime polymorphism // Loose coupling 
        Person p = new Person("Rushikesh", "Pune", 21);
        System.out.println(p +"\n");
        p = new Student("Rushikesh", "Pune", 21, 62, "GHRCEM", "Computer Science");
        System.out.println(p +"\n");
        p = new Employee("Rushikesh", "Pune", 21, 1, "XYZ", "Manager", 10000); 
        System.out.println(p +"\n"); 
        
        //Instanceof operator or type comparison operator
        //It is used to test whether the object is an instance of the specified type (class or subclass or interface)
        System.out.println("p is an instance of Person: " + (p instanceof Person));
        System.out.println("p is an instance of Student: " + (p instanceof Student));
        System.out.println("p is an instance of Employee: " + (p instanceof Employee));

    }
    
}
