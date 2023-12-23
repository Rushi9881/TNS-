package Day2;

public class operatorsDemo {
    public static void main(String[] args) {
        
        // Arithmetic Operators
        int a = 10;
        int b = 20;
    // Addition
    int add = a + b;
    System.out.println("Addition: " + add);
    // Subtraction
    int sub = a - b;
    System.out.println("Subtraction: " + sub);
    // Multiplication
    int mul = a * b;
    System.out.println("Multiplication: " + mul);
    // Division
    int div = a / b;
    System.out.println("Division: " + div);
    // Modulus
    int mod = a % b;
    System.out.println("Modulus: " + mod);
    // Increment
    int inc = ++a;
    System.out.println("Increment: " + inc);
    // Decrement
    int dec = --b;
    System.out.println("Decrement: " + dec);


    // Assignment Operators
    //= operator
    int c = 10;
    //+= operator  
    c += 5;     // c = c + 5
    System.out.println("+= Operator: " + c);

    //-= operator
    c -= 5;    // c = c - 5
    System.out.println("-= Operator: " + c);

    //*= operator
    c *= 5;    // c = c * 5
    System.out.println("*= Operator: " + c);
    ///= operator
    c /= 5;   // c = c / 5
    System.out.println("/= Operator: " + c);

    //%= operator
    c %= 5;   // c = c % 5
    System.out.println("%= Operator: " + c);
    

    // Comparison Operators
    // == operator
    System.out.println("== Operator: " + (a == b));
    // != operator
    System.out.println("!= Operator: " + (a != b));
    // > operator
    System.out.println("> Operator: " + (a > b));
    // < operator
    System.out.println("< Operator: " + (a < b));
    // >= operator
    System.out.println(">= Operator: " + (a >= b));
    // <= operator
    System.out.println("<= Operator: " + (a <= b));


    // Logical Operators
    // && operator
    int x = 10;
    int y = 20;

    //&& operator
    System.out.println("&& Operator: " + ((x < y) && (x != y)));

    // || operator
    System.out.println("|| Operator: " + ((x < y) || (x != y)));

    // ! operator
    System.out.println("! Operator: " + !(x < y));

    }
}
