package MiniProject1.Application;
import MiniProject1.Framework.ShopFactory;

public class GSShopFactory extends ShopFactory {
    //A concrete class having complete implementation ofnecessary factory methods to instantiate GSPrimeAcc and GSNormalAcc. Itextends ShopFactory.

    @Override
    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSPrimeAcc(accNo, accNm, charges, isPrime);
    }

    @Override
    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
    }
}
