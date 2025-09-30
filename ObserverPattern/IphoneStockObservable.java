import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StocksObservable {
    List<NotificationAlertObservable> subscribersList;
    int stock = 0;

    public IphoneStockObservable() {
        subscribersList = new ArrayList<>();
    }

    @Override
    public void add(NotificationAlertObservable observer) {
        subscribersList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObservable observer) {
        subscribersList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObservable n:subscribersList) {
            n.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(this.stock == 0) {
            notifySubscribers();
        }
        this.stock += newStockCount;
    }

    @Override
    public int getStockCount() {
        return this.stock;
    }
    
}
