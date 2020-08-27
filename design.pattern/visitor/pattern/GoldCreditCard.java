package visitor.pattern;
//This was created to show double dispatch issue.
public class GoldCreditCard implements CreditCard {
    @Override
    public String getCardName() {
        return "This is Gold Card";
    }
}
