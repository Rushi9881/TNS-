package MiniProject2.Application;

import MiniProject2.Framewok.*;

public class EntryPoint {
    public static void main(String[] args) {
        // a. Assign instance of MMBankFactory to BankFactory reference.
        BankFactory bankFactory = new MMBankFactory();

        // b. Instantiate MMSavingAcc and refer it through reference SavingAcc.
        SavingAcc savingAcc = bankFactory.getNewSavingAcc(123456, "John Doe", 5000, true);

        // c. Instantiate MMCurrentAcc and refer it through reference CurrentAcc.
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(654321, "Jane Smith", 10000, 5000);

        // d. Invoke withdraw() method.
        savingAcc.withdraw(2000);
        currentAcc.withdraw(7000);

        // e. Invoke toString() method.
        System.out.println(savingAcc);
        System.out.println(currentAcc);
    }
}
