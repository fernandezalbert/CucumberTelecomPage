@tag
Feature: To test the pay billing page
 
  @tag1
  Scenario: The user should view the bill to pay
    Given the user is in pay bill page
    When the user fills the valid customer id
    |874667|
    When the user clicks the submit buttion in bill pay page
    Then the user should view his bill
  

  