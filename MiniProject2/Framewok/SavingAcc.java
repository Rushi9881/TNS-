package MiniProject2.Framewok;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    private static final float MINBAL=500.0f;

    public SavingAcc(int accNO, String accNm, float accBal, boolean isSalaried) {
        super(accNO, accNm, accBal);
        this.isSalaried = isSalaried;
       
    }
@Override
public void withdraw(float amount){
    System.out.println("Amount to withdrawn:"+ amount);
}
public String toString(){
    return super.toString()+"isSalaried:"+ isSalaried+"MINBAL:"+MINBAL;
}
    
}
