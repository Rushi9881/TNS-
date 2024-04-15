package Day12.NestedDemo;

public class Nesteddemo implements outerinterface, outerinterface.innerinterface {


    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Inner interface method");
    }

    @Override
    public void calArea() {
        // TODO Auto-generated method stub
        System.out.println("Outer interface method");
    }
    
}
