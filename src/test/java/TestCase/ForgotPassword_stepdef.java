package TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.OrangeHRMBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.ForgotPasswordPage;

public class ForgotPassword_stepdef extends OrangeHRMBase {
	@Given("I am on the Orange HRM login pages")
	public void i_am_on_the_orange_hrm_login_pages() {
		initialization(); 
	}

	@Given("Click on the forgot password")
	public void click_on_the_forgot_password() {
		ForgotPasswordPage.clickForgotPassword();
	    
	}

	@Given("Enter the username {string}")
	public void enter_the_username(String string) {
        driver.findElement(By.name("username")).sendKeys("Admin");

	    
	}

	@When("I click on the ResetPassword button")
	public void i_click_on_the_reset_password_button() {
		ForgotPasswordPage.clickResetPasswordButton();

	    
	}

	@Then("If it is {string} then shows message {string}")
	public void if_it_is_then_shows_message(String valid, String message) {
		String error = ForgotPasswordPage.getMessageHeaderText(valid);
        Assert.assertEquals(message,error);
	}

	@Given("Enter the invalidusername {string}")
	public void enter_the_invalidusername(String string) {
        driver.findElement(By.name("username")).sendKeys("Abcd");

	   
	}


}
