@RegressionTest
Feature: Register Test
  Background:
    Given navigate demo website
    And click on first sign in button
    And Type email"trial@trial.com"
    And Click on Create an Account button

    Scenario: Person 1
      And Type Firstname "deneme"
      And Type Lastname "test"

    Scenario: Person 2
      And Type Firstname "surname"
      And Type Lastname "try"

    Scenario: Person 3
      And Type Firstname "firstname"
      And Type Lastname "lastname"


