public class VehicleFactory {

    static Vehicle getInstance(String type) {
        if(type.equals("CAR")) {
            return new Car();
        }

        return new NullVehicle();
    }
    
}
