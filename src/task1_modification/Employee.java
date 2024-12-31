package task1_modification;

public class Employee
{
    private int id;
    private String name;
    private String transaction;

    public Employee(int id, String name, String transaction) {
        this.id = id;
        this.name = name;
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "EmpTransMain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transaction=" + transaction +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
}
