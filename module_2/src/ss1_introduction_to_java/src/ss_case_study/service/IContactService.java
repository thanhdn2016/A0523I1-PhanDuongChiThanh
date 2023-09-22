package ss_case_study.service;

import java.util.Date;

public interface IContactService extends IService{
    String getCustomerCode();
    String getCustomerName();
    Date getBirthDate();
    String getGender();
    String getIDNumber();
    String getPhoneNumber();
    String getEmail();
    String getCustomerType();
    String getAddress();
    void updateContactInfo(String newName, String newPhoneNumber, String newEmail, String newAddress);
}
