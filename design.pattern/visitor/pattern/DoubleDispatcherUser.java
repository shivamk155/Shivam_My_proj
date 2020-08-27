package visitor.pattern;

public class DoubleDispatcherUser {
    public static void main(String[] args) {

        visitor.pattern.CardOffers shopOffer = new visitor.pattern.ShoppingOffer();
        System.out.println(shopOffer.getOfferName());

        visitor.pattern.CreditCard gold = new visitor.pattern.GoldCreditCard();
        System.out.println(gold.getCardName());

        //The compilation error in below line is what double dispatch issue is.
        //The visitor design pattern is also able to solve this DD pattern.
        //shopOffer.getOfferName(gold);



    }
}
