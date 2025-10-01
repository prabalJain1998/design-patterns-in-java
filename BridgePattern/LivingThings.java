public abstract class LivingThings {
    BreathImplementor breathImplementor;

    LivingThings(BreathImplementor bI) {
        this.breathImplementor = bI;
    }
    
    public abstract void doBreath();
}