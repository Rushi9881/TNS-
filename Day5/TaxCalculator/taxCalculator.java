package Day5.TaxCalculator;

public class taxCalculator {
    
    public void calculateTax(person person)
    {
        if(person.getAge() <= 65  || person.getgender().equalsIgnoreCase("male")){

            person.setTax(0);
            System.out.println("Tax is not applicable");

        }
        else{
            if(person.getIncome() <= 160000)
            {
                person.setTax(0);
                System.out.println("Tax is not applicable");
            }
            else if(person.getIncome()> 160000 && person.getIncome() <= 500000)
            {
                person.setTax(0.1 * person.getIncome());
                System.out.println("Your tax is:"+ person.getTax() + "INR");

            } 
            else if(person.getIncome()> 500000 && person.getIncome() <= 800000)
            {
                person.setTax(0.2 * person.getIncome());
                System.out.println("Your tax is:"+ person.getTax()+ "INR");

            } 
            else if(person.getIncome()> 800000 && person.getIncome() <= 200000)
            {
                person.setTax(0.3 * person.getIncome());
                System.out.println("Your tax is:"+ person.getTax()+"INR");

            } 
        }
    }
}


