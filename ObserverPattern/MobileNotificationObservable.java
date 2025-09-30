public class MobileNotificationObservable implements NotificationAlertObservable {
    String mobileNumber;
    StocksObservable observable;

    public MobileNotificationObservable(StocksObservable observable, String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Wuhoo!!! Stocks are added "+ this.mobileNumber);
    }
    
}
