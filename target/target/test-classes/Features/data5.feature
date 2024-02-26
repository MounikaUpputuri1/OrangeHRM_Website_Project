
Feature:  Automation of OrangeHRM Page

@tag1 
  Scenario: Verify Vacanacy and Add button Selection
   Given User is on login page
   When user enters valid username and password
   Then User is navigated to homepage
   When user selects Recruitment field,  Vacansies field and add button
    Then verify the user is in Add  vacancy  page

    @tag2
     Scenario: Create a vacancy in the company
     Given User is on login page
   When user enters valid username and password
   Then User is navigated to homepage
   When user selects Recruitment field,  Vacansies field and add button
    Then add the vacancy details
    And verify the details
     
     @tag3
      Scenario: punch in and out functionality
     Given User is on login page
   When user enters valid username and password
   Then User is navigated to homepage
   When  user selects time field ,attendence dropdown and punch in and out
   Then verify the user is in punch in  page 
    When  user add the punch in  details
   Then verify the user is in punch out  page
      When  user add the punch out  details
     Then verify the frame recorded