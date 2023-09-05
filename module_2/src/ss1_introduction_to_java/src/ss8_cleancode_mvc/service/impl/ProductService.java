package ss8_cleancode_mvc.service.impl;

import ss8_cleancode_mvc.model.Product;
import ss8_cleancode_mvc.reponsitory.IProductRepository;
import ss8_cleancode_mvc.reponsitory.impl.ProductRepository;
import ss8_cleancode_mvc.service.IProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        ArrayList products = productRepository.getListProduct();
        for (Object i : products) {
            System.out.println(i);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia tien: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap mo ta san pham: ");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, describe);
        productRepository.addProduct(product);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham can xoa: ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductById(deleteId);
    }

    @Override
    public void find() {
        productRepository.findProductByName();
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ID san pham ban muon sua: ");
        int editId = Integer.parseInt(scanner.nextLine());
        productRepository.editProduct(editId);
    }
}
