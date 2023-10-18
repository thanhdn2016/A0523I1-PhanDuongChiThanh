package ss_case_study.repository.impl;

import ss_case_study.model.Customer;
import ss_case_study.model.Employee;
import ss_case_study.repository.ICustomerRepository;
import ss_case_study.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public final String PATH_CUSTOMERTYPE = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_case_study/data/customerType.csv";
    public final String PATH_CUSTOMER = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_case_study/data/customer.csv";

    @Override
    public List<String> getListCustomerType() {
        List<String> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_CUSTOMERTYPE);
        for (String s : stringList) {
            customerList.add(s);
        }
        return customerList;
    }

    @Override
    public List<Customer> getListCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_CUSTOMER);
        String[] array = null;
        for (String s : stringList) {
            array = s.split(", ");
            Customer customer = new Customer(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
            customerList.add(customer);
        }
        return customerList;
    }

    List<Customer> customerList = getListCustomer();
    List<String> stringList = new ArrayList<>();

    @Override
    public void addCustomer(int id, String customerCode, String phoneNumber, String fullName, String gender, String email, String dayOfBirth, int customerType) {
        customerList.add(new Customer(id, customerCode, phoneNumber, fullName, gender, email, dayOfBirth, getListCustomerType().get(customerType)));
        for (Customer c : customerList) {
            stringList.add(c.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_CUSTOMER, stringList, false);
    }

    @Override
    public void editCustomer(int id, String newCustomerCode, String newPhoneNumber, String newFullName,
                             String newGender, String newEmail, String newDayOfBirth, int newCustomerType) {
        customerList.get(id).setCustomerCode(newCustomerCode);
        customerList.get(id).setPhoneNumber(newPhoneNumber);
        customerList.get(id).setFullName(newFullName);
        customerList.get(id).setGender(newGender);
        customerList.get(id).setEmail(newEmail);
        customerList.get(id).setDayOfBirth(newDayOfBirth);
        customerList.get(id).setCustomerType(getListCustomerType().get(newCustomerType));
        for (Customer c : customerList) {
            stringList.add(c.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_CUSTOMER, stringList, false);
    }

    @Override
    public void deleteCustomer(int id) {
        int existId = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {
                existId = i;
                break;
            }
        }
        if (id == customerList.get(existId).getId()) {
            customerList.remove(existId);
            System.out.println("Da xoa 1 customer!");
            stringList.clear();
            for (Customer c : customerList) {
                stringList.add(c.getInfoToCSV());
            }
            ReadAndWrite.writeToCSV(PATH_CUSTOMER, stringList, false);
        } else {
            System.out.println("ID khong ton tai");
        }
    }
}
