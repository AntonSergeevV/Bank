public class FizAccount implements Client {
    private double balance;

    private final String name;
    private final String surname;
    private final String phone;


    @Override
    public double moneyToAccount(double money) {
        this.balance = money + balance;
        System.out.println(balance);
        return balance;
    }

    @Override
    public double moneyFromAccount(double amount) {
        if (balance < amount) {
            System.out.println("Not enough money");
        } else if (balance>=amount) {
            balance = balance - amount;
            System.out.println(balance);
        }

        return balance;
    }

    @Override
    public double getBalance() {

        System.out.println(balance);
        return balance;
    }


    @Override
    public String getName() {

        System.out.println(name);
        return name;
    }

    @Override
    public String getSurname() {

        System.out.println(surname);
        return surname;
    }

    @Override
    public String getPhone() {

        System.out.println(phone);
        return phone;
    }

    private FizAccount(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.balance = builder.balance;
        this.phone = builder.phone;

    }

    public static class Builder {
        private final String name;
        private final String surname;
        private final double balance;
        private String phone;

        public Builder(String name, String surname, double balance) {
            this.balance = balance;
            this.name = name;
            this.surname = surname;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;

        }

        public FizAccount build() {
            return new FizAccount(this);
        }

    }


}
