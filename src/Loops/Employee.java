package Loops;

public class Employee  {
    private int id;
    private String name;
    private Department department;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "emp-id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", address=" + address +
                ']';
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}


