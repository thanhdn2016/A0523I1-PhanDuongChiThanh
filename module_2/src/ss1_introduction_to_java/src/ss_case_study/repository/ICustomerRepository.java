package ss_case_study.repository;

import ss_case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    void deleteCustomer(int id);

    List<Customer> getListCustomer();

    List<String> getListCustomerType();

    void editCustomer(int id, String newCustomerCode, String newPhoneNumber, String newFullName,
                      String newGender, String newEmail, String newDayOfBirth, int newCustomerType);

    void addCustomer(int id, String customerCode, String phoneNumber, String fullName, String gender, String email, String dayOfBirth, int customerType);
}
