package Day16.Synchronization;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(){
        super("Insufficient balance in your account");
    }
    
    
}
