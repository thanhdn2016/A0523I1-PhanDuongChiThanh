package ss_case_study.controllers;

import ss_case_study.repository.impl.EmployeeRepository;
import ss_case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public static void displayEmployeeMenu(){
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choose;
        do {
            System.out.println("1 Display list employees" +
                    "\n2 Add new employee" +
                    "\n3 Edit employee" +
                    "\n4 Delete employee" +
                    "\n5 Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    employeeRepository.displayEmployeeList();
                    break;
                }
                case 2: {
                    employeeService.add();
                    break;
                }
                case 3: {
                    employeeService.edit();
                    break;
                }
                case 4: {
                    employeeService.delete();
                    break;
                }
                case 5:{
                    flag = false;
                    break;
                }
                default:
                    System.out.println("Nhap qua gioi han");
            }
        } while (flag);
    }
}
