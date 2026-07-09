public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 55000));

        manager.addProduct(new Product(102, "Mouse", 50, 600));

        manager.addProduct(new Product(103, "Keyboard", 20, 1200));

        manager.displayProducts();

        System.out.println();

        manager.updateProduct(102, 75);

        manager.displayProducts();

        System.out.println();

        manager.deleteProduct(103);

        manager.displayProducts();

    }
}