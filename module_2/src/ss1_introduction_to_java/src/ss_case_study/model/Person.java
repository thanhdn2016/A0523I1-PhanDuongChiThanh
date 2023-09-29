package ss_case_study.model;

import java.util.Date;

abstract class Person {
    private int id;
    private String fullName, gender, email,phoneNumber;
    private String dayOfBirth;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Person(int id, String phoneNumber, String fullName, String gender, String email, String dayOfBirth) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}
