public class Main {
    public static void main(String[] args) {
        History history = new History();
        State st1 = new State("MP", 100);
        Originator org = new Originator();
        org.setState(st1);
        history.save(org);

        State st2 = new State("UP", 12);
        org.setState(st2);


        System.out.println("Current config of State with name "+ org.getState().name + " area "+ org.getState().area);
        history.restore(org);
        System.out.println("After first undo config of State with name "+ org.getState().name + " area "+ org.getState().area);
        history.restore(org);
        System.out.println("After second undo config of State with name "+ org.getState().name + " area "+ org.getState().area);
    }
}
