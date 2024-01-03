package Day7.Single_Inheritence;

public class Driver {

    public static void main(String[] args) {
        student s = new student();
        student s1 = new student(1, "IIT", "CSE","Rushikesh",0, "Mudkhed",25, "Mudkhed", "Male");
        System.out.println(s1.toString());
        System.out.println(s);

        }
    
}
