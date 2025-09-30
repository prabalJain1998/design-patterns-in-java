public class Main {
    public static void main(String args[]) {
        // Create an order for customer : Margarita with extra Veggies and extra Cheese.
        BasePizza customerPizza = new ExtraVeggiesDecorator(new ExtraCheeseDecorator(new MargaritaPizza()));

        System.out.println("Price is " + customerPizza.cost());
        // Create an order for customer : farmhouse with extra Veggies and extra Cheese.
        BasePizza customerPizza2 = new ExtraVeggiesDecorator(new ExtraCheeseDecorator(new Farmhouse()));

        System.out.println("Price is " + customerPizza2.cost());
    }
}