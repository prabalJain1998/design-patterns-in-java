public class FishLivingThings extends LivingThings {

    FishLivingThings(BreathImplementor bh) {
        super(bh);
    }

    @Override
    public void doBreath() {
       breathImplementor.doBreathing();
    }
}
