package visitor.pattern;

public class SilverCreditCard implements visitor.pattern.CreditCard {
    @Override
    public String getCardName() {
        return "This is Silver Card";
    }
}
