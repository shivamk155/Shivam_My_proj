package ipod.inventory.problem.design;

public class InventoryPrice {
    //contains inventory of iphones and ipods in a singleton fashion.

    private long iphoneInventoryBrazil = 100;
    private long iphonePriceBrazil = 100;

    private long iphoneInventoryArgentina = 50;
    private long iphonePriceArgentina = 150;

    private long ipodInventoryBrazil = 100;

    public void setIphoneInventoryBrazil(long iphoneInventoryBrazil) {
        this.iphoneInventoryBrazil = iphoneInventoryBrazil;
    }

    public void setIphoneInventoryArgentina(long iphoneInventoryArgentina) {
        this.iphoneInventoryArgentina = iphoneInventoryArgentina;
    }

    public void setIpodInventoryBrazil(long ipodInventoryBrazil) {
        this.ipodInventoryBrazil = ipodInventoryBrazil;
    }

    public void setIpodInventoryArgentina(long ipodInventoryArgentina) {
        this.ipodInventoryArgentina = ipodInventoryArgentina;
    }

    private long ipodPriceBrazil = 65;

    private long ipodInventoryArgentina = 100;
    private long ipodPriceArgentina = 100;


    public long getIphoneInventoryBrazil() {
        return iphoneInventoryBrazil;
    }

    public long getIphonePriceBrazil() {
        return iphonePriceBrazil;
    }

    public long getIphoneInventoryArgentina() {
        return iphoneInventoryArgentina;
    }

    public long getIphonePriceArgentina() {
        return iphonePriceArgentina;
    }

    public long getIpodInventoryBrazil() {
        return ipodInventoryBrazil;
    }

    public long getIpodPriceBrazil() {
        return ipodPriceBrazil;
    }

    public long getIpodInventoryArgentina() {
        return ipodInventoryArgentina;
    }

    public long getIpodPriceArgentina() {
        return ipodPriceArgentina;
    }
}
