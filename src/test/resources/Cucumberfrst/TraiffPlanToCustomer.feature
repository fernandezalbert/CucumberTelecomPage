@tag
Feature: to test add traiff plan to customer
  I want to use this template for my feature file

   @tag1
  Scenario: to verify that traiff plan assigned
    Given the user is in add traiff plan to customer page
    When the user enters the customer id and selects the approverd traiff plan
    |874667|
    When the user clicks add traiff plan to customer button
    Then the user should be assigned with the traiff plan

    
      
