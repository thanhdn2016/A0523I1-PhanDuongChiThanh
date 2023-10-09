package ss_case_study.repository.impl;

import ss_case_study.repository.ICustomerRepository;

import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {
  static   ArrayList<String> customerType = new ArrayList<>();
    static {
        customerType.add("Diamond");
        customerType.add("Platinum");
        customerType.add("Gold");
        customerType.add("Silver");
        customerType.add("Member");
    }


}
