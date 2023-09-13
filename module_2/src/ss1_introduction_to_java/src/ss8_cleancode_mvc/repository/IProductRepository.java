package ss8_cleancode_mvc.repository;

import ss8_cleancode_mvc.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList getListProduct();

    void addProduct(Product product);

    void deleteProductById(int idProduct);

    void findProductByName();

    //void findProductById(int findId);
    void editProduct(int idProduct);
}
