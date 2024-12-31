package Loops;

public class Department {
    private int empId;
    private String name; //IT,non-IT,Sales

    @Override
    public String toString() {
        return "Department{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

