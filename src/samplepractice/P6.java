package samplepractice;





import java8features.stream.employeestreamapis.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class P6
{
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setDept("dept-1");
        employee1.setName("emp1");
        employee1.setSalary(100.24);
        Employee employee2 = new Employee(2, "dept-2", "emp-2", 200.54);
        Employee employee3 = new Employee(3, "dept-3", "emp-3", 300.54);
        Employee employee4 = new Employee(4, "dept-4", "emp-4", 400.54);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        //int byte short long double

        Stream<Employee> eStream = employees.stream();
        int count = (int) eStream.count();
        //no of employees
        System.out.println("no of employees: " + count);

        //total salaries of all the employees

         //here forEach,  sum are terminal operations

        DoubleStream doubleStream = employees.stream().mapToDouble(Employee::getSalary);
        double sum = doubleStream.sum();
        System.out.println(sum);

        System.out.println("--");

        employees.stream().mapToDouble(Employee::getSalary).forEach(System.out::println);

        System.out.println("......................");
        DoubleStream doubleStream1 = employees.stream().mapToDouble(Employee::getSalary).sorted();
        doubleStream1.forEach(System.out::println);
        System.out.println("......................");

        DoubleStream doubleStream2 = employees.stream().mapToDouble(Employee::getSalary).sorted().skip(1);
        doubleStream2.forEach(System.out::println);
        System.out.println("****************************");

        //here OptionalDouble is a container
        OptionalDouble optionalDouble = employees.stream().mapToDouble(Employee::getSalary).min();
        if (optionalDouble.isPresent()) {
            System.out.println("min value: " + optionalDouble.getAsDouble());
        }

        System.out.println("*************************");
        OptionalDouble optionalDouble2 = employees.stream().mapToDouble(Employee::getSalary).max();
        if (optionalDouble2.isPresent()) {
            System.out.println("max : " + optionalDouble2.getAsDouble());
        }



       /* //Static  methode references
        Employee.getIDWithName();
        Employee::getIDWithName;
        //Instance
        Employee employee=new Employee();
        employee::getId;
        //Constructor
        Employee::new;*/
  System.out.println("--");
        employees.stream()
                .mapToDouble(Employee::getSalary)
                .peek(System.out::println)  // Prints each salary
                .sum();                     // Or any other terminal operation
        System.out.println("--");
        employees.stream()
                .mapToDouble(Employee::getSalary)
                .forEach(System.out::println);

        System.out.println("--");
        employees.stream().mapToDouble(employee->employee.getSalary()).forEach(System.out::println);
        employees.stream().mapToDouble(employee->employee.getSalary()).forEach(System.out::println);



        //Using Constructor refernce

        //Supplier interface with constructor refernce
        Supplier<Employee> employeeSupplier = Employee::new; //Constructor ref

        // by calling the supplier interface here it will return instance of the  Employee
        Employee employee = employeeSupplier.get();
        System.out.println("Name: " + employee.getName());


    }
}
