class Main {
    public static void main(String[] args) {
        RobotFactory r = new RobotFactory();

        for(int i=0;i<1000;i++) {
            Robot x = r.createRobot("HUMAN");
            x.display(i, i+1);
        }
    }
}