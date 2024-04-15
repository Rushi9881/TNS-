
package Day16.Synchronization;


public interface bank {
    static final int MINBAL=6000;
    static final int DAILY_LIMIT=25000;
    
    void deposit(int amt)throws DepositLimitExceedException;
    void withdraw(int amt) throws InsufficientBalanceException;

    
}