Feature: display balance
  Scenario: User checks the balance of his wallet
    Given there is $100 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $100