package app.task_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class ProductManager implements AutoCloseable {
        private final Map<String, Integer> productList = new HashMap<>();
        private final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            try (ProductManager productManager = new ProductManager()) {
                productManager.initializeData();
                System.out.println("Initial data:");
                productManager.printProductList();

                System.out.print("\nEnter the product name to search: ");
                String productName = productManager.scanner.nextLine();
                productManager.searchProduct(productName);
            }
        }

        private void initializeData() {
            productList.put("orange", 12);
            productList.put("banana", 25);
            productList.put("lemon", 8);
            productList.put("plum", 15);
            productList.put("pineapple", 13);
            productList.put("grape", 9);
        }

        private void searchProduct(String productName) {
            if (productList.containsKey(productName)) {
                System.out.println("Product found: " + productName + ", " + productList.get(productName) + " kg");
            } else {
                System.out.println("Product not found: " + productName);
            }
        }

        private void printProductList() {
            int count = 1;
            for (Map.Entry<String, Integer> entry : productList.entrySet()) {
                System.out.println(count + ") " + entry.getKey() + ", " + entry.getValue() + " kg");
                count++;
            }
        }

        @Override
        public void close() {
            scanner.close();
        }
}