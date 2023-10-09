package ss_case_study.service.impl;
import ss_case_study.repository.impl.EmployeeRepository;
import ss_case_study.service.IEmployeeService;

import java.util.Objects;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);
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

    public void add() {
        int id = 0;
        int salary;
        int position = -1;
        int qualification = -1;
        String phoneNumber, fullName, gender, email, dateOfBirth, employeeCode;
        boolean flag;
        do {
            flag = false;
            System.out.print("nhap vao ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < employeeRepository.getListEmployee().size(); i++) {
                    if (id == employeeRepository.getListEmployee().get(i).getId()) {
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
        boolean flagEmployeeCode;
        do {
            System.out.print("nhap vao EmployeeCode (vi du: NV-YYYY) , Y = 0 -> 9 : ");
            employeeCode = scanner.nextLine();
            flagEmployeeCode = !checkEmployeeCode(employeeCode);
        } while (flagEmployeeCode);
        boolean flagPhoneNumber;
        do {
            flagPhoneNumber = false;
            System.out.print("Nhap vao phone number: ");
            phoneNumber = scanner.nextLine();
            if (!checkPhoneNumber(phoneNumber)) {
                flagPhoneNumber = true;
            }
            for (int i = 0; i < employeeRepository.getListEmployee().size(); i++) {
                if (Objects.equals(phoneNumber, employeeRepository.getListEmployee().get(i).getPhoneNumber())) {
                    System.out.println("so dien thoai bi trung lap");
                    flagPhoneNumber = true;
                    break;
                }
            }
        } while (flagPhoneNumber);
        boolean flagSalary;
        do {
            flagSalary = false;
            System.out.print("Nhap vao salary: ");
            salary = Integer.parseInt(scanner.nextLine());
            if (salary <= 0) {
                System.out.println("Salary phai lon hon 0");
                flagSalary = true;
            }
        } while (flagSalary);
        System.out.print("Nhap vao ho ten nhan vien: ");
        String fullName2 = scanner.nextLine();
        fullName = String.valueOf(capitalizedName(fullName2));
        System.out.print("Nhap vao gender (Male / Female) : ");
        gender = scanner.nextLine();
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        do {
            System.out.print("Nhap ngay thang nam sinh (dd/mm/yyyy): ");
            dateOfBirth = scanner.nextLine();
        } while (!checkDayOfBirth(dateOfBirth));
        System.out.println("moi ban chon Position:");
        for (int i = 0; i < employeeRepository.getListPosition().size(); i++) {
            System.out.println(i + ": " + employeeRepository.getListPosition().get(i));
        }
        boolean flagPosition = true;
        do {
            flagPosition = false;
            try {
                position = Integer.parseInt(scanner.nextLine());
                if (position > employeeRepository.getListPosition().size() - 1 || position < 0) {
                    System.out.print("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flagPosition = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                position = employeeRepository.getListPosition().size() - 1;
                flagPosition = true;
            }
        } while (flagPosition);

        System.out.println("moi ban chon qualification:");
        for (int i = 0; i < employeeRepository.getListQualification().size(); i++) {
            System.out.println(i + ": " + employeeRepository.getListQualification().get(i));
        }
        boolean flagQualification = true;
        do {
            flagQualification = false;
            try {
                qualification = Integer.parseInt(scanner.nextLine());
                if (qualification > employeeRepository.getListQualification().size() - 1 || qualification < 0) {
                    System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                    flagQualification = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Vui long nhap lai");
                flagQualification = true;
            }
        } while (flagQualification);
        employeeRepository.addEmployee(id, employeeCode, phoneNumber, salary, fullName, gender, email, dateOfBirth, position, qualification);
    }

    public void edit() {
        int existIndex = 0;
        int newSalary, id;
        int position = -1;
        int qualification = -1;
        String newPhoneNumber, newFullname, newGender, newEmail, newDateOfBirth, newEmployeeCode;
        System.out.println("Nhap vao id employee can sua");
        id = Integer.parseInt(scanner.nextLine());
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
            } while (!checkDayOfBirth(newDateOfBirth));
            System.out.println("moi ban chon Position moi:");
            for (int j = 0; j < employeeRepository.getListPosition().size(); j++) {
                System.out.println(j + ": " + employeeRepository.getListPosition().get(j));
            }
            boolean flag4 = true;
            do {
                flag4 = false;
                try {
                    position = Integer.parseInt(scanner.nextLine());
                    if (position > employeeRepository.getListPosition().size() - 1 || position < 0) {
                        System.out.print("ban da nhap qua pham vi - moi ban nhap lai: ");
                        flag4 = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    position = employeeRepository.getListPosition().size() - 1;
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
                    qualification = Integer.parseInt(scanner.nextLine());
                    if (qualification > employeeRepository.getListQualification().size() - 1 || qualification < 0) {
                        System.out.println("ban da nhap qua pham vi - moi ban nhap lai: ");
                        flag5 = true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Vui long nhap lai");
                    flag5 = true;
                }
            } while (flag5);
            employeeRepository.editEmployeeById(existIndex, newSalary, newEmployeeCode, newFullname, newEmail, newGender, newDateOfBirth, newPhoneNumber, position, qualification);
        } else {
            System.out.println("id khong ton tai");
        }
    }
        public void delete(){
            System.out.print("Nhap vao id cua employee ban muon xoa: ");
            int id = Integer.parseInt(scanner.nextLine());
            employeeRepository.deleteById(id);
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

    public boolean checkPhoneNumber(String phoneNumber) {
        String regex = "^(\\(\\+84\\)|0)\\d{9}$";
        if (phoneNumber.matches(regex)) {
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
        for (int i = 0; i < arr.length; i++) {
            String str1 = arr[i].substring(0, 1).toUpperCase();
            String str2 = arr[i].substring(1).toLowerCase();
            String str3 = str1 + str2;
            capitalized.append(str3).append(" ");
        }
        return capitalized;
    }

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
}

