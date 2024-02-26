Feature:  Automation of OrangeHRM Page1

@tag1 
  Scenario: Verify Admin and Add button Selection
   Given User is on login page1
   When user enters valid username and password1
   Then User is navigated to homepage1
   When user selects Admin field and Add button
   Then verify the user is in Add User page
   
@tag2   
 Scenario: Creating a Admin User
   Given User is on login page1
   When user enters valid username and password1
   Then User is navigated to homepage1
   When user selects Admin field and Add button
   Then Admin create a UserAdmin
   And verify the Apply
   
@tag3
   Scenario: Verify Newly Created User Admin Permissions
   Given User is on login page1
   When New Admin Login
   Then User is navigated to homepage1
   When user selects Admin and Add button
   Then verify the Permissions
   
@tag4   
  Scenario: User applies for leave
   Given User is on login page1
   When User enters valid username and password1
   Then User is navigated to homepage1
   When User navigates to the Leave page
   And User applies for leave
   Then Leave application is submitted successfully
  