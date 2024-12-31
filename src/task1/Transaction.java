package task1;

// Class to represent a Transaction
class Transaction {
    private int empId; // Private: Accessible only within this class
    public String type; // Public: Accessible everywhere
    protected double amount; // Protected: Accessible within package and subclasses
    String debitName; // Default (package-private): Accessible within package
    public String creditCardName; // Public: Accessible everywhere

    // Constructor
    public Transaction(int empId, String type, double amount, String debitName, String creditCardName) {
        this.empId = empId;
        this.type = type;
        this.amount = amount;
        this.debitName = debitName;
        this.creditCardName = creditCardName;
    }


    public String getType()
    {
        return type;
    }

    // Override toString to print transaction details
    @Override
    public String toString() {
        if (type.equalsIgnoreCase("debit")) {
            return "Transaction: Type = " + type + ", Amount = " + amount + ", Debit Name = " + debitName;
        } else {
            return "Transaction: Type = " + type + ", Amount = " + amount + ", Credit Card Name = " + creditCardName;
        }
    }
}