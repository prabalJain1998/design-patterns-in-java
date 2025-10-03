public class RemoteControl {
    Command cmd;

    void setCommand(Command cmd) {
        this.cmd = cmd;
    }

    void pressButton() {
        cmd.execute();
    }

    void undo() {
        cmd.undo();
    }
}
