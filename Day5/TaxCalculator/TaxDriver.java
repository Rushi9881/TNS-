package Day5.TaxCalculator;

import java.util.Scanner;

public class TaxDriver {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String setName = s.nextLine();
        System.out.println("Enter your gender");
        String setgender = s.nextLine();
        System.out.println("Enter your age in years:");
        int setAge = s.nextInt();
        System.out.println("Enter your income :");
        int setIncome = s.nextInt();
        person person = new person(setName, setAge, setgender, setIncome);
      
      
        /*  person person = new person();
        person.setName("Rushikesh");
        person.setgender("M");
        person.setAge(24);
        person.setIncome(500000);*/


        taxCalculator tc = new taxCalculator();
        tc.calculateTax(person);

        System.out.println(person.toString());
        s.close();
    }
}
