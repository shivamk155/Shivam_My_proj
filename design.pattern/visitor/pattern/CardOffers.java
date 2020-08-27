package visitor.pattern;

//This was created to show double dispatch issue.
public interface CardOffers {
    public String getOfferName();
    public String getOfferName(GoldCreditCard gcc);
    public String getOfferName(BronzeCreditCard bcc);
}
