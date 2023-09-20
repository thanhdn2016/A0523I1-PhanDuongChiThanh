package ss_case_study.model;

public class Employee extends Person {
    private String position, qualification;
    private int employeeCode,salary;
    public Employee(int employeeCode, int id, int phoneNumber, int salary, String fullName, String gender, String email, String dayOfBirth, String position, String qualification) {
        super(id, phoneNumber, fullName, gender, email, dayOfBirth);
        this.salary = salary;
        this.employeeCode = employeeCode;
        this.position = position;
        this.qualification = qualification;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
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
}
