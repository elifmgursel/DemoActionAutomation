Feature: Contact Us Page Test
  Scenario: Go to website and test contact us page
    Given navigate to website
    And click on contact us button
    And select subject heading
    And type email address
    And type order reference
    And type a message
    When click on send button
    Then verify success message