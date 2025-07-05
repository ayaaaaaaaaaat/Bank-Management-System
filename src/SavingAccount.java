import java.time.LocalDate;
public class SavingAccount extends Account{

    // attributes

    private static final double interestRate = 0.05;
    private static final int maxWithdrawalsPerMonth = 3;
    private int withdrawalsThisMonth = 0;
    private int currentMonth = LocalDate.now().getMonthValue();

    // constructor(s)

    public SavingAccount(float balance, boolean isCurrentAcc, String accountNumber) {
        super(balance, false, accountNumber);
    }

    // getters

    public static int getMaxWithdrawalsPerMonth() {
        return maxWithdrawalsPerMonth;
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

    public void applyInterest() {
        balance += (float) (balance * interestRate);
    }

}
