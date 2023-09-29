package ss_case_study.controllers;

import ss_case_study.repository.impl.EmployeeRepository;

import java.util.Scanner;

public class EmployeeController {
    public static void displayEmployeeMenu(){
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choose;
        do {
            System.out.println("1 Display list employees" +
                    "\n2 Add new employee" +
                    "\n3 Edit employee" +
                    "\n4 Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    EmployeeRepository.displayEmployeeList();
                    break;
                }
                case 2: {
                    employeeRepository.addEmployee();
                    break;
                }
                case 3: {
                    System.out.println("code chuc nang edit employee");
                    break;
                }
                default:
                    flag = false;
            }
        } while (flag);
    }
}
