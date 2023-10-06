package ss_case_study.repository.impl;

import ss_case_study.model.Employee;
import ss_case_study.repository.IEmployeeRepository;
import ss_case_study.service.impl.EmployeeService;
import ss_case_study.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    EmployeeService employeeService = new EmployeeService();
    Scanner scanner = new Scanner(System.in);

    public List<Employee> getListEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        //doc file
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_EMPLOYEE);
        // chuyen thanh list employee
        String[] array = null;
        for (String s : stringList) {
            array = s.split(", ");
            Employee employees = new Employee(Integer.parseInt(array[0]), array[1], array[2], Integer.parseInt(array[3]), array[4], array[5], array[6], array[7], array[8], array[9]);
            employeeList.add(employees);
        }
        return employeeList;
    }

    public List<String> getListQualification() {
        List<String> qualificationList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_QUALIFICATION);
        for (String s : stringList) {
            qualificationList.add(s);
        }
        return qualificationList;
    }

    public List<String> getListPosition() {
        List<String> positionList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_POSITION);
        for (String s : stringList) {
            positionList.add(s);
        }
        return positionList;
    }

    public final String PATH_EMPLOYEE = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_case_study/data/employee.csv";
    public final String PATH_POSITION = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_case_study/data/position.csv";
    public final String PATH_QUALIFICATION = "/Users/thanh/Desktop/codegym/A0523I1-PhanDuongChiThanh/module_2/src/ss1_introduction_to_java/src/ss_case_study/data/qualification.csv";

    public void addEmployee() {
        int id = 0;
        int salary;
        int choose1 = -1;
        int choose2 = -1;
        String phoneNumber, fullName, gender, email, dateOfBirth, employeeCode;
        boolean flag1;
        do {
            flag1 = false;
            System.out.print("nhap vao ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < getListEmployee().size(); i++) {
                    if (id == getListEmployee().get(i).getId()) {
                        System.out.println("ID bi trung lap - hay nhap lai ID");
                        flag1 = true;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Moi ban nhap lai ID");
                flag1 = true;
            }
        } while (flag1);
        boolean flag2;
        do {
            flag2 = false;
            System.out.print("nhap vao EmployeeCode (vi du: NV-YYYY) , Y = 0 -> 9 : ");
            employeeCode = scanner.nextLine();
            if (employeeService.checkEmployeeCode(employeeCode)) {
                flag2 = false;
                break;
            } else {
                flag2 = true;
            }

        } while (flag2);
        boolean flag3;
        do {
            flag3 = false;
            System.out.print("Nhap vao phone number: ");
            phoneNumber = scanner.nextLine();
           if (!employeeService.checkPhoneNumber(phoneNumber)){
               flag3 = true;
           }
            for (int i = 0; i < getListEmployee().size(); i++) {
                if (Objects.equals(phoneNumber, getListEmployee().get(i).getPhoneNumber())) {
                    System.out.println("so dien thoai bi trung lap");
                    flag3 = true;
                    break;
                }
            }
            System.out.print("Nhap vao salary: ");
            salary = Integer.parseInt(scanner.nextLine());
            if (salary <= 0){
                System.out.println("Salary phai lon hon 0");
                flag3 = true;
            }
        } while (flag3);
        System.out.print("Nhap vao ho ten nhan vien: ");
        String fullName2 = scanner.nextLine();
        fullName = String.valueOf(employeeService.capitalizedName(fullName2));
        System.out.print("Nhap vao gender (Male / Female) : ");
        gender = scanner.nextLine();
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        do {
            System.out.print("Nhap ngay thang nam sinh (dd/mm/yyyy): ");
            dateOfBirth = scanner.nextLine();
        } while (!checkDayOfBirth(dateOfBirth));
        System.out.println("moi ban chon Position:");
        for (int i = 0; i < getListPosition().size(); i++) {
            System.out.println(i + ": " + getListPosition().get(i));
        }
        boolean flag4 = true;
        do {
            flag4 = false;
            try {
                choose1 = Integer.parseInt(scanner.nextLine());
                if (choose1 > getListPosition().size() - 1 || choose1 < 0) {
                    System.out.print("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flag4 = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                choose1 = getListPosition().size() - 1;
                flag4 = true;
            }
        } while (flag4);

        System.out.println("moi ban chon qualification:");
        for (int i = 0; i < getListQualification().size(); i++) {
            System.out.println(i + ": " + getListQualification().get(i));
        }
        boolean flag5 = true;
        do {
            flag5 = false;
            try {
                choose2 = Integer.parseInt(scanner.nextLine());
                if (choose2 > getListQualification().size() - 1 || choose2 < 0) {
                    System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flag5 = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Vui long nhap lai");
                flag5 = true;
            }
        } while (flag5);
        List<Employee> employeeList = getListEmployee();
        employeeList.add(new Employee( id,employeeCode, phoneNumber, salary, fullName, gender, email, dateOfBirth, getListPosition().get(choose1), getListQualification().get(choose2)));
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_EMPLOYEE, stringList, false);
    }

    public List<Employee> displayEmployeeList() {
        for (Employee e : getListEmployee()) {
            System.out.println(e);
        }
        return getListEmployee();
    }

    @Override
    public boolean checkDayOfBirth(String dayOfBirth) {
        String[] arr = dayOfBirth.split("/");
        if (arr.length == 3) {
            try {
                int day = Integer.parseInt(arr[0]);
                int month = Integer.parseInt(arr[1]);
                int year = Integer.parseInt(arr[2]);
                if (day >= 1 && day <= 31 && month >= 1 && month <= 12 && year >= 1900 && year <= 2023) {
                    return true;
                } else {
                    System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
                return false;
            }
        } else {
            System.out.println("Nhap khong hop le. Vui long nhap lai theo dinh dang dd/mm/yyyy.");
            return false;
        }
    }

    @Override
    public void editEmployeeById(int id) {

    }


    }




