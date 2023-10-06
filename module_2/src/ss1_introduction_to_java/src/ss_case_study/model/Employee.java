package ss_case_study.model;

import java.util.Date;

public class Employee extends Person {
    private String position, qualification, employeeCode;
    private int  salary;

    public Employee( int id,String employeeCode, String phoneNumber, int salary, String fullName, String gender, String email, String dayOfBirth, String position, String qualification) {
        super(id, phoneNumber, fullName, gender, email, dayOfBirth);
        this.salary = salary;
        this.employeeCode = employeeCode;
        this.position = position;
        this.qualification = qualification;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode = " + employeeCode +
                ", " +
                "id ='" + getId() + '\'' +
                "phoneNumber = '" + getPhoneNumber() + '\'' +
                ", salary = " + salary +
                ", fullName = " + getFullName() +
                ", gender = " + getGender() +
                ", email = " + getEmail() +
                ", dayOfBirth = " + getDayOfBirth() +
                ", position = '" + position + '\'' +
                ", qualification = '" + qualification + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getId() + ", " + getEmployeeCode() + ", " + getPhoneNumber() + ", " +
                getSalary() + ", " + getFullName() + ", " + getGender() + ", " +
                getEmail() + ", " + getDayOfBirth() + ", " + getPosition() + ", " + getQualification();
    }
}
