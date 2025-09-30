class Main {
    public static void main(String[] args) {
        CashHandler cH = new HundreadHandler(10, new TwentyHandler(2, new TenHandler(5, null)));
        cH.process(1030);
    }
}
