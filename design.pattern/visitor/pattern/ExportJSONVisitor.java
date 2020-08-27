package visitor.pattern;

public class ExportJSONVisitor implements Visitor {
    @Override
    public String exportApartment(Node n) {
        return "Apartment has been exported as JSON.";
    }

    @Override
    public String exportMall(Node n) {
        return "Mall has been exported as JSON.";
    }

    @Override
    public String exportMuseum(Node n) {
        return "Museum has been exported as JSON.";
    }
}
