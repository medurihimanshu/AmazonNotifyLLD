package observable;

import observer.NotifyAlertObserver;

public interface StocksObservable {

    public void add(NotifyAlertObserver notifyAlertObserver);

    public void remove(NotifyAlertObserver notifyAlertObserver);

    public void notifySubscribers();

    public void setStockCount(int count);

    public int getStockCount();
}
