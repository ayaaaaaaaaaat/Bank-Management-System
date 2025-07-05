import java.util.ArrayList;
import java.util.UUID;

public class Client extends User{

    // attributes

    private Account myAccount ;
    private CreditCard creditCard;
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    // constructor(s)

    public Client(String firstName, String lastName, String username, String phone, String password, String id , float balance , boolean isCurrentAcc) {
        super(firstName, lastName, username, phone, password, id);
        String accountNumber = username + UUID.randomUUID().toString();
        if(isCurrentAcc) {
            //myAccount = new CurrentAccount(balance, isCurrentAcc, accountNumber);
        }
        else{
            myAccount = new SavingAccount(balance, false, accountNumber);
        }
    }

    //getters

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public Account getMyAccount() {
        return myAccount;
    }

    // setters

    public void setMyAccount(Account myAccount) {
        this.myAccount = myAccount;
    }

    // methods

    public void editPersonalInformation(int number){

    }

    public Client displayAccountDetails(){
        return new Client(firstName,lastName,username,phone,password,id, myAccount.getBalance(), myAccount.isCurrentAcc());
    }

    public boolean transferMoney (float amount){
        boolean transferred =  (amount <= myAccount.getBalance());
        if (transferred)
            myAccount.setBalance(myAccount.getBalance()-amount);
        // save it as a transaction
        return transferred;
    }

    public int requestCreditCard() {
        if (creditCard != null) {
            return 1; // Already has a credit card
        } else {
            String cardNumber = "CARD-" + UUID.randomUUID().toString().substring(0, 8);
            creditCard = new CreditCard(username, cardNumber);
            return 2; // Successfully issued
        }
    }

    public boolean payWithCreditCard(float amount){
        if(creditCard != null && creditCard.getBalance() >= amount){
            creditCard.setBalance(creditCard.getBalance() - amount);
            creditCard.setLoyaltyPoints((int) (creditCard.getLoyaltyPoints()+(amount/26)+2));
            return true;
        }
        return false;
    }

    public boolean disableCreditCard(){
        if(creditCard != null) {
            creditCard = null;
            return true;
        }
        return false;
    }
    // lesa hakamelha
    public boolean takeDeposit (float amount){
        return false;
    }
}
