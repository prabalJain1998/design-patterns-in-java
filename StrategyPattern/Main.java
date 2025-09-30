class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");
        DriveInterface drive = new NormalDrive();
        Vehicle vh = new PassengerVehicle(drive);
        vh.drive();
    }
}