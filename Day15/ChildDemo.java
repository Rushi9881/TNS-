package Day15;

public class ChildDemo {
    public static void main(String[] args) {
        ChildThread c = new ChildThread(10, "Hello");
        ChildThread c1 = new ChildThread(8, "Rushi");

        

        c.start();
        c1.start();

        System.out.println("End of the program:");
    }
    
}
