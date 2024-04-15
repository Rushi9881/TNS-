package MiniProject2.Application;
import MiniProject2.Framewok.CurrentAcc;

class MMCurrentAcc extends CurrentAcc {
    private float creditLimit;

    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit - amount >= 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds balance and credit limit.");
        }
    }
}
