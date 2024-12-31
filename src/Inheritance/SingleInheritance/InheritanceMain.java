package Inheritance.SingleInheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        ChildClass cc = new ChildClass("task1_modification");
        System.out.println(cc.displayName());
        cc.eat();
        System.out.println(cc.name);
    }
}
