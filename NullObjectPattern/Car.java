public class Car implements Vehicle {
    @Override
    public int getFuelValue () {
        return 10;
    }

    @Override
    public int getTankCapacity () {
        return 100;
    }
}
