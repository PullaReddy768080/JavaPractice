package Calculator;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arithmetric operations");
        System.out.println("What kind of operation you want to perform");
        System.out.println("1.add");
        System.out.println("2.div");
        System.out.println("3.sub");
        System.out.println("4.mul");
        System.out.println("Please enter index number : ");
        String s = scanner.next();
        System.out.println("please enter 1st value");
        int a = scanner.nextInt();
        System.out.println("please enter 2nd value");
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();
        if (s.equals("1")) {
            System.out.println("total sum : ");
            System.out.println(calculator.add(a, b));
        } else if (s.equals("4")) {
            System.out.println("total mul : ");
            System.out.println(calculator.mul(a, b));
        } else if (s.equals("2")) {
            if (b==0){
               System.out.println("B should not be zero for division operator or Undefined");
            }
            else{
                System.out.println("total div : ");
                System.out.println(calculator.div(a, b));
            }
           

        }
        else if (s.equals("3")) {
            System.out.println("total sub : ");
            System.out.println(calculator.sub(a, b));
        }
        else{
            System.out.println("Enter the invalid input");
        }

    }

    private int add(int a, int b) {
        return a + b;
    }

    private int mul(int a, int b) {
        return a * b;
    }
    private int div(int a, int b) {
        return a/b;

    }
    private int sub(int a, int b) {
        return a-b;

    }
}

