package observer;

import observable.StocksObservable;

public class EmailAlertObserver implements NotifyAlertObserver {
    private final StocksObservable stocksObservable;
    private final String emailId;

    public EmailAlertObserver(String emailId, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        int currentStockCount = stocksObservable.getStockCount();
        sendMailUpdate(currentStockCount);
    }

    private void sendMailUpdate(int currentStockCount) {
        System.out.printf("Last %d stocks are left for Email Id - %s\n", currentStockCount, emailId);
    }
}
