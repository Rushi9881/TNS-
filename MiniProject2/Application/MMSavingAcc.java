package MiniProject2.Application;
import MiniProject2.Framewok.SavingAcc;


class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 1000;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds minimum balance limit.");
        }
    }
}