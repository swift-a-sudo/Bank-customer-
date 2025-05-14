class Transaction {
    String transactionId, senderName, receiverName, status, date;
    double amount;

    Transaction(String transactionId, String senderName, String receiverName, double amount, String status, String date) {
        this.transactionId = transactionId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    void displayTransaction() {
        System.out.println(transactionId + " | " + senderName + " → " + receiverName + " | ₹" + amount + " | " + status + " | " + date);
    }
}

class TransactionHistory {
    Transaction[] transactions = {
        new Transaction("1001", "Amogh", "Ravi", 5000, "Successful", "14-05-2025"),
        new Transaction("1002", "John", "Doe", 3000, "Failed", "13-05-2025")
    };

    void displayAllTransactions() {
        System.out.println("Transaction History:");
        for (Transaction t : transactions) t.displayTransaction();
    }

    public static void main(String[] args) {
        new TransactionHistory().displayAllTransactions();
    }
}