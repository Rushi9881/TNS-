package MiniProject1.Framework;
//Child of ShopAcc - Abstract class PrimeAcc.
public abstract class PrimeAcc extends ShopAcc{
    private boolean isPrime;
    private static final float deliveryCharges=0.0f;

//COnstructor
public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime){
    super(accNo, accNm,charges);
    this.isPrime = isPrime;    
}
//Getter and Setter
public boolean getIsPrime(){
    return isPrime;
}

public void setIsPrime(boolean isPrime){
    this.isPrime =isPrime;
  
    
}

//Overridden Methods 1) bookProduct 2)toString

@Override
public void bookProduct(float amount){
    System.out.println("The product amount for prime is:"+amount);

}
@Override
public String toString() {
    return "Prime Account"+super.toString()+"Delivery Charges:"+ deliveryCharges;
}

}



