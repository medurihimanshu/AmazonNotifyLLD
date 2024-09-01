package observer;

import observable.StocksObservable;

public class MobileMsgAlertObserver implements NotifyAlertObserver {
    private final String mobileNumber;
    private final StocksObservable stocksObservable;

    public MobileMsgAlertObserver(String mobileNumber, StocksObservable stocksObservable) {
        this.mobileNumber = mobileNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        int currentStockCount = stocksObservable.getStockCount();
        sendMsgUpdate(currentStockCount);
    }

    private void sendMsgUpdate(int currentStockCount) {
        System.out.printf("Last %d stocks are left for mobile number - %s \n", currentStockCount, mobileNumber);
    }
}
