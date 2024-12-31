package Interfaces;

public class ArithmetricOperationsMain {

    public static void main(String[] args) {


        int a = 10;
        int b = 5;
        ArithmetricInterface ap = new ArithmetricImplements();


        System.out.println(ap.addition(a,b));
        System.out.println(ap.subtraction(a,b));
        System.out.println(ap.multiplication(a,b));
        System.out.println(ap.divison(a,b));


    }
}
