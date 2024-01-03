package Day6.SingletonDemo;
// This is the class which allows us to create only one object.


public class ContactDAO {
    //Static data member which is instance of singleton class

    private static ContactDAO contactDAO =null ;
    
    // Private Constructor which restrict to create instance of singleton class
    private ContactDAO(){

    }
    //Static method which allows to create and access the object
    public static ContactDAO getInstance(){
        if(contactDAO == null){
            contactDAO = new ContactDAO();
        }
        return contactDAO;
    }

    public void getContactDetails(){
        System.out.println("Contact Details");
    }
    public static void main(String[] args) {

        ContactDAO obj1 = ContactDAO.getInstance();
        System.out.println(obj1);

        ContactDAO obj2 = ContactDAO.getInstance();
        System.out.println(obj2);
    }
    
}
