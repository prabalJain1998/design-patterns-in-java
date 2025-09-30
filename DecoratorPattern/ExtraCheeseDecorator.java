public class ExtraCheeseDecorator extends ToppingDecorator {
    BasePizza pizza;

    public ExtraCheeseDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
