package Day9.FinalVarDemo;

public class FinalMethod {
    int a =10;
    
    public FinalMethod(){
        System.out.println("default Constructor of FinalMethod");
    }

    //final method
    final void show(){
        System.out.println("Value of a is "+a);

    }

    public void  print(){
       System.out.println("Hello");
    }

    
}
