import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].getProductId() == id)
                return products[mid];

            if (products[mid].getProductId() < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", 55000),
                new Product(103, "Keyboard", 1200),
                new Product(102, "Mouse", 600),
                new Product(104, "Monitor", 12000)
        };

        System.out.println("Linear Search:");

        Product p1 = linearSearch(products, 102);

        if (p1 != null)
            p1.display();
        else
            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("Binary Search:");

        Product p2 = binarySearch(products, 104);

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product Not Found");
    }
}