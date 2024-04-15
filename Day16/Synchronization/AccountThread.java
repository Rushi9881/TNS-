package Day16.Synchronization;

public class AccountThread extends Thread {
    private account acc;
    private int amt;

    public AccountThread(account acc, int amt){
        this.acc=acc;
        this.amt=amt;
        start();
    }

    @Override
    public void run(){
        try
        {
            acc.withdraw(amt);
        }catch (InsufficientBalanceException e){
            System.err.println(e.getMessage());
        }
    }
    
}
