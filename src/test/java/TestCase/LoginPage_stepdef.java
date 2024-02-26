package TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.OrangeHRMBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.LoginPage;

public class LoginPage_stepdef extends OrangeHRMBase {
	

	
	@Given("I am open login page orangeHRM")
	public void i_am_open_login_page_orange_hrm() throws InterruptedException {
		initialization();
	}

	@When("Should display the following fields and button links in the window")
	public void should_display_the_following_fields_and_button_links_in_the_window() {
	
	}

	@Then("Verify username field is visible")
	public void verify_username_field_is_visible() {
		Boolean Display = driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
		System.out.println("Element displayed is :"+Display);

	}

	@Then("Verify password field is visible")
	public void verify_password_field_is_visible() {
		Boolean Display = driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		System.out.println("Element displayed is :"+Display);
	}

	@Then("Verify login button is enable")
	public void verify_login_button_is_enable() {
		Boolean Display = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println("Element displayed is :"+Display);	

	}

	@Then("Verify Forgot your password? link is visible")
	public void verify_forgot_your_password_link_is_visible() {
		Boolean t = driver.findElement(By.xpath(("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"))).isDisplayed();
		System.out.println("Element displayed is :"+t);
		driver.close();

	}

	@When("I am enter valid username {string}")
	public void i_am_enter_valid_username(String string) {
        driver.findElement(By.name("username")).sendKeys("Admin");

	}

	@When("I am enter valid password {string}")
	public void i_am_enter_valid_password(String string) {
        driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@When("I am click button Login")
	public void i_am_click_button_login() {
		LoginPage.clickLogin();
	}

	@Then("I am redirected to dashboard")
	public void i_am_redirected_to_dashboard() {
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	@When("I am enter invalid username {string}")
	public void i_am_enter_invalid_username(String string) {
        driver.findElement(By.name("username")).sendKeys("Abcd");

	}

	@Then("I am accept error message {string}")
	public void i_am_accept_error_message(String message) {
        LoginPage.validateErrorMessage(message);
	}

	@When("I am enter invalid password {string}")
	public void i_am_enter_invalid_password(String string) {
        driver.findElement(By.name("password")).sendKeys("abcd123");

	}
	@When("I am click button logout")
	public void i_an_click_button_logout() {
		LoginPage.clickLogout();
	    
	}

	@Then("I am redirected to loginpage")
	public void i_am_redirected_to_loginpage() {
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	   
	}
	@After
	  public void captureScreenshotAndTearDown(Scenario scenario) {
		  captureScreenshotOnFailure(scenario);
	        tear();
	    }
	}
