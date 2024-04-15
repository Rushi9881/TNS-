
package MiniProject1.Framework;

//Abstract ShopAcc Class

public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    //Constructor
    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }
    //Getter and Setters
    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getCharges() {
        return charges;
    }

    //toString
    @Override
    public String toString() {
        return "Account Number: " + accNo + ", Account Name: " + accNm + ", Charges: " + charges;
    }
    //items method for displaying the selected numbers of item
    public void items(float item){
        System.out.println("You have selected "+item +"items.");
    }

    //bookProduct Method for displaying the amount of booked products.

    public void bookProduct(float amount){        
        System.out.println("Total Amount of booked products: "+amount);

    };
}
