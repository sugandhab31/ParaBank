package api.payloads;

public class Customer {

    /**
     * {
     * id	integer($int32)
     * firstName	string
     * lastName	string
     * address	Address{
     * street	string
     * city	string
     * state	string
     * zipCode	string
     * }
     * phoneNumber	string
     * ssn	string
     * }
     */
    public int ID;
    public String firstName;
    public String lastName;
    public Address address;
    public String phoneNumber;
    public String ssn;
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


}
