package ss_case_study.controllers;

import ss_case_study.repository.impl.CustomerRepository;
import ss_case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public static void displayCustomerMenu(){
        CustomerService customerService = new CustomerService();
        CustomerRepository customerRepository = new CustomerRepository();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choose;
        do {
            System.out.println("1. Display list customers" +
                    "\n2. Add new customer" +
                    "\n3. Edit customer" +
                    "\n4. Delete customer" +
                    "\n5. Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    customerService.displayCustomerList();
                    break;
                }
                case 2: {
                    customerService.add();
                    break;
                }
                case 3: {
                    customerService.edit();
                    break;
                }
                case 4:{
                   customerService.delete();
                   break;
                }
                default:
                    flag = false;
            }
        } while (flag);
    }
}
