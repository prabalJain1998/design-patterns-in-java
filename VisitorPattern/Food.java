public class Food implements VisitableProduct {
    private int price;

    Food(int price) {
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
