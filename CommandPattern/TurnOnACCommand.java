public class TurnOnACCommand implements Command {
    AirConditioner ac;

    TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOnAC();
    }

    @Override
    public void undo() {
        
    }
    
}
