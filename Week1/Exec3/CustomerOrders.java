package Exec3;

public class CustomerOrders {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 200.00),
            new Order("O005", "Eve", 100.00),
        };

        System.out.println("Before Sorting:");
        printOrders(orders);

        SearchAlgorithms.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        printOrders(orders);

        shuffleArray(orders);

        SearchAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private static void shuffleArray(Order[] orders) {
        for (int i = orders.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Order temp = orders[i];
            orders[i] = orders[j];
            orders[j] = temp;
        }
    }
}
