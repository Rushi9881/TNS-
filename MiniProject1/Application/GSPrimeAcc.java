package MiniProject1.Application;

import MiniProject1.Framework.PrimeAcc;


public class GSPrimeAcc extends PrimeAcc {
    private static final float CHARGES = 0.0f;

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked for Prime Account with charges: " + amount);
    }

    @Override
    public String toString() {
        return "GSPrimeAcc - " + super.toString()+"Charges:"+ CHARGES;
    }
}
