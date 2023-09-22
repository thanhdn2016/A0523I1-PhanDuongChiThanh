package ss_case_study.service;

import java.util.Date;

public interface IEmployeeService extends IService {
    void promoteToPosition(String newPosition);
    void increaseSalary(double amount);
}