package homework_24.Task_2;

public class ElectronicWallet implements PaymentSystem{
    double money;

    public ElectronicWallet(double money) {
        this.money = money;
    }

    public ElectronicWallet( BankAccount bankAccount) {}

    @Override
    public void withdrawMoney(double amount) {
        this.money= (money + amount);
    }

    @Override
    public void depositTransfer(double amount) {
        this.money= (money - amount);
    }

    @Override
    public void checkBalance() {
        System.out.printf("\nостаток на счете ElectronicWallet: %f euro", money);
    }

}
