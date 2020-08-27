package visitor.pattern;

public interface Visitor {

    public String exportApartment(Node n);
    public String exportMall(Node n);
    public String exportMuseum(Node n);
}
