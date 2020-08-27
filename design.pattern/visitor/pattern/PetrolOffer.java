package visitor.pattern;

//This was created to show double dispatch issue.
public class PetrolOffer implements CardOffers {
    @Override
    public String getOfferName() {
        return "This is Petrol offer card";
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
