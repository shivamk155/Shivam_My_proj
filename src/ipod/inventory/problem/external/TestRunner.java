package ipod.inventory.problem.external;

public class TestRunner {
    public static void main(String[] args) throws InputMismatchException {
        String inputString1 = "BRAZIL:B123AB1234567:IPHONE:20:IPOD:10";

        String inputString2 = "ARGENTINA:B123AB1234567:IPHONE:22:IPOD:10";
        String inputString3 = "BRAZIL:AAB123456789:IPHONE:125:IPOD:70";
        String inputString4 = "ARGENTINA:AAB123456789:IPOD:50:IPHONE:25";
        String inputString5 = "BRAZIL:IPHONE:50:IPOD:150";
        String inputString6 = "BRAZIL:IPHONE:250:IPOD:150";


        String actual = OrderService.fulfill(inputString1);
        System.out.println(actual);
    }

}
