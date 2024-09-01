package observable;

import java.util.ArrayList;
import java.util.List;
import observer.NotifyAlertObserver;

public class IPhoneStockObservable implements StocksObservable {
    private final List<NotifyAlertObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotifyAlertObserver notifyAlertObserver) {
        observerList.add(notifyAlertObserver);
    }

    @Override
    public void remove(NotifyAlertObserver notifyAlertObserver) {
        observerList.remove(notifyAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        observerList.forEach(NotifyAlertObserver::update);
    }

    @Override
    public void setStockCount(int stockCount) {
        if (this.stockCount == 0) {
            this.stockCount = stockCount;
            notifySubscribers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
