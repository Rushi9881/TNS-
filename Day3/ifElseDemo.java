package Day3;

public class ifElseDemo {
    public static void main( String[] args) {
       int age = 23;
        
       //if else statement
       if(age > 18){
         System.out.println("You are eligible for voting");
       }
       else{
        System.out.println("You are not eligible for voting");
       }

       //else if statement
       int per = 35;
       if ( per > 35)
       {
        System.out.println("You are passed");
       }
       else if (per == 35)
       {
        System.out.println("You are passed with 35 %");

       }
        else
         {
          System.out.println("You are failed");
         }
       }
    }

