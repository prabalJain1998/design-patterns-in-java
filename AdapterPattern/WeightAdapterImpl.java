public class WeightAdapterImpl implements WeightAdapter {
    WeightMachine w;

    public WeightAdapterImpl(WeightMachine w) {
        this.w = w;
    }
    @Override
    public double getWeightInKgs() {
        return w.getWeightInPound() * 0.4;
    }
    
}
