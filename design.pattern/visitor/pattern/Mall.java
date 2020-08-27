package visitor.pattern;

public class Mall implements Node {
    @Override
    public String draw() {
        return "Mall is drawn";
    }

    @Override
    public String accept(Visitor v) {
        return v.exportMall(this);
    }
}
