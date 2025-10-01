public class DogLivingThings extends LivingThings {

    DogLivingThings(BreathImplementor bh) {
        super(bh);
    }

    @Override
    public void doBreath() {
       breathImplementor.doBreathing();
    }
}
