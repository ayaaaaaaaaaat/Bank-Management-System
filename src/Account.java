public abstract class Account {

    //attributes

    protected String accountNumber ;
    protected float balance;
    protected boolean isActive ;
    protected boolean isCurrentAcc;

    // constructor(s)

    public Account(float balance , boolean isCurrentAcc , String accountNumber){
        this.balance = balance;
        this.isActive = true;
        this.isCurrentAcc = isCurrentAcc;
        this.accountNumber = accountNumber;
    }

    // getters

    public float getBalance(){
        return balance;
    }

    // setters

    public void setBalance(float balance){
        this.balance = balance;
    }

    // abstract methods

    public abstract boolean deposit(float amount);
    public abstract int withdraw(float amount);
    public abstract int transferMoney (float amount);

    // methods

    public boolean isCurrentAcc(){
        return isCurrentAcc;
    }

}
