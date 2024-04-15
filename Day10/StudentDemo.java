package Day10;

public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        student s1 = new student(62,"Rahul","GHRCEM","Computer Science");
        System.out.println(s1.toString());
        
        student s3 = s1.clone();
        s3.setName("Ram");
        s3.setBranch("Cs");
        s3.setCollege("Ghr");
        s3.setRollNo(54);
        System.out.println(s3.toString());

    }
    
}
