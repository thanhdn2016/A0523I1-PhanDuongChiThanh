package ss_case_study.repository;

import java.util.ArrayList;

public class CustomerRepository {
  static   ArrayList<String> customerType = new ArrayList<>();
    static {
        customerType.add("Diamond");
        customerType.add("Platinum");
        customerType.add("Gold");
        customerType.add("Silver");
        customerType.add("Member");
    }
}
