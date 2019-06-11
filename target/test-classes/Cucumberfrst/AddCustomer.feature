#Author: your.email@your.domain.com
@regression
@tag
Feature: To test add cucstomer functionality

  @us1 @sprint1
  Scenario: To test customer id generation
    Given the user is in add customer page
    When the user fill in valid customer details
      | Albert | Fernandez | albert@gmail.com | Chennai | 8508676566 |
    When the user click the submit button
    Then the user should see the customer id generated

  @us2 @sprint1
  Scenario: To test customer id generation
    Given the user is in add customer page
    When the user fill in valid customer details
      | Hello | Fernandez | albert@gmail.com | Chennai | 8508676566 |
    When the user click the submit button
    Then the user should see the customer id generated

  @us2 @sprint3
  Scenario: To test customer id generation
    Given the user is in add customer page
    When the user fill in valid customer details
      | Christopher | Fernandez | albert@gmail.com | Chennai | 8508676566 |
    When the user click the submit button
    Then the user should see the customer id generated

  @us3 @sprint1
  Scenario: To test customer id generation
    Given the user is in add customer page
    When the user fill in valid customer details
      | Fernandeo | Fernandez | albert@gmail.com | Chennai | 8508676566 |
    When the user click the submit button
    Then the user should see the customer id generated
