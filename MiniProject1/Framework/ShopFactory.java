package MiniProject1.Framework;
//Abstract Class for ShopFactory

public abstract class ShopFactory {

    //An abstract class having necessary factory methods to instantiate new Prime or Normal types of accounts.
    public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);

    public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
}
