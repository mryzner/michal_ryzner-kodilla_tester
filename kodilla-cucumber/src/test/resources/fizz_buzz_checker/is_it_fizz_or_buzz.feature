Feature:  Is it Fizz or Buzz? Or maybe FizzBuzz or None?

  Scenario Outline: Number is Fizz (when divisible by 3), Buzz (when divisible by 5), FizzBuzz (when divisible by 3 and 5) or None (other cases)

    Given I get <number> to check
    When  I check whether the <number> is divisible by 3 or 5
    Then  I should get the <answer>
    Examples:
      |number|answer    |
      |0     | FizzBuzz |
      |1     | None     |
      |3     | Fizz     |
      |5     | Buzz     |
      |9     | Fizz     |
      |15    | FizzBuzz |
      |22    | None     |
