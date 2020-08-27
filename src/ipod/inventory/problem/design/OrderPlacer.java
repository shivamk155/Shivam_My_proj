package ipod.inventory.problem.design;


public class OrderPlacer {

    private static String order1 = "BRAZIL:B123AB1234567:IPHONE:20:IPOD:10";
    private static String order2 = "ARGENTINA:B123AB1234567:IPHONE:22:IPOD:10";
    private static String order3 = "BRAZIL:AAB123456789:IPHONE:125:IPOD:70";
    private static String order4 = "ARGENTINA:AAB123456789:IPOD:50:IPHONE:25";
    private static String order5 = "BRAZIL:IPHONE:50:IPOD:150";
    private static String order6 = "BRAZIL:IPHONE:250:IPOD:150";

    public static void main(String[] args) {

        OrderParser parser = new OrderParser();
        Order currentOrder = parser.parseOrderString(order1);

        InventoryPrice store = new InventoryPrice();

        //Correct this below line.
        long minPrice = new Calculate().calculateMinPrice(currentOrder, store);

    }
}
