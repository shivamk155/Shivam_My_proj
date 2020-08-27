package visitor.pattern;
//This was created to show double dispatch issue.
public class HotelOffer implements CardOffers {
    @Override
    public String getOfferName() {
        return "This is Hotel Card Offer";
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
