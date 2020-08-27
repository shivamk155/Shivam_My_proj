package ipod.inventory.problem.external;

import java.util.HashMap;
import java.util.Map;

import static ipod.inventory.problem.external.StoreConstants.*;

public class Store {

    public static Store createNewArgentinaStore() {
        return new Store(ARGENTINA,
                new Inventory(Item.IPOD, ARGENTINA_IPOD, ARGENTINA_IPOD_COST),
                new Inventory(Item.IPHONE, ARGENTINA_IPHONE, ARGENTINA_IPHONE_COST));
    }

    public static Store createNewBrazilianStore() {
        return new Store(BRAZIL,
                new Inventory(Item.IPOD, BRAZIL_IPOD, BRAZIL_IPOD_COST),
                new Inventory(Item.IPHONE, BRAZIL_IPHONE, BRAZIL_IPHONE_COST));
    }

    private String storeLocation;
    private Map<Item, Inventory> inventory = new HashMap<Item, Inventory>();

    private Store(String storeLocation, Inventory... inventory) {
        super();
        this.storeLocation = storeLocation;

        for (Inventory inventoryOrdered : inventory) {
            this.inventory.put(inventoryOrdered.getItemType(), inventoryOrdered);
        }
    }

    public int getItemCount(Item item) {
        return inventory.get(item).getItemCount();
    }

    public int getItemPrice(Item itemType) {
        return inventory.get(itemType).getItemPrice();
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public String processOrder(String inputString) throws InputMismatchException {
        return OrderService.fulfill(inputString);
    }

    public void setItemCount(Item itemType, int itemCount) {
        this.inventory.get(itemType).setItemCount(itemCount);

    }
}
