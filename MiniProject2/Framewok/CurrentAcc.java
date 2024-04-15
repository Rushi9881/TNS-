package MiniProject2.Framewok;

public abstract class CurrentAcc extends BankAcc {
    private final float creditLimit=500.0f;


    public CurrentAcc(int accNO, String accNm, float accBal, float creditLimit) {
        super(accNO, accNm, accBal);
        //TODO Auto-generated constructor stub
    }
    @Override

    public void withdraw(float amount){
        System.out.println("Amount to withdraw:"+ amount);
    }

    public String toString(){
        return  super.toString()+"Credit Limit"+ creditLimit;
    }

    


    
}
