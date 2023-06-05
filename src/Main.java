public class Main {

    public static void printClient(Client client) {
        client.getName();
        client.getSurname();
        client.getPhone();
        client.getBalance();
    }

    public static void main(String[] args) {
        FizAccount fizAccount = new FizAccount.Builder("Sergey", "Ivanov", 1000).withPhone("89445677888").build();
        UrAccount urAccount = new UrAccount.Builder("Ivan", "Ivanov", 1000).withPhone("89990008989").build();
        IpAccount ipAccount = new IpAccount.Builder("Anton", "Antonov", 0).withPhone("89990009999").build();
        ipAccount.getBalance();
        ipAccount.moneyToAccount(1000);





    }
}