public class Vehicle {
    DriveInterface obj;

    public Vehicle(DriveInterface obj) {
        this.obj = obj;
    }

    public void drive() {
        this.obj.drive();
    }
    
}
