package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(5, "Xe May", 1000000));
        products.add(new Product(6, "Trung ga", 2000));
        products.add(new Product(7, "iphone", 1550000));
        products.add(new Product(8, "gau bong", 155000));
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
        int id;
        int existItemIndex = 0;
        System.out.println("Nhap vao id san pham can sua");
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                existItemIndex = i;
                break;
            }
        }
        if (id == products.get(existItemIndex).getId()) {
            System.out.println("Nhap ten moi cua san pham: ");
            String newName = scanner.nextLine();
            System.out.println("Nhap gia tien moi cua san pham: ");
            int newPrice = Integer.parseInt(scanner.nextLine());
            products.get(existItemIndex).setNameProduct(newName);
            products.get(existItemIndex).setPrice(newPrice);
        } else {
            System.out.println("ID khong ton tai");
        }
    }

    public void deleteById() {
        int existItemIndex = 0;
        int deleteId;
        System.out.print("Nhap vao id cua san pham can xoa: ");
         deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (deleteId == products.get(i).getId()) {
                existItemIndex = i;
                break;
            }
        }
        if (deleteId == products.get(existItemIndex).getId()) {
            products.remove(existItemIndex);
            System.out.println("Da xoa 1 san pham!");
        }
            else {
                System.out.println("ID khong ton tai");
            }
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

    public ArrayList<Product> sortByID() {
        Collections.sort(products);
        return products;
    }

    public ArrayList<Product> sortLowToHighPrice() {
        Collections.sort(products, new CompareLowToHigh());
        return products;
    }

    public ArrayList<Product> sortHighToLowPrice() {
        Collections.sort(products, new CompareHighToLow());
        return products;
    }
}

