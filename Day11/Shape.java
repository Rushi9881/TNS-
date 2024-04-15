package Day11;

public abstract class Shape {
    protected float area;

    //abstract method
    public abstract void calculateArea();

    //solid method
    public void show(){
        System.out.println("Area: " + area + " sq. units");
    }
    
}
