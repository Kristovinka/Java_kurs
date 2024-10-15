package homework_24.Task_2;

public class BankAccount implements PaymentSystem{
    double money;

    public BankAccount(double money) {
        this.money = money;
    }

    public BankAccount(ElectronicWallet electronicWallet) {}

    @Override
    public void withdrawMoney(double amount) {
        this.money= (money + amount);
    }

    @Override
    public void depositTransfer(double amount) {
        this.money = (money - amount);
    }

    @Override
    public void checkBalance() {
        System.out.printf("\nостаток на счете BankAccount: %f dol", money);
    }
}
