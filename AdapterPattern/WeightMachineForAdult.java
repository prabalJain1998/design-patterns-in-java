public class WeightMachineForAdult implements WeightMachine {
    int weight;

    public WeightMachineForAdult(int weight) {
        this.weight = weight;
    }

    @Override
    public double getWeightInPound () {
        return weight;
    }
    
}
