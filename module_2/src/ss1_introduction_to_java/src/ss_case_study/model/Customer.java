package ss_case_study.model;

import java.util.Date;

public class Customer extends Person {


String customerType,customerCode;
    public Customer(int id, String customerCode, String phoneNumber, String fullName, String gender, String email, String dayOfBirth,String customerType) {
        super(id, phoneNumber, fullName, gender, email, dayOfBirth);
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{"+ "id = " + getId() +
                ", customer code '= " + getCustomerCode() + '\''+
                ", phoneNumber = " + getPhoneNumber() +
                ", fullName = '" + getFullName() + '\'' +
                ", gender = '" + getGender() + '\'' +
                ", email = '" + getEmail() + '\'' +
                ", dayOfBirth = " + getDayOfBirth() +
                ", customer Type = " + getCustomerType() +

                "}";
    }
    public String getInfoToCSV(){
        return getId()  + ", " + getCustomerCode() +", " + getPhoneNumber() + ", " + getFullName() + ", " + getGender() + ", " +
                getEmail() + ", " + getDayOfBirth() + ", " + getCustomerType();
    }
}
