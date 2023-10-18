package ss_case_study.service;

import java.util.Date;

public interface IEmployeeService extends IService {
    void add();

    void edit();

    void delete();

    boolean checkEmployeeCode(String employeeCode);

    boolean checkPhoneNumber(String phoneNumber);

    StringBuilder capitalizedName(String name);

    boolean checkDayOfBirth(String dayOfBirth);
}