package visitor.pattern;

public class ExportXmlVisitor implements Visitor {
    @Override
    public String exportApartment(Node n) {
        return n.draw() + " ,Apartment has been exported as XML.";
    }

    @Override
    public String exportMall(Node n) {
        return n.draw() + " ,Mall has been exported as XML.";
    }

    @Override
    public String exportMuseum(Node n) {
        return n.draw() + " ,Museum has been exported as XML.";
    }
}
