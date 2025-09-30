public class Main {
    public static void main(String args[]) {
        IphoneStockObservable iphoneObservable = new IphoneStockObservable();
        NotificationAlertObservable not1 = new MobileNotificationObservable(iphoneObservable, "9893337911");
        NotificationAlertObservable not2 = new MobileNotificationObservable(iphoneObservable, "88758989888");
        NotificationAlertObservable not3 = new EmailNotificationObservable(iphoneObservable, "abc@gmail.com");

        iphoneObservable.add(not1);
        iphoneObservable.add(not2);
        iphoneObservable.add(not3);

        System.out.println("Current stock count "+ iphoneObservable.getStockCount());
        System.out.println("setting stock count to 10");
        iphoneObservable.setStockCount(10);
    }
}