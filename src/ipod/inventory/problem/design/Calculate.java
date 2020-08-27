package ipod.inventory.problem.design;

public class Calculate {

    public long calculateMinPrice(Order currentOrder, InventoryPrice inventoryPrice) {
        boolean isImportDiscount = Util.otherCountryPassport(currentOrder.getPurchaseCountry(), currentOrder.getPassportNumber());

        calculateBreakEvenUnitCount(currentOrder, inventoryPrice, isImportDiscount);
        long minPrice = calculatePrice(currentOrder, inventoryPrice);


        return 0;
    }

    public void calculateBreakEvenUnitCount(Order order, InventoryPrice inventoryPrice, boolean isImportDiscount) {
        double logisticsPrice = Logistics.getLogisticsCost();

        if (isImportDiscount)
            logisticsPrice = Logistics.getLogisticsCost() * Logistics.getLogisticsDiscount();

        //For Item 1;
        for (int i = 1; i <= Logistics.getLogisticsSingleUnitCount(); i++) {
            if ((inventoryPrice.getIphonePriceArgentina() - inventoryPrice.getIphonePriceBrazil()) * i < logisticsPrice) {
                order.getItem_iphone().setItemLogisticsBreakEvenQuantity(i);
                break;
            }
        }

        //For Item 2;
        for (int i = 1; i <= Logistics.getLogisticsSingleUnitCount(); i++) {
            if ((inventoryPrice.getIpodPriceArgentina() - inventoryPrice.getIpodPriceBrazil()) * i < logisticsPrice) {
                order.getItem_ipod().setItemLogisticsBreakEvenQuantity(i);
                break;
            }
        }
    }

    public long calculatePrice(Order currentOrder, InventoryPrice inventoryPrice) {


        return calculatePriceIphone(currentOrder, inventoryPrice)
                + calculatePriceIpod(currentOrder, inventoryPrice);
    }

    public long calculatePriceIphone(Order currentOrder, InventoryPrice inventoryPrice) {
        long importQuantity = currentOrder.getItem_iphone().getItemQuantity()
                / Logistics.getLogisticsSingleUnitCount();

        long importLeftOverQuantity = currentOrder.getItem_iphone().getItemQuantity()
                % Logistics.getLogisticsSingleUnitCount();


        if (importLeftOverQuantity >= currentOrder.getItem_iphone().getItemLogisticsBreakEvenQuantity())
            importQuantity += 1;


        //return the total cost by multiplying the import_quantity_unit

        return importQuantity;
    }

    public long calculatePriceIpod(Order currentOrder, InventoryPrice inventoryPrice) {


        return 0;
    }
}