package fizzbuzzchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fizzbuzzchecker.FizzBuzzChecker.numberChecker;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {
    private int number;
    private String answer;
    @Given("number to check 0")
    public void number_to_check_0() {
        this.number = 0;
    }
    @Given("number to check 1")
    public void number_to_check_1() {
        this.number = 1;
    }
    @Given("number to check 3")
    public void number_to_check_3() {
        this.number = 3;
    }
    @Given("number to check 5")
    public void number_to_check_5() {
        this.number = 5;
    }
    @Given("number to check 9")
    public void number_to_check_9() {
        this.number = 9;
    }
    @Given("number to check 15")
    public void number_to_check_15() {
        this.number = 15;
    }
    @Given("number to check 22")
    public void number_to_check_22() {
        this.number = 22;
    }
    @When("I check its divisibility")
    public void i_check_its_divisibility() {
        this.answer = numberChecker(this.number);
    }
    @Then("I should get the {string}")
    public void i_should_get_the(String string) {
        assertEquals(string, this.answer);
    }

}
