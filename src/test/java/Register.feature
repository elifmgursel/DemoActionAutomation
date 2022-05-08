Feature: Register Test
  Scenario Outline: Create an Account
    Given navigate demo website
    And Click on Sign In button
    And Type email"<Email>"
    And Click on Create an Account button
    And Choose title
    And Type Firstname "<firstname>"
    And Type Lastname "<lastname>"
    And Type Password "<password>"
    Then Click on Register Button

    Examples:
      | Email | firstname | lastname | password | company | address |
      | deneme@deneme.com | deneme   | test     | abc123  | tech    | Berlin  |
      | person@person.com | surname  | try      | abcd123 | dell    | Munich  |
      | test21@test.com   | firstname| lastname | asd123  | amazon  | Neuss   |

