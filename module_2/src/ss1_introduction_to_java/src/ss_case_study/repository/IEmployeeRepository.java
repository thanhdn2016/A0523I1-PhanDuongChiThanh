package ss_case_study.repository;

import ss_case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository{
    void editEmployeeById(int existIndex,int newSalary,String newEmployeeCode,String newFullname, String newEmail,String newGender, String newDateOfBirth, String newPhoneNumber, int position, int qualification);
    void deleteById(int id);
    void addEmployee(int id, String employeeCode, String phoneNumber, int salary, String fullName, String gender, String email, String dateOfBirth, int position, int qualification);
    List<Employee> displayEmployeeList();
}
