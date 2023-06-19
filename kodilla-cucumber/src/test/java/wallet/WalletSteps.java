package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I request $30")
    public void i_request_$30() {
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }
    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        assertEquals(170, wallet.getBalance(), "Incorrect wallet balance");
    }

    //cash complete withdrawal

    @Given("I have deposited $300 in my wallet")
    public void i_have_deposited_$300_in_my_wallet() {
        wallet.deposit(300);
        assertEquals(300, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I request $300")
    public void i_request_$300() {
        cashier.withdraw(wallet, 300);
    }
    @Then("$300 should be dispensed")
    public void $300_should_be_dispensed() {
        assertEquals(300, cashSlot.getContents());
    }
    @Then("the balance of my wallet should be $0")
    public void the_balance_of_my_wallet_should_be_$0() {
        assertEquals(0, wallet.getBalance(), "Incorrect wallet balance");
    }

    //prevent users from taking out more money than their wallet contains

    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I withdraw $200")
    public void i_withdraw_$200() {
        cashier.withdraw(wallet, 200);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        String expectedMessage = "You don't have enough money in your wallet";
        assertEquals(expectedMessage, cashier.withdraw(wallet, 200));
    }

    //display balance

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        String expectedMessage = "The balance of your wallet: 100";
        assertEquals(expectedMessage, cashSlot.displayBalance(wallet));
    }


}
