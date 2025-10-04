public interface TaxVisitor {
    String getTitle();
    double visit(Electronics electronics);
    double visit(Clothing clothing);
    double visit(Food food);
}