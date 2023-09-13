package ss12_java_collection_framework;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    int id,price;
    String nameProduct;

    public Product(int id, String nameProduct,int price) {
        this.id = id;
        this.price = price;
        this.nameProduct = nameProduct;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ", Ten san pham = '" + nameProduct + '\''+
                ", Gia tien = " + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
            return o.getPrice()-this.price;
    }

}
