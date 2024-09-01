import observable.IPhoneStockObservable;
import observer.EmailAlertObserver;
import observer.MobileMsgAlertObserver;

public class Store {
    public static void main(String[] args) {
        final IPhoneStockObservable iPhoneStockObservable = new IPhoneStockObservable();
        iPhoneStockObservable.add(new EmailAlertObserver( "user1@gmail.com", iPhoneStockObservable));
        iPhoneStockObservable.add(new MobileMsgAlertObserver("9857123482", iPhoneStockObservable));
        iPhoneStockObservable.add(new EmailAlertObserver("user2@gmail.com", iPhoneStockObservable));

        iPhoneStockObservable.setStockCount(10);
        iPhoneStockObservable.setStockCount(0);
        iPhoneStockObservable.setStockCount(100);
    }
}