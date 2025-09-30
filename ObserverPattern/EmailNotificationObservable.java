public class EmailNotificationObservable implements NotificationAlertObservable {
    String emailID;
    StocksObservable observable;

    public EmailNotificationObservable(StocksObservable observable, String emailID) {
        this.emailID = emailID;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Wuhoo!!! Stocks are added for you "+ emailID);
    }
    
}
