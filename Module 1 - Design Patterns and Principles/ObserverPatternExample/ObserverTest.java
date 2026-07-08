public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Siddhu");
        Observer web = new WebApp("Sindhu");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStock("TCS", 3850.50);

        System.out.println();

        stockMarket.setStock("Infosys", 1625.75);
    }
}