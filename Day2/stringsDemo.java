package Day2;

public class stringsDemo {
    public static void main(String[] args) {
    // A string variable contains a collection of characters surrounded by double quotes:

    String name = "Rushi Mangulkar";
    System.out.println(name);

    // String Length
    String exp = "I am a Java Developer";
    System.out.println("Length of the string is "+ exp.length());

    // String Methods
    // toLowerCase() and toUpperCase()
    System.out.println("lowercase:"+ exp.toLowerCase());
    System.out.println("uppercase:"+ exp.toUpperCase());

    // indexOf()
    // It includes white spaces also in the count
    System.out.println("Index of 'J' is "+ exp.indexOf('J'));

    //String Concatenation
    String firstName = "Rushi";
    String lastName = "Mangulkar";
    System.out.println("Full Name: "+ firstName + " " + lastName);

}
}