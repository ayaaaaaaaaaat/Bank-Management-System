import java.time.LocalDate;
public class SavingAccount extends Account{

    // attributes

    private static final float interestRate = 0.05F;
    private static final int maxWithdrawalsPerMonth = 3;
    private static final int maxTransfersPerMonth = 3;
    private int withdrawalsThisMonth = 0;
    private int transfersThisMonth = 0;
    private int currentMonth = LocalDate.now().getMonthValue();

    // constructor(s)

    public SavingAccount(float balance, boolean isCurrentAcc, String accountNumber) {
        super(balance, false, accountNumber);
    }

    // getters

    public static int getMaxWithdrawalsPerMonth() {
        return maxWithdrawalsPerMonth;
    }

    public static float getInterestRate(){return interestRate;}

    public static int getMaxTransfersPerMonth() {
        return maxTransfersPerMonth;
    }

    // methods

    @Override
    public boolean deposit(float amount) {
        if (amount > 0) {
            balance +=  amount;
            return true;
        }
        return false;
    }

    @Override
    public int withdraw(float amount) {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth != this.currentMonth) {
            this.currentMonth = currentMonth;
            withdrawalsThisMonth = 0;
        }
        if (withdrawalsThisMonth == maxWithdrawalsPerMonth) {
            return -1; // Withdrawal limit reached for this month
        }
        if (amount <= balance) {
            balance -= amount;
            withdrawalsThisMonth++;
            return 1;
        }
            return -2; // balance < amount
    }

    @Override
    public int transferMoney (float amount){
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth != this.currentMonth) {
            this.currentMonth = currentMonth;
            withdrawalsThisMonth = 0;
        }
        if (transfersThisMonth == maxTransfersPerMonth) {
            return -2; // transfers limit reached for this month
        }
        boolean transferred =  (amount <= balance);
        if (transferred){
            balance-=amount;
            transfersThisMonth++;
            return 1;
        }
        // save it as a transaction
        return -1;
    }

    public void applyInterest() {
        balance += (balance * interestRate);
    }


}
