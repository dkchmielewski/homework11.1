public class CashMachine {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        BankAccount bankAccount1 = null;
        BankAccount bankAccount2 = null;
        try {
            bankAccount1 = new BankAccount(person, 90.0);
            System.out.println(bankAccount1.toString());
            bankAccount2 = new BankAccount(null, 20.0);
            System.out.println(bankAccount2.toString());
        }
        catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Koniec tworzenia konta");
        }
        bankAccount1.addDeposit(200);
        System.out.println(bankAccount1.toString());
        try {
            bankAccount1.withdrawMoney(300);
            System.out.println(bankAccount1.toString());
            bankAccount2.withdrawMoney(2);
            System.out.println(bankAccount2.toString());
        }
        catch (IllegalArgumentException | NullPointerException e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Transakcja zakonczona");
        }
    }
}
