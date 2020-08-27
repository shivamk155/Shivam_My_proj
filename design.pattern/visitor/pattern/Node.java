package visitor.pattern;

public interface Node {
    public String draw();
    public String accept(Visitor v);
}
