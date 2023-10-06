package ss_case_study.service.impl;

import ss_case_study.model.Employee;
import ss_case_study.repository.impl.EmployeeRepository;
import ss_case_study.service.IEmployeeService;
import ss_case_study.util.ReadAndWrite;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    @Override
    public void promoteToPosition(String newPosition) {

    }

    @Override
    public void increaseSalary(double amount) {

    }

    @Override
    public double calculateTotalCost() {
        return 0;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean isSuitableForGuests() {
        return false;
    }

    @Override
    public void updateServiceInfo() {

    }

    public void edit() {
        int existIndex = 0;
        int newSalary, id;
        int choose1 = -1;
        int choose2 = -1;
        String newPhoneNumber, newFullname, newGender, newEmail, newDateOfBirth, newEmployeeCode;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao id employee can sua");
        id = Integer.parseInt(scanner.nextLine());
        EmployeeRepository employeeRepository = new EmployeeRepository();
        for (int i = 0; i < employeeRepository.getListEmployee().size(); i++) {
            if (id == employeeRepository.getListEmployee().get(i).getId()) {
                existIndex = i;
                break;
            }
        }
        if (id == employeeRepository.getListEmployee().get(existIndex).getId()) {
            boolean flag = true;
            do {
                flag = false;
                System.out.print("nhap vao Employee Code: ");
                newEmployeeCode = scanner.nextLine();
                if (!checkEmployeeCode(newEmployeeCode)) {
                    flag = true;
                }
            } while (flag);
            System.out.print("Nhap vao phone number can chinh sua: ");
            newPhoneNumber = scanner.nextLine();
            System.out.print("Nhap vao salary can chinh sua: ");
            newSalary = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhap vao ho ten nhan vien can chinh sua: ");
            String editName = scanner.nextLine();
            newFullname = String.valueOf(capitalizedName(editName));
            System.out.print("Nhap vao gender (Male / Female) : ");
            newGender = scanner.nextLine();
            System.out.print("Nhap email moi: ");
            newEmail = scanner.nextLine();
            do {
                System.out.print("Nhap ngay thang nam sinh moi (dd/mm/yyyy): ");
                newDateOfBirth = scanner.nextLine();
            } while (!employeeRepository.checkDayOfBirth(newDateOfBirth));
            System.out.println("moi ban chon Position moi:");
            for (int j = 0; j < employeeRepository.getListPosition().size(); j++) {
                System.out.println(j + ": " + employeeRepository.getListPosition().get(j));
            }
            boolean flag4 = true;
            do {
                flag4 = false;
                try {
                    choose1 = Integer.parseInt(scanner.nextLine());
                    if (choose1 > employeeRepository.getListPosition().size() - 1 || choose1 < 0) {
                        System.out.print("ban da nhap qua pham vi - moi ban nhap lai: ");
                        flag4 = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    choose1 = employeeRepository.getListPosition().size() - 1;
                    flag4 = true;
                }
            } while (flag4);

            System.out.println("moi ban chon qualification:");
            for (int m = 0; m < employeeRepository.getListQualification().size(); m++) {
                System.out.println(m + ": " + employeeRepository.getListQualification().get(m));
            }
            boolean flag5 = true;
            do {
                flag5 = false;
                try {
                    choose2 = Integer.parseInt(scanner.nextLine());
                    if (choose2 > employeeRepository.getListQualification().size() - 1 || choose2 < 0) {
                        System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                        flag5 = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Vui long nhap lai");
                    flag5 = true;
                }
            } while (flag5);

            List<String> stringList = new ArrayList<>();
            List<Employee> employeeList = employeeRepository.getListEmployee();
            employeeList.get(existIndex).setSalary(newSalary);
            employeeList.get(existIndex).setEmployeeCode(newEmployeeCode);
            employeeList.get(existIndex).setPosition(employeeRepository.getListPosition().get(choose1));
            employeeList.get(existIndex).setQualification(employeeRepository.getListQualification().get(choose2));
            employeeList.get(existIndex).setEmail(newEmail);
            employeeList.get(existIndex).setFullName(newFullname);
            employeeList.get(existIndex).setDayOfBirth(newDateOfBirth);
            employeeList.get(existIndex).setPhoneNumber(newPhoneNumber);
            employeeList.get(existIndex).setGender(newGender);
            for (Employee e : employeeList) {
                stringList.add(e.getInfoToCSV());
            }
            ReadAndWrite.writeToCSV(employeeRepository.PATH_EMPLOYEE, stringList, false);
        } else {
            System.out.println("id khong ton tai");
        }
    }

    public boolean checkEmployeeCode(String employeeCode) {
        String regex = "^(NV)\\-\\d{4}$";
        if (employeeCode.matches(regex)) {
            return true;
        } else {
            System.out.println("Nhap sai dinh dang NV-YYYY");
            return false;
        }
    }
    public boolean checkPhoneNumber(String phoneNumber){
        String regex = "^(\\(\\+84\\)|0)\\d{9}$";
        if (phoneNumber.matches(regex)){
            return true;
        } else {
            System.out.println("Ban da nhap sai dinh dang so dien thoai!");
            System.out.println("vi du cho SDT: 0123456789 hoac +84123456789");
            return false;
        }
    }

    public StringBuilder capitalizedName(String name) {
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (int i = 0; i < arr.length; i ++) {
            String str1 = arr[i].substring(0,1).toUpperCase();
            String str2 = arr[i].substring(1).toLowerCase();
            String str3 = str1 + str2;
            capitalized.append(str3).append(" ");
        }
        return capitalized;
    }
}

