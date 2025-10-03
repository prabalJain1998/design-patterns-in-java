public class TurnOffACCommand implements Command {
    AirConditioner ac;

    TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOffAC();
    }

    @Override
    public void undo() {
        
    }
    
}
