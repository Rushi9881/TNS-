package Day7.Multilevel_Inheritance;
//Entity Class
public class Country {
    //Data members
    private String countryname;
    private String capital;
    private int population;
    private int countrycode;

    //Getters
    public String getCountryname(){
        return countryname;
    }
    public String getCapital(){
        return capital;
    }
    public int getPopulation(){
        return population;
    }
    public int getCountrycode(){
        return countrycode;
    }
    //Setters
    public void setCountryname(String countryname){
        this.countryname = countryname;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public void setCountrycode(int countrycode){
        this.countrycode = countrycode;
    }
    //toString()
    public String toString(){
        return "countryname: " + countryname + "\n" +
                "capital: " + capital + "\n" +
                "population: " + population + "\n" +
                "countrycode: " + countrycode;
    }
}
