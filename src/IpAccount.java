public class IpAccount implements Client {
    private double balance;
    private final String name;
    private final String surname;
    private final String phone;
    private static final double x = 0.02;
    private static final double y = 0.015;


    @Override
    public double moneyToAccount(double money) {
        if (money < 10000) {
            balance = (money - (money * x)) + balance;
            System.out.println(balance);
        } else if (money >= 10000) {
            balance = (money - (money * y)) + balance;
            System.out.println(balance);

        }
        return balance;
    }

    @Override
    public double moneyFromAccount(double amount) {
        if (balance < amount) {
            System.out.println("Not enough money");
        } else if (balance >= amount) {
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

    public IpAccount(Builder builder) {
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

        public IpAccount build() {
            return new IpAccount(this);
        }

    }
}
