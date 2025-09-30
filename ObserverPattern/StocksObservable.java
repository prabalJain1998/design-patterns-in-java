public interface StocksObservable {
    public void add(NotificationAlertObservable observer);
    public void remove(NotificationAlertObservable observer);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
