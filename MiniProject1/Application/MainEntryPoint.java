package MiniProject1.Application;
import MiniProject1.Framework.*;

public class MainEntryPoint {
    public static void main(String[] args) {
        // a. Assign instance of GSShopFactory to ShopFactory reference.
        ShopFactory shopFactory = new GSShopFactory();

        // b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
        PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(9881, "Rushikesh Mangulkar", 50.0f, true);

        // c. Instantiate GSNormalAcc and refer it through reference NormalAcc.
        NormalAcc normalAcc = shopFactory.getNewNormalAcc(9999, "Aakash Jha", 100.0f, 100.0f);

        // d. Invoke bookProduct() method.
        primeAcc.bookProduct(30.0f);
        normalAcc.bookProduct(80.0f);

        // e. Invoke toString() method.
        System.out.println(primeAcc.toString());
        System.out.println(normalAcc.toString());
    }
}
