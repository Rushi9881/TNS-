package Day3;

public class shorthandIfElseDemo {
    public static void main(String[] args) {
        int age = 23;
        //if else statement
       if(age > 18){
        System.out.println("You are eligible for voting");
      }
      else{
       System.out.println("You are not eligible for voting");
      }

      //shorthand if else statement
      String Result = (age > 18) ? "You are eligible for voting" : "You are not eligible for voting";
      System.out.println(Result);

    }
    
}
