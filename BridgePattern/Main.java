class Main {
    public static void main(String[] args) {
        BreathImplementor bh = new WaterBreathing();
        DogLivingThings dog = new DogLivingThings(bh);
        dog.doBreath();
    }
}