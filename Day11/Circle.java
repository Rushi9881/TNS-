package Day11;

public abstract class Circle extends Shape{
    float radius;

    public Circle(){
        radius = 2.0f;
    }
    public Circle(float radius){
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
     area = 3.14f * radius * radius;
    }
    
}
