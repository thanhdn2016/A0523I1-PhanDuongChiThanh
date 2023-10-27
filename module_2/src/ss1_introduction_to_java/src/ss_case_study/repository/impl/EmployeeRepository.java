package ss_case_study.repository.impl;

import ss_case_study.model.Employee;
import ss_case_study.repository.IEmployeeRepository;
import ss_final_exam.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    List<String> stringList = new ArrayList<>();
    List<Employee> employeeList = getListEmployee();

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

    @Override
    public void addEmployee(int id, String employeeCode, String phoneNumber, int salary, String fullName, String gender, String email, String dateOfBirth, int position, int qualification) {
        employeeList.add(new Employee(id, employeeCode, phoneNumber, salary, fullName, gender, email, dateOfBirth, getListPosition().get(position), getListQualification().get(qualification)));
        for (Employee e : employeeList) {
            stringList.add(e.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_EMPLOYEE, stringList, false);
    }

    @Override
    public List<Employee> displayEmployeeList() {
        for (Employee e : getListEmployee()) {
            System.out.println(e);
        }
        return getListEmployee();
    }


    @Override
    public void editEmployeeById(int id, int newSalary, String newEmployeeCode, String newFullname,
                                 String newEmail, String newGender, String newDateOfBirth,
                                 String newPhoneNumber, int position, int qualification) {
        employeeList.get(id).setSalary(newSalary);
        employeeList.get(id).setEmployeeCode(newEmployeeCode);
        employeeList.get(id).setPosition(getListPosition().get(position));
        employeeList.get(id).setQualification(getListQualification().get(qualification));
        employeeList.get(id).setEmail(newEmail);
        employeeList.get(id).setFullName(newFullname);
        employeeList.get(id).setDayOfBirth(newDateOfBirth);
        employeeList.get(id).setPhoneNumber(newPhoneNumber);
        employeeList.get(id).setGender(newGender);
        for (Employee e : employeeList) {
            stringList.add(e.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_EMPLOYEE, stringList, false);
    }

    @Override
    public void deleteById(int deleteId) {
        int existId = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (deleteId == employeeList.get(i).getId()) {
                existId = i;
                break;
            }
        }
        if (deleteId == employeeList.get(existId).getId()){
            employeeList.remove(existId);
            System.out.println("Da xoa 1 employee!");
            stringList.clear();
            for (Employee e : employeeList) {
                stringList.add(e.getInfoToCSV());
            }
            ReadAndWrite.writeToCSV(PATH_EMPLOYEE, stringList, false);
        }
        else {
            System.out.println("ID khong ton tai");
        }

    }
}





