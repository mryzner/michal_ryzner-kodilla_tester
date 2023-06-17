Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When  I request $30
    Then  $30 should be dispensed

  Scenario: Unsuccessful withdrawal - insufficient funds in wallet
    Given I have deposited $200 in my wallet
    When  I request $300
    Then  Only $200 should be dispensed

  Scenario: Successful withdrawal of all available funds from wallet
    Given I have deposited $200 in my wallet
    When  I request $200
    Then  $200 should be dispensed

  Scenario: Unsuccessful withdrawal - incorrect value
    Given I have deposited $200 in my wallet
    When  I request $0
    Then  An alert should be displayed