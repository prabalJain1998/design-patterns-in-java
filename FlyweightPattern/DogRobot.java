public class DogRobot implements Robot {
    String bitMap;

    DogRobot(String bitMap) {
        this.bitMap = bitMap;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("DogRobot robot "+x+" "+y);
    }   
}