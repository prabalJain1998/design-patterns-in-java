public interface VisitableProduct {
    double accept(TaxVisitor visitor);
}
