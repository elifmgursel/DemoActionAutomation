Feature: Login Test
  Scenario: Go to the website and Login
    Given navigate test website
    And click on first sign in button
    And type email
    And type password
    And click on sign in button
    Then verify username
