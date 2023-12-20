public class PrimitiveDataType {

    public static void main(String[] args) {
        //byte takes  byte
        byte bytemax = 127;
        byte bytemin = -128;

        System.out.println(" Min range pf byte is "+ bytemin + " and max range of byte is " + bytemax);
        // short takes 2 bytes
        short shortmax = 32767;
        short shortmin = -32768;
        
        System.out.println(" Min range pf short is "+ shortmin + " and max range of short is " + shortmax);
        
        // int takes 4 bytes
        int intmax = 2147483647;
        int intmin = -2147483648;
    
        System.out.println(" Min range pf int is "+ intmin + " and max range of int is " + intmax);

        // long takes 8 bytes
        long longmax = 9223372036854775807L;    
        long longmin = -9223372036854775808L;

        System.out.println(" Min range pf long is "+ longmin + " and max range of long is " + longmax);

        // float takes 4 bytes
        float floatmax = 3.4028235E38f;
        float floatmin = 1.4E-45f;
        
        System.out.println(" Min range pf float is "+ floatmin + " and max range of float is " + floatmax);
    
    
        // double takes 8 bytes
        double doublemax = 1.7976931348623157E308;
        double doublemin = 4.9E-324;
        
        System.out.println(" Min range pf double is "+ doublemin + " and max range of double is " + doublemax); 
    }
}