public class TypeCasting {

    public static void main(String[] args) {
        // widening casting
        int myInt = 9;
        double myDouble = myInt; 
        System.out.println(myInt); 

        // narrowing casting
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; 
        System.out.println(myDouble1);

        // automatic casting
        char a = 'A';
        int b = a;
        System.out.println(b);

     
    }
    
}
