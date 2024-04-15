package Day10;

//Parent class
public class Color {

    protected Color getColor() {
        Color s = new Color();
        return s;
        }
    
}

//Child class
class Red extends Color{
    protected Red getColor() {
        Red s = new Red();
        return s;
    }
}

class Green extends Color{
    protected Green getColor() {
        Green s = new Green();
        return s;
    }
}
