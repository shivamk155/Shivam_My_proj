package ipod.inventory.problem.design;

//Can use builder design pattern
public class Order {

    private String purchaseCountry;
    private String passportNumber;

    private Item item_ipod;
    private Item item_iphone;

    public Item getItem_ipod() {
        return item_ipod;
    }

    public Item getItem_iphone() {
        return item_iphone;
    }

    public void setItem_ipod(Item item_ipod) {
        this.item_ipod = item_ipod;
    }

    public void setItem_iphone(Item item_iphone) {
        this.item_iphone = item_iphone;
    }

    public String getPurchaseCountry() {
        return purchaseCountry;
    }

    public void setPurchaseCountry(String purchaseCountry) {
        this.purchaseCountry = purchaseCountry;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

}
