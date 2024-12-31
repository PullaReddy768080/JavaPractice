package task1;
import java.util.*;

 // Main class
 class EmpTransactionMainClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask for the number of employees
            System.out.print("Enter the number of employees: ");
            int numEmployees = scanner.nextInt();

            // Create an array of employees
            Employee[] employees = new Employee[numEmployees];

            // Input details for each employee
            for (int i = 0; i < numEmployees; i++) {
                System.out.println("\nEnter details for Employee " + (i + 1) + ":");

                // Input employee ID and name
                System.out.print("Enter Employee ID: ");
                int empId = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.print("Enter Employee Name: ");
                String empName = scanner.nextLine();

                // Input number of transactions for the employee
                System.out.print("Enter the number of transactions: ");
                int numTransactions = scanner.nextInt();

                // Create the employee object
                employees[i] = new Employee(empId, empName, numTransactions);

                // Input transactions
                for (int j = 0; j < numTransactions; j++) {
                    System.out.println("Enter details for Transaction " + (j + 1) + ":");
                    System.out.print("Enter Transaction Type (credit/debit): ");
                    String type = scanner.next();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();

                    // Handle debit and credit-specific details
                    String debitName = null, creditCardName = null;
                    if (type.equalsIgnoreCase("debit")) {
                        System.out.print("Enter Debit Name: ");
                        debitName = scanner.next();
                    } else if (type.equalsIgnoreCase("credit")) {
                        System.out.print("Enter Credit Card Name: ");
                        creditCardName = scanner.next();
                    }

                    // Add transaction to the employee
                    Transaction transaction = new Transaction(empId, type, amount, debitName, creditCardName);
                    employees[i].addTransaction(j, transaction);
                }
            }



        }
 }


