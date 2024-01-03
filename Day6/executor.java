package Day6;

public class executor{
    public static void main(String[] args) {
        accsessMod o= new accsessMod();
         o.methodDefault();
        o.methodPublic();
        //o.methodPrivate(); // This will give error because it can't be accessed outside the class
        o.methodProtected();

        o.varDefault = 100;
        o.varPublic = 400;
        //o.varPrivate = 200; // This will give error because it can't be accessed outside the class
        //If we want to access private variable we need to use getter and setter methods
        o.varProtected = 300;

        o.methodDefault();
        o.methodPublic();
        //o.methodPrivate(); // This will give error because it can't be accessed outside the class
        o.methodProtected();
    }
    
}
