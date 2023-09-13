package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Xe May", 1000000));
        products.add(new Product(2, "Trung ga", 2000));
        products.add(new Product(3, "iphone", 1550000));
        products.add(new Product(4, "gau bong", 155000));
    }

    public void add() {
        int id;
        boolean flag = true;
        do {
            System.out.print("Nhap vao id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < products.size(); i++) {
                if (id == products.get(i).getId()) {
                    System.out.println("ID bi trung lap");
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
        } while (flag);
        System.out.print("Nhap vao ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap vao gia san pham: ");
        int price = Integer.parseInt(scanner.nextLine());
        products.add(new Product(id, name, price));
        System.out.println("Da them vao thanh cong!");
        System.out.println("------------------------");
    }

    public void display() {
        for (Product i : products) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
    }

    public void editById() {
        System.out.println("Nhap vao id san pham can sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println("Nhap ten moi cua san pham: ");
                String newName = scanner.nextLine();
                System.out.println("Nhap gia tien moi cua san pham: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                products.get(i).setNameProduct(newName);
                products.get(i).setPrice(newPrice);
            }
        }
        System.out.println("Da sua thanh cong!");
        display();
    }

    public void deleteById() {
        System.out.print("Nhap vao id cua san pham can xoa: ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (deleteId == products.get(i).getId()) {
                products.remove(i);
            }
        }
        System.out.println("Da xoa 1 san pham!");
    }

    public void find() {
        System.out.println("Nhap ten hoac ID san pham can tim: ");
        String findProduct = scanner.nextLine();
        boolean flag = false;
        for (Product product : products) {
            if (product.getNameProduct().equalsIgnoreCase(findProduct) || Integer.toString(product.getId()).equals(findProduct)) {
                System.out.println("San pham co id = " + product.getId() + " va ten = '" + product.getNameProduct() + "' duoc tim thay.");
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getId() == product.getId()) {
                        System.out.println(products.get(i));
                    }
                }
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Khong tim thay san pham nao co ten hoac ID la: " + findProduct);
        }
    }

    public ArrayList<Product> sortByPrice() {
        Collections.sort(products);
        return products;
    }

    public ArrayList<Product> sortLowToHighPrice() {
        Collections.sort(products, new CompareLowToHigh());
        return products;
    }
}

