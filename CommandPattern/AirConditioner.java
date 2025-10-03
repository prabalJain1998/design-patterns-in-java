public class AirConditioner {
    boolean isACTurnedOn;
    boolean isFANTurnedOn;

    AirConditioner() {
        this.isACTurnedOn = false;
        this.isFANTurnedOn = false;
    }

    public void turnOnAC() {
        System.out.println("AC is turned on!");
        this.isACTurnedOn = true;
    }

    public void turnOffAC() {
        System.out.println("AC is turned off!");
        this.isACTurnedOn = false;
    }

    public void turnOnFan() {
        this.isFANTurnedOn = true;
    }

    public void turnOffFan() {
        this.isFANTurnedOn = false;
    }
    
}
