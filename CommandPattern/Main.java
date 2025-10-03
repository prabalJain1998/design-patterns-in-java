class Main {
    public static void main(String[] args) {
        AirConditioner ac= new AirConditioner();
        RemoteControl rc =new RemoteControl();
        TurnOnACCommand c1 = new TurnOnACCommand(ac);
        TurnOffACCommand c2 = new TurnOffACCommand(ac);
        rc.setCommand(c1);
        rc.pressButton();
        rc.setCommand(c2);
        rc.pressButton();
    }
}