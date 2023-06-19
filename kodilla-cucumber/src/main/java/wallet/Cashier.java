package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (amount <= 0) {
            wallet.debit(0);
            cashSlot.dispense(0);
        } else if ((amount > 0) && (amount <= wallet.getBalance())) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } return "You don't have enough money in your wallet";
    }
}
