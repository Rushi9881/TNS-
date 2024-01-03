package Day7.Hierarchical_Inheritance;



public class Person {
    //Data member
    private String name;
    private String city;
    private int age;

    //Parameterized constructor
    public Person(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }
    //Default constructor
    public Person(){
        System.out.println("Person class object created");
        name="Rushikesh";
        city="Pune";
        age=21;
    }

    //getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    //toString method
    public String toString(){
        return "Name: "+name+"\nCity: "+city+"\nAge: "+age;
    }

    
}
