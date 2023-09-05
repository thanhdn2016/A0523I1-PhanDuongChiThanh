package ss8_cleancode_mvc.controller;

import ss8_cleancode_mvc.service.IProductService;
import ss8_cleancode_mvc.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1.Display" +
                    "\n2.Add" +
                    "\n3.Edit" +
                    "\n4.Delete" +
                    "\n5.Find" +
                    "\n6.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.add();
                    System.out.println("Da them moi 1 san pham!");
                    break;
                case 3:
                    productService.edit();
                    break;
                case 4:
                    productService.delete();
                    break;
                case 5:
                    productService.find();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

