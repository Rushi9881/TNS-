package Staticblock;

public class MyclassDemo {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        System.out.println(m);
        MyClass m1 = new MyClass();
        System.out.println(m1);

        MyClass.display();
    }
    
}
