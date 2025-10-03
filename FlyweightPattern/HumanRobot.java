public class HumanRobot implements Robot {
    String bitMap;

    HumanRobot(String bitMap) {
        this.bitMap = bitMap;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Humaniod robot "+x+" "+y);
    }
    
}
