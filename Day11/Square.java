package Day11;

public abstract class Square extends Shape {
    float side;

    public Square(){
        side = 2.0f;
    }
    public Square(float side){
        this.side = side;
    }
    @Override
    public void calculateArea(){
     area = side * side;
    }
    
}
