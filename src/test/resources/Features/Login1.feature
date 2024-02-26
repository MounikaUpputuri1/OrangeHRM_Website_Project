@Login
Feature: Login functionality
  as a user
  i want to login on orangeHRM so that i can see my account

  @tag1
  Scenario: Check for the fields/buttons displayed in Sign In Page
    Given I am open login page orangeHRM
    When Should display the following fields and button links in the window
    Then Verify username field is visible
    And Verify password field is visible
    And Verify login button is enable
    And Verify Forgot your password? link is visible

  @tag2
  Scenario: User enter valid username and password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am enter valid password "admin123"
    And I am click button Login
    Then I am redirected to dashboard

  @tag3
  Scenario: User enter invalid Username and valid Password
    Given I am open login page orangeHRM
    When I am enter invalid username "Abcd"
    And I am enter valid password "admin123"
    And I am click button Login
    Then I am accept error message "Invalid credentials"

  @tag4
  Scenario: User enter valid Username and invalid Password
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
    And I am enter invalid password "abcd123"
    And I am click button Login
    Then I am accept error message "Invalid credentials"

  @tag5
  Scenario Outline: User enter invalid Username and invalid Password
    Given I am open login page orangeHRM
    When I am enter invalid username "<username>"
    And I am enter invalid password "<password>"
    And I am click button Login
    Then I am accept error message "Invalid credentials"

  @tag6
  Scenario: User blank Username and Password field
    Given I am open login page orangeHRM
    When I am click button Login
    Then I am accept error message "Required"

  @tag7
  Scenario: User enter valid Username and blank Password field
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
      And I am click button Login
    Then I am accept error message "Required"

  @tag8
  Scenario: User blank Username field and enter valid Password
    Given I am open login page orangeHRM
    When I am enter valid password "admin123"
      And I am click button Login
    Then I am accept error message "Required"
    
@Logout

  @tag9
  Scenario: Logout functionality 
    Given I am open login page orangeHRM
    When I am enter valid username "Admin"
     And I am enter valid password "admin123"
     And I am click button Login
     And I am redirected to dashboard
     And I am click button logout
    Then I am redirected to loginpage





    