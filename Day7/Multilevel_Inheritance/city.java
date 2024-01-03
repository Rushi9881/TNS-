package Day7.Multilevel_Inheritance;
//Child of state
public class city extends State{
    //Data members
    private String cityname;
    private float area;
    private double populationcity;

    //Getters and setters
    public void setcityname(String cityname){
        this.cityname = cityname;
    }
    public void setarea(float area){
        this.area = area;
    }
    public void setpopulationcity(double populationcity){
        this.populationcity = populationcity;
    }
    public String getcityname(){
        return cityname;
    }
    public float getarea(){
        return area;
    }
    public double getpopulationcity(){
        return populationcity;
    }

    //toString()
    public String toString(){
        return super.toString() + "\n" +
                "cityname: " + cityname + "\n" +
                "area: " + area + "\n" +
                "populationcity: " + populationcity;
    }

}
