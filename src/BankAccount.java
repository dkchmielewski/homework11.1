public class BankAccount {
    private Person person;
    private double account;

    public BankAccount(Person person, double account) {
        if (person == null) {
            throw new NullPointerException("Prosze podac osobe");
        }
        this.person = person;
        this.account = account;
    }

    public void addDeposit(double deposit) {
        if (person == null) {
            throw new NullPointerException("Prosze podac osobe");
        }
        else
            account += deposit;
    }

    public void withdrawMoney(double amount) {
        if (amount > account) {
            throw new IllegalArgumentException("Kwota przekracza stan konta");
        }
        if (person == null) {
            throw new NullPointerException("Prosze podac osobe");
        }
        else
            account -= amount;
    }

    @Override
    public String toString() {
        return "Konto bankowe: " + person +
                ", stan konta: " + account;
    }
}
