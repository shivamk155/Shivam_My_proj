package visitor.pattern;

public class patterUser {
    public static void main(String[] args) {
        Node mall = new Mall();
        Visitor xmlVisitor = new ExportXmlVisitor();

        System.out.println(mall.accept(xmlVisitor));
    }
}
