package ss_case_study.model;

import java.util.Date;

public class Customer extends Person {

    public Customer(int id, int phoneNumber, String fullName, String gender, String email, Date dayOfBirth) {
        super(id, phoneNumber, fullName, gender, email, dayOfBirth);
    }
}