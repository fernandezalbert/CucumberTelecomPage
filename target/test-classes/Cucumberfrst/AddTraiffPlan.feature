@tag
Feature: To test AddTraiff Plan
  
  @tag2
  Scenario Outline: To verify the success message
    Given the user is in add traiff plan page
    When the user fill in valid plan details"<MonthlyRent>","<FreeLoc>","<FreeInt>","<FreeSms>","<LocCharges>","<IntCharges>","<SmsCharges>"
    When the user clicks submit button
    Then the user should see the success message

    Examples: 
      |MonthlyRent|FreeLoc|FreeInt|FreeSms|LocCharges|IntCharges|SmsCharges|
      |      6000 |    100|    70 |    101|       200|       500|        95|
      
