package MiniProject1.Application;

import MiniProject1.Framework.NormalAcc;;
public class GSNormalAcc extends NormalAcc {

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
        
    }

    @Override
    public void bookProduct(float amount) {
    
        System.out.println("Product booked for Normal Account with delivery charges: " + (amount + getDeliveryCharges()));
    }

    @Override
    public String toString() {
        return "GSNormalAcc - " + super.toString();
    }
}
