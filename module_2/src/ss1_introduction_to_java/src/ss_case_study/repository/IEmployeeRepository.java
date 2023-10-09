package ss_case_study.repository;

import ss_case_study.model.Employee;

public interface IEmployeeRepository extends IRepository{
    void editEmployeeById(int existIndex,int newSalary,String newEmployeeCode,String newFullname, String newEmail,String newGender, String newDateOfBirth, String newPhoneNumber, int position, int qualification);
}
