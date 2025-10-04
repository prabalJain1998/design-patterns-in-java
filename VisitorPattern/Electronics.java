public class Electronics implements VisitableProduct {
    private int price;

    Electronics(int price) {
        this.price = price;
    }

    int getPrice() {
        return this.price;    
    }
    @Override
    public double accept(TaxVisitor visitor) {
        return visitor.visit(this);
    }
    
    
}
