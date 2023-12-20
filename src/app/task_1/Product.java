package app.task_1;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + quantity + " kg";
    }
}

class ProductListManager {
    private Map<String, Product> productList = new HashMap<>();

    public void addProduct(String name, int quantity) {
        Product product = new Product(name, quantity);
        productList.put(name, product);
    }

    public void printProductList() {
        int count = 1;
        for (Product product : productList.values()) {
            System.out.println(count++ + ") " + product);
        }
    }
}
