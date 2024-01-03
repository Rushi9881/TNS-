package Day8.has_a_relationship;

//Has a
// Person ---------------------------> Address

//Container Class
public class person {

    private String name;
    private Address address; //Object reference

    //Parameterized Constructor
    public person(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }
    
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    //Display method
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address.getStreet()+" "+address.getCity()+" "+address.getState()+" "+address.getPincode());
    }

}
