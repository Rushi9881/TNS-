package Day9.FinalVarDemo;

public class FinalVariable {

    //Declare the final variable
    
    final int x = 9881;

    //int max = 8600; //It will give error because max is final variable
    //Final variables can be initialized.
    
    final static int y = 1000;
    //static final int min = 1000; //It will give error because min is final variable
    final static int z;
    public void change(){
        //x = 1000; //It will give error because x is final variable
        //y = 1000; //It will give error because y is final variable

    }

    static{
       // x = 100; it is static block so it will give error because x is not static variable and it is also final variable
        //y = 100; it can't be changed because it is final variable and initialized
        z = 86; //We can give the value for Z because it is static and we have not initialized it so we can Initialize it in static block
    }

   

    
}
