package Day9.Polymorphism.Compiletimedemo;

public class point {
    private float x,y;

    //Default Constructor
    public point() {
        x = 0.0f;
        y = 0.0f;
    }

    //Parameterized Constructor
    public point(float x) {
        this.x = x;
        
    }
    //Parameterized Constructor
    public point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //toString method
    @Override
    public String toString() {
        return "point [x=" + x + ", y=" + y + "]";
    }

    
}
