package homework_24.Task_2;

public class App {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(200);

        bankAccount.checkBalance();
        bankAccount.withdrawMoney(250.55);
        bankAccount.checkBalance();

        ElectronicWallet electronicWallet = new ElectronicWallet(500);

        electronicWallet.withdrawMoney(375.32);
        electronicWallet.checkBalance();
        electronicWallet.depositTransfer(20);
        electronicWallet.checkBalance();
    }
}
