public class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        BankAccount bankAccount1 = null;
        BankAccount bankAccount2 = null;
        try {
            bankAccount1 = new BankAccount(person, 90.0);
            System.out.println(bankAccount1.toString());
            //bankAccount2 = new BankAccount(null, 20.0);
            bankAccount1.withdrawMoney(300);
            bankAccount1.addDeposit(200);
            System.out.println(bankAccount1.toString());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec tworzenia konta");
        }
    }
}
