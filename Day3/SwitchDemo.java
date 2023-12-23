package Day3;
public class SwitchDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        char operation = '+';
        switch (operation) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println (a*b);
                break;
            case '/':
                System.out.println (a/b);
                break;
            case '%':
                System.out.println (a%b);
                break;
            default:
                System.out.println(" You have entered wrong operation ");


        }
    }
    
}
