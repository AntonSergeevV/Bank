public abstract class AbstractClient implements Client {

    void Client(double balance) {

    }

    @Override
    public double moneyToAccount(double money) {

        return money;
    }

    @Override
    public double moneyFromAccount(double amount) {
        return amount;
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
