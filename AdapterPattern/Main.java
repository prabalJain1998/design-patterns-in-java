class Main {
    public static void main(String[] args) {
        WeightAdapter wAdd = new WeightAdapterImpl(new WeightMachineForAdult(40));
        System.out.println(wAdd.getWeightInKgs());
    }
}