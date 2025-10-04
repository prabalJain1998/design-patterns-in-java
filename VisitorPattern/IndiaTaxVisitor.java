public class IndiaTaxVisitor implements TaxVisitor {

    @Override
    public String getTitle() {
        return "India Tax";
    }

    @Override
    public double visit(Electronics electronics) {
        return electronics.getPrice() * 0.5;
    }

    @Override
    public double visit(Clothing clothing) {
        return clothing.getPrice() * 0.5;
    }

    @Override
    public double visit(Food food) {
      return food.getPrice() * 0.5;
    }
    
    
}
