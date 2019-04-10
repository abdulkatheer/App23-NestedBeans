package beans;

public class Employee {
    private String empId;
    private String name;
    private Address address;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getEmployeeDetails() {
        System.out.println(String.format("%-7s: %s\n%-7s: %s\n%s:\n%s, %s,\n%s,\n%s, %s.\n%s: %d", "Name",
                this.getName(), "Emp ID", this.getEmpId(), "Address", address.getDoorNo(), address.getStreet(),
                address.getLocality(), address.getDistrict(), address.getState(), "PIN", address.getPin()));
    }
}
