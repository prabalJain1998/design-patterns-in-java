public class Memento {
    State st;

    public Memento(State st) {
        this.st = st;
    }

    public State getState() {
        return this.st;
    }
}
