class Main {
    public static void main(String args[]) {
        Vehicle vh = VehicleFactory.getInstance("SOMETHING");
        System.out.println(vh.getFuelValue());
        System.out.println(vh.getTankCapacity());
    }
}