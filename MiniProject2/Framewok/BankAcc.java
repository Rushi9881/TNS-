package MiniProject2.Framewok;

public abstract class BankAcc {
    private int accNo;
    private String accNm;
    private float accBal;

public BankAcc(int accNO, String accNm, float accBal){
    this.accNo = accNO;
    this.accBal = accBal;
    this.accNm = accNm;
}

public int getAccNo(){
    return accNo ;
} 
public void setAccNo(int accNo){
    this.accNo = accNo;
}

public String getAccNm(){
    return accNm;
}
public void setAccNm(String accNm){
    this.accNm= accNm;
}
public float getAccBal(){
    return accBal;
}
public void setAccBal(float accBal){
    this.accBal = accBal;

}

public void withdraw(float amount){
    System.out.println("Given is the amount that you are withdrawing:"+amount);
}

public void deposite(float amount){
    System.out.println("Deposite amount:"+amount);
}

@Override
public String toString(){
    return "AccNo"+ accNo +"Acc Name:" + accNm +"Acc Balance:"+accBal;
}
    
}
