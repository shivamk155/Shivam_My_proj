package visitor.pattern;

public class Museum implements Node {
    @Override
    public String draw() {
        return "Museum is drawn.";
    }

    @Override
    public String accept(Visitor v) {
        return v.exportMuseum(this);
    }
}
