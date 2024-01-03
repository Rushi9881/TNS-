package Day6;

public class accsessMod {
    //Declare all types of data members
    int varDefault = 10;
    public int varPublic =40;
    private int varPrivate = 20;
    protected int varProtected = 30;

    //Declare all types of methods
    void methodDefault(){
        System.out.println("Default method");
        System.out.println("Default variable: "+varDefault);
    }
    public void methodPublic(){
        System.out.println("Public method");
        System.out.println("Public variable: "+varPublic);
    }
    private void methodPrivate(){
        System.out.println("Private method");
        System.out.println("Private variable: "+varPrivate);
    }
    protected void methodProtected(){
        System.out.println("Protected method");
        System.out.println("Protected variable: "+varProtected);
    }

    public static void main(String[] args) {
        accsessMod o= new accsessMod();
        o.methodDefault();
        o.methodPublic();
        o.methodPrivate();
        o.methodProtected();
    }
}
