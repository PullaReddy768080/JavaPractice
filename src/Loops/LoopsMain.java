package Loops;


public class LoopsMain {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=20;

        int[] array={a,b,c};//emp-1
        for (int i=0;i<3;i++){//int i=0;->initilization,i<3->condition,i++->increment
            System.out.println(array[i]);
        }



        Employee employee1 = new Employee();
        employee1.setId(1111);//id
        employee1.setName("emp-1");

        //address
        Address address = new Address();
        address.setHomeAddress("hyderabad");
        address.setOfficeAddress("Bangalore");
        address.setEmpId(employee1.getId());
        employee1.setAddress(address);
        //dept
        Department department = new Department();
        department.setEmpId(employee1.getId());
        department.setName("IT");
        employee1.setDepartment(department);

        ////emp-2
        Employee employee2 = new Employee();
        employee2.setId(2222);//id
        employee2.setName("emp-2");

        //address
        Address address2 = new Address();
        address2.setHomeAddress("hyderabad");
        address2.setOfficeAddress("Bangalore");
        address2.setEmpId(employee2.getId());
        employee1.setAddress(address2);
        //dept
        Department department2 = new Department();
        department2.setEmpId(employee2.getId());
        department2.setName("NON-IT");
        employee2.setDepartment(department2);

        Employee[] employees={employee1,employee2};
        for(int i=0;i<2;i++){
            System.out.println(employees[i]);
        }


        //while loop
         int count=0;

        while (count<3){
            System.out.println(array[count]);
            count=count+1;
        }

        //do while loop
        count=0;
        do {
            System.out.println(array[count]);
            count = count + 1;
        } while (count < 3);





    }
}
