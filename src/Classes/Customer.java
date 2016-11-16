package Classes;

/**
 * Created by JPMPC-B215 on 11/10/2016.
 */
public class Customer extends Person {
    private int customerID;
    private int membershipLevel;
    private int creditCardNumber;
    private String address;

    public int getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(int membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
