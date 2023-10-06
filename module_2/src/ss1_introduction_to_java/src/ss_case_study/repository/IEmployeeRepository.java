package ss_case_study.repository;

import ss_case_study.model.Employee;

public interface IEmployeeRepository extends IRepository{
    void editEmployeeById(int id);
}
