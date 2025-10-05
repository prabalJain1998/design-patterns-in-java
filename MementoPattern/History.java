import java.util.ArrayList;
import java.util.List;

public class History {
    List<Memento> historyList;

    History() {
        historyList = new ArrayList<>();
    }

    void save(Originator org) {
        historyList.add(new Memento(org.getState()));
    }

    void restore(Originator org) {
        if(historyList.size() != 0) {
            Memento lastOne = historyList.remove(historyList.size()-1);
            org.setState(lastOne.getState());
        } else {
            System.out.println("Nothing to restore");
        }
    }
}
