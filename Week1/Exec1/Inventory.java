package Exec1;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void updateProduct(String productId, Product updatedProduct) {
        int index = findProductIndexById(productId);
        if (index != -1) {
            inventory.set(index, updatedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }


    public void deleteProduct(String productId) {
        int index = findProductIndexById(productId);
        if (index != -1) {
            inventory.remove(index);
        } else {
            System.out.println("Product not found.");
        }
    }

    public Product getProduct(String productId) {
        int index = findProductIndexById(productId);
        if (index != -1) {
            return inventory.get(index);
        }
        return null;
    }

    private int findProductIndexById(String productId) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getProductId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }

    public void printInventory() {
        for (Product product : inventory) {
            System.out.println(product);
        }
    }
}
