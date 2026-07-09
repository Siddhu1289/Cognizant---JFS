import java.util.HashMap;

public class InventoryManager {

    private HashMap<Integer, Product> inventory = new HashMap<>();

    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int id, int quantity) {

        Product product = inventory.get(id);

        if (product != null) {
            product.setQuantity(quantity);
            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    
    public void deleteProduct(int id) {

        if (inventory.remove(id) != null) {
            System.out.println("Product Deleted Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }
    public void displayProducts() {

        System.out.println("\nInventory");

        for (Product product : inventory.values()) {
            product.display();
        }
    }
}