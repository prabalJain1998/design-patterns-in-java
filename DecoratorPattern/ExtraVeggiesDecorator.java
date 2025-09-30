public class ExtraVeggiesDecorator extends ToppingDecorator {
    BasePizza pizza;
    
    public ExtraVeggiesDecorator (BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 15;
    }

}
