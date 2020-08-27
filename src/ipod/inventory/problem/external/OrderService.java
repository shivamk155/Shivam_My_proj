package ipod.inventory.problem.external;

import ipod.inventory.problem.external.StoreConstants.*;

import java.util.LinkedHashMap;
import java.util.Map;

import static ipod.inventory.problem.external.StoreConstants.Item.IPHONE;
import static ipod.inventory.problem.external.StoreConstants.Item.IPOD;
import static ipod.inventory.problem.external.StoreConstants.OUT_OF_STOCK;

public class OrderService {
    // maintain all stores in order for std way of o/p
    private static Map<String, Store> allStores = new LinkedHashMap<String, Store>();
    private static final int DISCOUNT_PERCENTAGE = 20;

    private static final int TRANSPORT_COST_PER_LOT = 400;
    private static final int DISCOUNTED_COST_PER_LOT = TRANSPORT_COST_PER_LOT
            - (DISCOUNT_PERCENTAGE * TRANSPORT_COST_PER_LOT) / 100;
    private static final int QUANTA = 10;

    static {
        initializeStores();
    }

    private static int calcPurchaseCosts(Order order, Store purchaseStore, Item itemType) {
        Store foreignStore = OrderService.getForeignStore(purchaseStore);

        int itemReq = order.getItemCount(itemType);
        int cost = 0;
        int maxItemForImport = itemReq;
        int tempCost = 0;
        int tempHome = purchaseStore.getItemCount(itemType);
        int tempFor = foreignStore.getItemCount(itemType);

        boolean isDiscountApplicable = foreignStore.getStoreLocation().equals(order.getNationality());

        int transportCost = 0;

        for (int itemForImport = 0; itemForImport <= maxItemForImport; itemForImport++) {
            int itemFromHomeLocation = itemReq - itemForImport;
            if (purchaseStore.getItemCount(itemType) < itemFromHomeLocation) {
                continue;
            }
            transportCost = calculateTransportCost(isDiscountApplicable, itemForImport);
            tempCost = itemFromHomeLocation * purchaseStore.getItemPrice(itemType) + itemForImport
                    * foreignStore.getItemPrice(itemType) + transportCost;
            if (cost == 0) {
                cost = tempCost;
                tempHome = purchaseStore.getItemCount(itemType) - itemFromHomeLocation;
                tempFor = foreignStore.getItemCount(itemType) - itemForImport;
            } else {
                if (tempCost < cost) {
                    cost = tempCost;
                    tempHome = purchaseStore.getItemCount(itemType) - itemFromHomeLocation;
                    tempFor = foreignStore.getItemCount(itemType) - itemForImport;
                }
            }
        }

        purchaseStore.setItemCount(itemType, tempHome);
        foreignStore.setItemCount(itemType, tempFor);

        return cost;
    }

    private static int calculateTransportCost(boolean isDiscountApplicable, int importItemCount) {
        int transportCost;
        if (importItemCount == 0) {
            transportCost = 0;
        } else {
            transportCost = isDiscountApplicable ? ((importItemCount - 1) / QUANTA + 1)
                    * DISCOUNTED_COST_PER_LOT : ((importItemCount - 1) / QUANTA + 1)
                    * TRANSPORT_COST_PER_LOT;
        }
        return transportCost;
    }

    public static String convertToOutputFormat(String cost, Store purchaseStore) {
        String output = cost;
        for (Item item : Item.values()) {
            for (Map.Entry<String, Store> entry : allStores.entrySet()) {
                output += ":" + allStores.get(entry.getKey()).getItemCount(item);
            }
        }
        return output;
    }

    public static String fulfill(String inputString) throws InputMismatchException {
        initializeStores();
        String output = "";
        Store purchaseStore = allStores.get(inputString.split(":")[0]);
        Order order = parseInput(inputString);

        int cost = 0;
        try {
            validateStock(order, purchaseStore);
            for (Item itemType : order.getItems()) {
                cost += calcPurchaseCosts(order, purchaseStore, itemType);
            }
            output = OrderService.convertToOutputFormat(String.valueOf(cost), purchaseStore);
        } catch (OutOfStockException e) {
            output = OrderService.convertToOutputFormat(OUT_OF_STOCK, purchaseStore);
        }

        return output;
    }

    private static Store getForeignStore(Store homeStore) {
        for (Map.Entry<String, Store> entry : OrderService.allStores.entrySet()) {
            if (homeStore != entry.getValue()) {
                return entry.getValue();
            }
        }
        return null;
    }

    private static void initializeStores() {

        Store brazilStore = Store.createNewBrazilianStore();
        Store argentianStore = Store.createNewArgentinaStore();

        allStores.put(StoreConstants.BRAZIL, brazilStore);
        allStores.put(StoreConstants.ARGENTINA, argentianStore);

    }

    private static Order parseInput(String inputStr) throws InputMismatchException {
        String[] params = inputStr.split(":");
        if (params.length == 6) {
            return new Order(allStores.get(params[0]), params[1],
                    new Inventory(Item.getItemTypeByStr(params[2]), new Integer(params[3])),
                    new Inventory(Item.getItemTypeByStr(params[4]), new Integer(params[5])));
        } else if (params.length == 5) {
            return new Order(allStores.get(params[0]), null,
                    new Inventory(Item.getItemTypeByStr(params[1]), new Integer(params[2])),
                    new Inventory(Item.getItemTypeByStr(params[3]), new Integer(params[4])));
        } else {
            throw new InputMismatchException();
        }

    }

    private static void validateStock(Order order, Store homeStore) throws OutOfStockException {
        Store foriegnStore = OrderService.getForeignStore(homeStore);
        if (order.getItemCount(IPHONE) > (homeStore.getItemCount(IPHONE) + foriegnStore
                .getItemCount(IPHONE))
                || order.getItemCount(IPOD) > (homeStore.getItemCount(IPOD) + foriegnStore
                .getItemCount(IPOD))) {
            throw new OutOfStockException();
        }
    }
}
