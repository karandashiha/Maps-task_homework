package app.task_1;

public class Main {
    public static void main(String[] args) {

        ProductListManager productListManager = new ProductListManager();

        productListManager.addProduct("orange", 12);
        productListManager.addProduct("banana", 25);
        productListManager.addProduct("lemon", 8);
        productListManager.addProduct("pineapple", 13);
        productListManager.addProduct("grape", 9);

        System.out.println("Initial data:");
        productListManager.printProductList();

        productListManager.addProduct("banana", 14);
        productListManager.addProduct("plum", 15);

        System.out.println("\nUpdated data:");
        productListManager.printProductList();
    }
}
