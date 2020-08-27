package visitor.pattern;

public class BronzeCreditCard implements visitor.pattern.CreditCard {
    @Override
    public String getCardName() {
        return "This is Bronze Card";
    }
}
