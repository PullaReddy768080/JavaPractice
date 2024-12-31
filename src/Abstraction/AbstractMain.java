package Abstraction;

public class AbstractMain {

    public static void main(String[] args) {


        ArithmetricAbstract abstractObject = new AbstractImplements();

        System.out.println(abstractObject.addition(5, 10));
        System.out.println(abstractObject.multiplication(2, 4));

    }
}
