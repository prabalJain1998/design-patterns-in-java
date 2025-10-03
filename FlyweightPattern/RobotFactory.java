import java.util.HashMap;

public class RobotFactory {
    HashMap<String, Robot> robotMap;

    RobotFactory() {
        robotMap = new HashMap<>();
    }
    
    public Robot createRobot(String type) {
        if(type.equals("HUMAN")) {
            if(robotMap.containsKey("HUMAN")) {
                return robotMap.get("HUMAN");
            } else {
                System.out.println("Already existing Human robot !!!");
                Robot hRobot = new HumanRobot("HUMAN");
                return hRobot;
            }
        } else {
            if(robotMap.containsKey("DOG")) {
                return robotMap.get("DOG");
            } else {
                System.out.println("Already existing Dog robot !!!");
                Robot dogRobot = new DogRobot("DOG");
                return dogRobot;
            }
        }
    } 
    
}
