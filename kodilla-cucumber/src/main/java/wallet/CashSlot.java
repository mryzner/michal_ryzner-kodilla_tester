package wallet;

public class CashSlot {
    private int contents;
    private Wallet wallet;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }
    public String displayBalance(Wallet wallet) {
        return "The balance of your wallet: " + wallet.getBalance();
    }
}
