package Day9.FinalVarDemo;

public class FinalMethodDemo extends FinalMethod {
   /* final  void show(){
        System.out.println("Hello");
    }// We can't override the final method
    */
    public void print(){
        System.out.println("Hey.....");
    }// we can override the normal method
   
    public static void main(String[] args) {
        
        FinalMethod fm = new FinalMethod();
        fm.show();
        fm.print();
    }
    
}
