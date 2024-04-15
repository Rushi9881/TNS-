package Day10;

public class CovarientDemo {
    public static void main(String[] args) {
        Color c = new Color();
        System.out.println("Color: " + c.getColor());
        c = new Red();
        System.out.println("Red: " + c.getColor());
        c = new Green();
        System.out.println("Green: " + c.getColor());
    }
}