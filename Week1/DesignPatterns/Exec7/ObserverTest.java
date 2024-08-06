

public class ObserverTest {

    public static void main(String[] args) {
        // Create StockMarket
        StockMarket stockMarket = new StockMarket();

        // Create Observers
        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        // Register Observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Simulate a change in stock price
        stockMarket.setStockPrice(100.00);
        System.out.println();

        // Change the stock price again
        stockMarket.setStockPrice(105.50);
        System.out.println();

        // Remove one observer and change the stock price
        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice(110.75);
    }
}
