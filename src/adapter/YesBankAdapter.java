package adapter;

import adapter.BankApi;
import adapter.thirdparty.YesBankApi;

public class YesBankAdapter implements BankApi {

    private YesBankApi yesBankApi = new YesBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return yesBankApi.checkBalance(Integer.parseInt(accountNumber));
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {

        try {
            yesBankApi.transer(Integer.parseInt(fromAccount), Integer.parseInt(toAccount), (double) amount);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
