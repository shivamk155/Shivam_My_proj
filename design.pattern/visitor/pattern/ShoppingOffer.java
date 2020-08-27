package visitor.pattern;

public class ShoppingOffer implements CardOffers {
    @Override
    public String getOfferName() {
        return "This is Shopping offer card";
    }

    @Override
    public String getOfferName(GoldCreditCard gcc) {
        return null;
    }

    @Override
    public String getOfferName(BronzeCreditCard bcc) {
        return null;
    }
}
