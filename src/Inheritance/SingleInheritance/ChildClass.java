package Inheritance.SingleInheritance;

public class ChildClass extends ParentClass {



        ChildClass(String input) {
           super(input);
        }
        ChildClass() {

        }

        public  String displayName() {
            return "My name is " + name;  // accessing the superclass attribute
        }
    }


