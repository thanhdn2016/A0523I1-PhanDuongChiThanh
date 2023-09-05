package ss8_cleancode_mvc.reponsitory.impl;

import ss8_cleancode_mvc.model.Product;
import ss8_cleancode_mvc.reponsitory.IProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "truyen tranh", 1000, "mot cuon truyen tranh"));
        products.add(new Product(2, "qua trung ga", 2000, "ga de ra qua trung"));
        products.add(new Product(3, "iphone", 5500, "mot chiec smartphone"));
        products.add(new Product(4, "gau bong", 155000, "mot con gau nhoi bong"));
    }

    @Override
    public ArrayList<Product> getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void deleteProductById(int idProduct) {
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idProduct) {
                products.remove(i);
                flag = true;
                System.out.println("Da xoa 1 san pham");
                break;
            }
        }
        if (!flag) {
            System.out.println("id san pham khong hop le!");
        }
    }

    //    public void findProductById(int findId){
//        for (int i = 0; i < products.size();i++) {
//            if (products.get(i).getId()==findId){
//                System.out.println(products.get(i));
//            }
//        }
//    }
    public void findProductByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoac ID san pham can tim: ");
        String findProduct = scanner.nextLine();
        boolean flag = false;
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(findProduct) || Integer.toString(product.getId()).equals(findProduct)) {
                System.out.println("San pham co id = " + product.getId() + " va ten = '" + product.getName() + "' duoc tim thay.");
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

    public void editProduct(int idProduct) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        for (int i = 0; i < products.size(); i++) {
            if (idProduct == products.get(i).getId()) {
                products.remove(i);
                System.out.print("Nhap vao id can sua doi: ");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhap vao ten san pham can sua doi: ");
                String newName = scanner.nextLine();
                System.out.print("Nhap vao gia san pham can thay doi: ");
                int newPrice = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhap vao mo ta san pham moi: ");
                String newDescribe = scanner.nextLine();
                products.add(i, new Product(newId, newName, newPrice, newDescribe));
                System.out.println("Da sua thanh cong");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("ID khong hop le!");
        }
    }
}
