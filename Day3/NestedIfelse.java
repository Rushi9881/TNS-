package Day3;
public class NestedIfelse {
    public static void main(String[] args) {
        String username="admin";
        String password="admin";
        if (username == "admin")
        {
            System.out.println("Welcome Admin");
            if (password == "admin")
            {
                System.out.println("Access Granted");
                System.out.println("Welcome Admin");
            }
            else
            {
                System.out.println("Access Denied");
                System.out.println("Incorrect Password");
            };
        }
        else{
            System.out.println("Access Denied");
        }
    }
    
}
