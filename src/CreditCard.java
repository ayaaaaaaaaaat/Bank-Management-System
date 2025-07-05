public class CreditCard {

    //attributes

    private static final float CreditLimit = 20000.0F;
    private final String cardNumber;
    private final String ownerName;
    private float balance;
    private int loyaltyPoints = 0;

    // constructor(s)

    public CreditCard(String ownerName, String cardNumber) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.balance = CreditLimit;
    }

    // getters

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public float getBalance() {
        return balance;
    }

    public int getLoyaltyPoints(){
        return loyaltyPoints;
    }

    // setters

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public void setBalance(float amount) {
        balance = amount;
    }

    // methods

    public CreditCard showCardDetails() {
        return new CreditCard(ownerName,cardNumber);
    }

}
