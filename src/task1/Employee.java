package task1;


// Class to represent an Employee
class Employee
{
    private int id;
    String name;
    protected Transaction[] transactions;


    public Employee(int id, String name, int transactionCount)
    {
        this.id = id;
        this.name = name;
        this.transactions = new Transaction[transactionCount];
    }

    // Protected method to add a transaction
    protected void addTransaction(int index, Transaction transaction)
    {
        if (index >= 0 && index < transactions.length)
        {
            transactions[index] = transaction;
        } else
        {
            System.out.println("Invalid transaction index for Employee ID: " + id);
        }
    }



    }



