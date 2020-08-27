package ipod.inventory.problem.design;

public class Item {

    private ItemType itemType;
    private long itemQuantity;
    private long itemLogisticsBreakEvenQuantity;

    public long getItemLogisticsBreakEvenQuantity() {
        return itemLogisticsBreakEvenQuantity;
    }

    public void setItemLogisticsBreakEvenQuantity(long itemLogisticsBreakEvenQuantity) {
        this.itemLogisticsBreakEvenQuantity = itemLogisticsBreakEvenQuantity;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public long getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

}
