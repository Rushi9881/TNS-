package Day7.Multilevel_Inheritance;

public class Driver {
    public static void main(String[] args) {
        city c = new city();
        c.setcityname("Pune");
        c.setarea(988.33f);
        c.setpopulationcity(1265482);
        c.setstatename("Maharashtra");
        c.setlanguage("Marathi");
        c.setCountryname("India");
        c.setCapital("Delhi");
        c.setPopulation(908633196);
        c.setCountrycode(91);
        System.out.println(c.toString());
    }
    
}
