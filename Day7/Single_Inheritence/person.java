package Day7.Single_Inheritence;

public class person {
    //Data Members
    private String name;
    private int id;
    private String address;
    private int age;
    private String birthplace;
    private String gender;

    //Default Constructor
    public person(){
        System.out.println("Citizen object created successfully");
    }

    //Parameterized Constructor
    public person(String name, int id, String address, int age, String birthplace, String gender){
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
        this.birthplace = birthplace;
        this.gender = gender;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public String getBirthplace(){
        return birthplace;
    }
    public String getgender(){
        return gender;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setBirthplace(String birthplace){
        this.birthplace = birthplace;
    }
    public void setgender(String gender){
        this.gender = gender;
    }
    //toString
    public String toString() {
        return "Address: " + this.address + ", Age: " + this.age + ", Birthplace: " + this.birthplace + ", Gender: " + this.gender;
    }





    
}
