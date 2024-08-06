package Exec2;

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Refrigerator", "Home Appliances"),
            new Product("P004", "T-Shirt", "Clothing"),
            new Product("P005", "Jeans", "Clothing"),
        };

        Product foundProduct = SearchAlgorithms.linearSearch(products, "Smartphone");
        System.out.println("Linear Search Result: " + foundProduct);

        SearchAlgorithms.sortProductsByName(products);
        foundProduct = SearchAlgorithms.binarySearch(products, "Smartphone");
        System.out.println("Binary Search Result: " + foundProduct);
    }
}
