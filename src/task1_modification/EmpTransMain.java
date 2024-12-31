package task1_modification;

import java.util.Arrays;

public class EmpTransMain {
    public static void main(String[] args) {


        //empid,type-(debit ,credit),amount ,debitname,creditcard name
        Transaction trans1=new Transaction(1, "debit", 1200.5,"HDFC",null);
        Transaction trans2=new Transaction(1, "debit", 1200.5,"HDFC",null);
        Transaction trans3=new Transaction(1, "credit", 1200.5,null,"SBI");
        Transaction trans4=new Transaction(1, "credit", 1200.5,null,"Axis");

        Transaction[] transactions={trans1,trans2,trans3,trans4};


        //int id, String name, Transaction transaction

        Employee emp=new Employee(1,"Chinna",Arrays.toString(transactions));

        System.out.println(emp);


    }

}
