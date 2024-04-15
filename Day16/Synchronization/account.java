package Day16.Synchronization;



public class account implements bank {
    private int accNo;
    private String name;
    private double balance;

    //getter and setter

    public int getaccNo(){
        return accNo;
    }
    public String getname(){
        return name;
    }
    public double getbalance()
    {
    return balance;
    }   

    public void setaccNo(int accNo){
        this.accNo=accNo;
    }
    public void setname (String name){
        this.name= name;
    }
    public void setbalance (double balance){
        this.balance=balance;
    }

    public account(int accNo,String name, double balance){
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;

    }

    @Override
    public void deposit(int amt) throws DepositLimitExceedException {
        if(amt>25000)
        throw new DepositLimitExceedException("Daily Limit Exceeds.........");
        else{
            balance += amt;
            System.out.println("Amount Deposited........."+amt);
        }
        }
    @Override
    public void withdraw(int amt) throws InsufficientBalanceException{
        if (balance - amt <MINBAL )
            throw new InsufficientBalanceException();
        else{
            balance -= amt;
            System.out.println("Amount withdrawn........"+amt);
        }
    
    }
    @Override
    public String toString(){
        return "account number"+accNo+"account name:"+name+"balance:"+balance;
    }
}   
