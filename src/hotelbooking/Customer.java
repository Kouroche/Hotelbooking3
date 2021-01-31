package hotelbooking;

public class Customer {
    
    private String name;
    private int phoneNo;

    public Customer(String name, int phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", phoneNo=" + phoneNo + '}';
    }
 
}
