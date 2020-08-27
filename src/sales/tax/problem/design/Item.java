package sales.tax.problem.design;
public interface Item {

    String getName();

    double getInitPrice();

    boolean isImported();

    boolean isExempt();

    double getPrice();

}
