package Day8.has_a_relationship;

public class Executor {
    public static void main(String[] args) {
        Address address = new Address("Kasar Galli", "Mudkhed", "Maharashtra", 431806);
        System.out.println(address);
        person p = new person("Rushikesh", address);
        p.display();
    }

}
    

