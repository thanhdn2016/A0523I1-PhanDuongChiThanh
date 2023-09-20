package ss_case_study.controllers;

import java.util.Scanner;

public class PromotionController {
    public static void displayPromotionMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        boolean flag = true;
        do {
            System.out.println("1. Display list customers use service" +
                    "\n2. Display list customers get voucher" +
                    "\n3. Return main menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("code chuc nang Display list customers use service");
                    break;
                case 2:
                    System.out.println("Display list customers get voucher");
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
}
