package ss_case_study.repository;

import java.util.ArrayList;

public class EmployeeRepository {
    static ArrayList<String> position = new ArrayList<>();
    static ArrayList<String> qualification = new ArrayList<>();
    static {
        qualification.add("Trung Cap");
        qualification.add("Cao Dang");
        qualification.add("Dai Hoc");
        qualification.add("Sau Dai Hoc");

        position.add("Le tan");
        position.add("Phuc vu");
        position.add("Chuyen Vien");
        position.add("Giam Sat");
        position.add("Quan Ly");
        position.add("Giam Doc");
    }

}
