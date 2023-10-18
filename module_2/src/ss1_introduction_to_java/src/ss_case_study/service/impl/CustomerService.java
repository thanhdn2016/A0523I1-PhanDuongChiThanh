package ss_case_study.service.impl;

import ss_case_study.model.Customer;
import ss_case_study.repository.impl.CustomerRepository;
import ss_case_study.service.ICustomerService;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    EmployeeService employeeService = new EmployeeService();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        //int id,String customerCode String phoneNumber, String fullName, String gender, String email, String dayOfBirth, int customerType
        int id = -1, customerType = -1;
        String phoneNumber, fullName, gender, email, dayOfBirth, customerCode;
        boolean flag;
        do {
            flag = false;
            System.out.print("nhap vao ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < customerRepository.getListCustomer().size(); i++) {
                    if (id == customerRepository.getListCustomer().get(i).getId()) {
                        System.out.println("ID bi trung lap - hay nhap lai ID");
                        flag = true;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Moi ban nhap lai ID");
                flag = true;
            }
        } while (flag);
        boolean flagCustomerCode;
        do {
            flagCustomerCode = false;
            System.out.print("Nhap vao customer code:");
            customerCode = scanner.nextLine();
            if (!checkCustomerCode(customerCode)) {
                flagCustomerCode = true;
            }
            for (int i = 0; i < customerRepository.getListCustomer().size(); i++) {
                if (customerCode.equals(customerRepository.getListCustomer().get(i).getCustomerCode())) {
                    System.out.println("Customer Code bi trung lap!");
                    flagCustomerCode = true;
                    break;
                }
            }
        }
        while (flagCustomerCode);
        boolean flagPhoneNumber;
        do {
            flagPhoneNumber = false;
            System.out.print("Nhap vao phone number: ");
            phoneNumber = scanner.nextLine();
            if (!employeeService.checkPhoneNumber(phoneNumber)) {
                flagPhoneNumber = true;
            }
            for (int i = 0; i < customerRepository.getListCustomer().size(); i++) {
                if (phoneNumber.equals(customerRepository.getListCustomer().get(i).getPhoneNumber())) {
                    System.out.println("so dien thoai bi trung lap");
                    flagPhoneNumber = true;
                    break;
                }
            }
        } while (flagPhoneNumber);
        System.out.print("Nhap vao ho ten nhan vien: ");
        String fullName2 = scanner.nextLine();
        fullName = String.valueOf(employeeService.capitalizedName(fullName2));
        System.out.print("Nhap vao gender (Male / Female) : ");
        gender = scanner.nextLine();
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        do {
            System.out.print("Nhap ngay thang nam sinh (dd/mm/yyyy): ");
            dayOfBirth = scanner.nextLine();
        } while (!employeeService.checkDayOfBirth(dayOfBirth));
        System.out.println("moi ban chon customer type:");
        for (int i = 0; i < customerRepository.getListCustomerType().size(); i++) {
            System.out.println(i + ": " + customerRepository.getListCustomerType().get(i));
        }
        boolean flagCustomerType;
        do {
            flagCustomerType = false;
            try {
                customerType = Integer.parseInt(scanner.nextLine());
                if (customerType > customerRepository.getListCustomerType().size() - 1 || customerType < 0) {
                    System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flagCustomerType = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Vui long nhap lai");
                flagCustomerType = true;
            }
        } while (flagCustomerType);
        customerRepository.addCustomer(id, customerCode, phoneNumber, fullName, gender, email, dayOfBirth, customerType);
    }

    public void displayCustomerList() {
        for (Customer c : customerRepository.getListCustomer()) {
            System.out.println(c);
        }
    }

    public void edit() {
        int index = 0;
        int id;
        int customerType = -1;
        String newPhoneNumber, newFullName, newGender, newEmail, newDayOfBirth, newCustomerCode;
        System.out.print("Nhap vao id customer can sua:");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerRepository.getListCustomer().size(); i++) {
            if (id == customerRepository.getListCustomer().get(i).getId()) {
                index = i;
                break;
            }
        }
        if (id == customerRepository.getListCustomer().get(index).getId()) {
            boolean flag = true;
            do {
                flag = false;
                System.out.print("nhap vao customer Code: ");
                newCustomerCode = scanner.nextLine();
                if (!checkCustomerCode(newCustomerCode)) {
                    flag = true;
                }
            } while (flag);
            boolean flagPhoneNumber = true;
            do {
                flagPhoneNumber = false;
                System.out.print("Nhap vao so dien thoai can chinh sua: ");
                newPhoneNumber = scanner.nextLine();
                if (!employeeService.checkPhoneNumber(newPhoneNumber)) {
                    flagPhoneNumber = true;
                }
            } while (flagPhoneNumber);
            System.out.println("Nhap vao ho ten can sua: ");
            newFullName = scanner.nextLine();
            employeeService.capitalizedName(newFullName);
            System.out.println("Nhap vao gender can sua (Male / Female): ");
            newGender = scanner.nextLine();
            System.out.println("Nhap vao email moi: ");
            newEmail = scanner.nextLine();
            do {
                System.out.println("Nhap vao day of birth moi(dd/mm/yyyy): ");
                newDayOfBirth = scanner.nextLine();
            } while (!employeeService.checkDayOfBirth(newDayOfBirth));
            System.out.println("Moi ban chon customer type");
            for (int j = 0; j < customerRepository.getListCustomerType().size(); j++) {
                System.out.println(j+": " + customerRepository.getListCustomerType().get(j));
            }
            boolean flagCustomerType;
            do {
                flagCustomerType = false;
                try {
                    customerType = Integer.parseInt(scanner.nextLine());
                    if (customerType > customerRepository.getListCustomerType().size() - 1 || customerType < 0) {
                        System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                        flagCustomerType = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Vui long nhap lai");
                    customerType = customerRepository.getListCustomerType().size()-1;
                    flagCustomerType = true;
                }
            } while (flagCustomerType);
            customerRepository.editCustomer(index, newCustomerCode, newPhoneNumber, newFullName, newGender, newEmail, newDayOfBirth, customerType);
        } else {
            System.out.println("id khong ton tai");
        }
    }
    public void delete() {
        System.out.print("Nhap vao id cua customer ban muon xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        customerRepository.deleteCustomer(id);
    }

    public boolean checkCustomerCode(String customerCode) {
        String regex = "^(KH)\\-\\d{4}$";
        if (customerCode.matches(regex)) {
            return true;
        } else {
            System.out.println("Nhap sai dinh dang KH-YYYY");
            return false;
        }
    }
}

