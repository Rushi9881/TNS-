package Day12.Extendeddemo;


public interface ExtendedInterface extends InterfaceOne {

    //Here it is extending InterfaceOne and it is also a functional interface.
    //If I try to create one method here, it will give me an error.
    //But if we delete @functionalInterface then we can create one more method here.

    void Show();
} 
