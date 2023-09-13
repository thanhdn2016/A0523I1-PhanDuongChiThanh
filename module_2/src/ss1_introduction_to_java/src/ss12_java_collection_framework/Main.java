package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1.Hien thi danh sach" +
                    "\n2.Them san pham" +
                    "\n3.Sua san pham theo id" +
                    "\n4.Xoa san pham theo id" +
                    "\n5.Tim kiem theo ten hoac ID" +
                    "\n6.Sap xep san pham tang dan theo gia" +
                    "\n7.Sap xep san pham giam dan theo gia" +
                    "\n8.Sap xep san pham theo ID" +
                    "\n9.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                   productManager.display();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.editById();
                    break;
                case 4:
                    productManager.deleteById();
                    break;
                case 5:
                    productManager.find();
                    break;
                case 6:
                   productManager.sortLowToHighPrice();
                   productManager.display();
                    break;
                case 7:
                    productManager.sortHighToLowPrice();
                    productManager.display();
                    break;
                case 8:
                    productManager.sortByID();
                    productManager.display();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

