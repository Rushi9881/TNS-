package Day10.Runtimepoly;


public class OverridingDemo {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        System.out.println("RBI Rate of Interest: " + rbi.getRateOfInterest());
        rbi = new Axis();
        System.out.println("Axis Rate of Interest: " + rbi.getRateOfInterest());
        rbi = new ICICI();
        System.out.println("ICICI Rate of Interest: " + rbi.getRateOfInterest());
        rbi = new HDFC();
        System.out.println("HDFC Rate of Interest: " + rbi.getRateOfInterest());
    }
    
}
