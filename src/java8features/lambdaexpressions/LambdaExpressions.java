package java8features.lambdaexpressions;

import java.util.function.*; //this consists of all below ones and more


/*1.Functional interfaces
->Predicate
->Function
->Consumer
->Supplier*/

public class LambdaExpressions {
    public static void main(String[] args) {
        //below 1.8 :1
        AdditionInterface addition = new AdditionImplementation();
        int add = addition.add(1, 2);
        System.out.println(add);

        //2
        AdditionInterface anonymous = new AdditionImplementation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("anonymous: " + anonymous.add(1, 2));
        AdditionInterface anonymousToLambda = (int a, int b) -> {
            return a + b;
        };


        //3)1.8
        AdditionInterface addFunctionalInterface = (a, b) -> {
            System.out.println("a :" + a + " b :" + b);
            return a + b;
        };
        System.out.println(addFunctionalInterface.add(1, 2));
        Predicate<Integer> predicate=(Integer i)->{
            if (i==1) return true;
            else return false;
        };
        System.out.println(predicate.test(2));

        //Predicate Interface
        Predicate<Employee> predicate2 = (Employee employee) -> {if (employee.getId() == 1)
            return true;
        else return false;
        };
        Employee employee=new Employee();
        employee.setId(1);
        System.out.println(predicate2.test(employee));


        //Using Function Interface

        Function<Employee,Integer> fun=(Employee employee2) ->
        {
            if (employee2.getId()==1)

                return 1;
            else return -1;


        };
        System.out.println(fun.apply(employee));

        //Using Consumer Interface

        Consumer<Employee> consum=(Employee employee3)->
        {
            if(employee3.getId()==1)
                System.out.println("Matching");
            else System.out.println("Not matching");

        };
        consum.accept(employee);

        //Supplier Interface

        Supplier<Employee> sup= ()->{
                     return new Employee();

                };


        Employee supEmp=sup.get();

        supEmp.setId(2);
        System.out.println(supEmp.getId());










    }
}
