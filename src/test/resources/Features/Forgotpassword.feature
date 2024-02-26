@ForgotPassword
Feature: Check the password reset page is working

  @tag9
  Scenario: Check Reset password is working.
    Given I am on the Orange HRM login pages
    And  Click on the forgot password
    And  Enter the username "<username>"
    When I click on the ResetPassword button
    Then If it is "<valid>" then shows message "<message>"
  
  @tag10
  Scenario: Check Reset password is working.
    Given I am on the Orange HRM login pages
    And  Click on the forgot password
    And  Enter the invalidusername "<username>"
    When I click on the ResetPassword button
    Then If it is "<valid>" then shows message "<message>" 
    
    
    
    
    
    
    

    