package visitor.pattern;

public class Apartment implements Node {
    @Override
    public String draw() {
        return "Apartment is drawn.";
    }

    @Override
    public String accept(Visitor v) {
        return v.exportApartment(this);
    }
}
