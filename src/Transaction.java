import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {

    // attributes

    private final String transactionId;
    private final String senderAccountNumber;
    private final String receiverAccountNumber;
    private final float amount;
    private final String type;
    private final LocalDateTime timestamp;
    private final int status;

    // constructor(s)

    public Transaction(String senderAccountNumber , String receiverAccountNumber , float amount ,int status){
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.amount = amount;
        this.transactionId = UUID.randomUUID().toString();
        if (senderAccountNumber == null && receiverAccountNumber != null) {
            this.type = "Deposit";
        } else if (senderAccountNumber != null && receiverAccountNumber == null) {
            this.type = "Withdraw";
        } else if (senderAccountNumber != null) {
            this.type = "Transfer";
        } else {
            this.type = "Unknown";
        }
        this.timestamp = LocalDateTime.now();
        this.status=status;
    }

    // getters

    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public float getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

}
