package Loops;


public class Address {
    private int empId; //1,2-hyd
    //3,4-bng

    private String homeAddress;

    @Override
    public String toString() {
        return "Address{" +
                "empId=" + empId +
                ", homeAddress='" + homeAddress + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", homePinCode=" + homePinCode +
                ", officePinCode=" + officePinCode +
                '}';
    }

    private String officeAddress;
    private int homePinCode;
    private int officePinCode;

    //additional fields
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public int getHomePinCode() {
        return homePinCode;
    }

    public void setHomePinCode(int homePinCode) {
        this.homePinCode = homePinCode;
    }

    public int getOfficePinCode() {
        return officePinCode;
    }

    public void setOfficePinCode(int officePinCode) {
        this.officePinCode = officePinCode;
    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

}

