package adapter;

import adapter.thirdparty.IciciBankApi;
import adapter.thirdparty.YesBankApi;

public class Phonepe {

    private BankApi bankApi;
    Phonepe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public void doSomething() throws InterruptedException {
        double currentBalance = bankApi.getBalance(String.valueOf(1999));
        Thread.sleep(25 * 24 * 60 * 60 * 1000);

        currentBalance *= 2;
    }

}
