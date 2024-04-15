package Day9.Polymorphism.Compiletimedemo;


public class OverloadingDemo {
    //Constructor Overloading
    public static void main(String[] args) {
        point p1 = new point();
        System.out.println(p1);

        point p2 = new point(10.5f);
        System.out.println(p2);

        point p3 = new point(10.5f, 20.5f);
        System.out.println(p3);

    //Method Overloading
    MethodOverloading m = new MethodOverloading();
    System.out.println(m.add(10, 20));
    System.out.println(m.add(10, 20.5f));
    System.out.println(m.add(10.5f, 20.5f));
    System.out.println(m.add(10.5f, 20));
    
        
    }
    
    
    
}
