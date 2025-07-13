public class CurrentAccount extends Account{

    //attributes

    private static final double overdraftLimit = 10000.0;

    // constructor(s)

    public CurrentAccount(float balance , boolean isCurrentAcc , String accountNumber){
        super(balance, true, accountNumber);
    }

    // getters

    public static double getOverdraftLimit() {
        return overdraftLimit;
    }

    //methods

    @Override
    public boolean deposit(float amount){
        if(amount > 0){
            balance+=amount;
            return true;
        }
        return false;
    }

    @Override
    public int withdraw(float amount){
        if(amount <= balance + overdraftLimit){
            balance -= amount;
            if(balance < 0 )
                return 2;
            return 1;
        }
        return -1;
    }
    @Override
    public int transferMoney (float amount){
        boolean transferred =  (amount <= balance+overdraftLimit);
        if (transferred) {
            balance -= amount;
            return 1;
        }
        // save it as a transaction
        return -1;
    }
}
