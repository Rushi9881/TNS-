package Day7.Multilevel_Inheritance;
//Child of country

public class State extends Country {
    //Data members
    private String statename;
    private String language;

    //Getters and setters
    public void setstatename(String statename){
        this.statename = statename;
    }
    public void setlanguage(String language){
        this.language = language;
    }
    public String getstatename(){
        return statename;
    }
    public String getlanguage(){
        return language;
    }
    //toString()
    public String toString(){
        return super.toString() + "\n" +
                "statename: " + statename + "\n" +
                "language: " + language;
    }


    
}
