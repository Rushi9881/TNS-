package Staticblock;

public class MyClass {
    private int section;
    private static int srNO;

    //Getter and setter
    public int getSection() {
        return section;
    }
    public void setSection(int section) {
        this.section = section;
    }
    public static int getSrNO() {
        return srNO;
    }
    public static void setSrNO(int srNO) {
        MyClass.srNO = srNO;
    }

    //Static Block
    static {
        System.out.println("Static Block");
        srNO = 98;
    }
    //Default Constructor
    public MyClass(){
        System.out.println("Default Constructor");
        srNO++;
        section++;
    }
    //toString Method
    @Override
    public String toString() {
        return "MyClass [section=" + section + ", srNO=" + srNO + "]";
    }
    //Static Method
    static void display(){
       System.out.println(srNO);
       //System.out.println(section); it will give error because section is non-static
    }
    //Non-Static Method
    public void print(){
        System.out.println(srNO);
        System.out.println(section);
    }
}
