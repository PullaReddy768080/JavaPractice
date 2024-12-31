package task1_modification;
//empid,type-(debit ,credit),amount ,debitname,creditcard name
public class Transaction {
    private int empId;
    private String type;
    private double amount;
    private String debitName;
    private String creditName;

    public Transaction(int empId, String type, double amount, String debitName, String creditName) {
        this.empId = empId;
        this.type = type;
        this.amount = amount;
        this.debitName = debitName;
        this.creditName = creditName;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "empId=" + empId +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", debitName='" + debitName + '\'' +
                ", creditName='" + creditName + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDebitName() {
        return debitName;
    }

    public void setDebitName(String debitName) {
        this.debitName = debitName;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }
}
