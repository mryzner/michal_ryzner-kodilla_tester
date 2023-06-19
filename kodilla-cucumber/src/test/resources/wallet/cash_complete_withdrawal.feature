Feature: Cash Complete Withdrawal
  Scenario: Successful withdrawal of all available funds from wallet
    Given I have deposited $300 in my wallet
    When  I request $300
    Then  $300 should be dispensed
    And   the balance of my wallet should be $0
