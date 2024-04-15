package MiniProject1.Framework;


public abstract class NormalAcc extends ShopAcc {
    private final float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }

    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked for Normal Account with delivery charges: " + (amount + deliveryCharges));
    }

    @Override
    public String toString() {
        return "Normal Account - " + super.toString()+"Delivery Charges:"+ deliveryCharges;
    }
}
