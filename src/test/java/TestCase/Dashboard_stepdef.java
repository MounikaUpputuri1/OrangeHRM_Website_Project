package TestCase;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import base.OrangeHRMBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pom_pages.DashboardPage;
import util1.util;

public class Dashboard_stepdef extends OrangeHRMBase {
  
    DashboardPage dashboard;

    @Given("User is on login page1")
    public void login_page() {
          initialization();  
    }

    @When("user enters valid username and password1")
    public void Login() {
    	 dashboard = new DashboardPage();
    	String username = OrangeHRMBase.getUsername(); 
        String password = OrangeHRMBase.getPassword(); 
        dashboard.login(username, password);
    }

    @Then("User is navigated to homepage1")
    public void user_is_navigated_to_homepage() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }
    @When("user selects Admin field and Add button")
    public void Admin_Add() {
        dashboard.adminAdd();
    }

    @Then("verify the user is in Add User page")
    public void Admin_Add_page() {
        WebElement verifyAddPage = dashboard.userRole;
        Assert.assertTrue(verifyAddPage.isDisplayed(), "add user page is not displayed");
        System.out.println("User is in User Management Page");
    }
    @Then("Admin create a UserAdmin")
    public void UserAdmin() throws AWTException, InterruptedException {
    	 dashboard.select();
         dashboard.selectstatus();
         dashboard.enterUserName("Martin1234");
         dashboard.enterPassword("BobTester12345");
         dashboard.enterConfirmPassword("BobTester12345");
         dashboard.enterEmployeeName("Martin j John");
			util.waits(6000);
        dashboard.ClickSave();
    }
    @And("verify the Apply")
    public void selected_options() {
    	 WebElement verifySubmission = dashboard.add;
         Assert.assertTrue(verifySubmission.isDisplayed(), "add user page is not displayed");
         System.out.println("Admin successfully created an admin user");
    }
    @When("New Admin Login")
    public void new_admin_login() {
        dashboard = new DashboardPage();
        String username1 = OrangeHRMBase.getUsername1(); 
        String password1 = OrangeHRMBase.getPassword1(); 
        dashboard.login1(username1, password1);
    }
    @When("user selects Admin and Add button")
    public void Admin_Add1() {
        dashboard.adminAdd();
    }
    @Then("verify the Permissions")
    public void adminPermissions() {
    	 dashboard.adminAdd();
    	WebElement verifyAddPage = dashboard.userRole;
        Assert.assertTrue(verifyAddPage.isDisplayed(), "add user page is not displayed");
        System.out.println("New Admin User is in User Management Page");
    }
    @When("User enters valid username and password1")
    public void new_user_login() {
        dashboard = new DashboardPage();
        String username2 = OrangeHRMBase.getUsername2(); 
        String password2 = OrangeHRMBase.getPassword2(); 
        dashboard.login2(username2, password2);
    }   
    @When ("User navigates to the Leave page")
    public void user_navigates_to_the_leave_page() {
        dashboard.UserLeave();
    }
    @And ("User applies for leave")
    public void user_applies_for_leave()throws AWTException, InterruptedException {
    	dashboard.selectLeaveType();
        dashboard.fromDate("2024-02-21");
       // dashboard.toDate("2024-02-20");
       // dashboard.comments("Loss of family member");
        dashboard.ClickApply();	
    }
    @Then ("Leave application is submitted successfully")
    public void Leave_application_is_submitted_successfully() {
    	dashboard.verifyUserLeave();
    	WebElement verifyLeaveApproveDate = dashboard.LeaveApproveDate;
        Assert.assertTrue(verifyLeaveApproveDate.isDisplayed(), "user was unable to view leave list");
        System.out.println("User was able to see the applied leave automatically");
    }
   @After
    public void captureScreenshotAndTearDown1(Scenario scenario) {
		  captureScreenshotOnFailure(scenario);
	       tear();
    }
}