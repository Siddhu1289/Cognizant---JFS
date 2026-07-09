public class SortingCustomerOrders {

    // Bubble Sort
    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;

                }
            }
        }
    }

    // Display Orders
    public static void displayOrders(Order[] orders) {

        for (Order order : orders) {
            order.display();
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Siddhu", 2500),
                new Order(102, "Sindhu", 1800),
                new Order(103, "Ravi", 3200),
                new Order(104, "Priya", 1500)
        };

        System.out.println("Before Sorting:");

        displayOrders(orders);

        bubbleSort(orders);

        System.out.println("\nAfter Sorting (Ascending by Total Price):");

        displayOrders(orders);
    }
}