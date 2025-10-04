public class Clothing implements VisitableProduct {
    private int price;

    Clothing(int price) {
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
