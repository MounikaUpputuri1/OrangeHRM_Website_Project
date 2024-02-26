package TestCase;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.OrangeHRMBase;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_pages.Vacancypage;

public class vacancy_stepdef extends OrangeHRMBase {
	  
 Vacancypage vacancy;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		initialization(); 
	   
	}

	@When("user enters valid username and password")
	 public void Login() {
   	 vacancy = new Vacancypage();
   	String username = OrangeHRMBase.getUsername(); 
       String password = OrangeHRMBase.getPassword(); 
       vacancy.login(username, password);
   }

	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	@When("user selects Recruitment field,  Vacansies field and add button")
	public void user_selects_recruitment_field_vacansies_field_and_add_button() {
	   vacancy.recruitment();
	}

	@Then("verify the user is in Add  vacancy  page")
	public void verify_the_user_is_in_add_vacancy_page() {
	    WebElement addvacancypage=vacancy.addvacancy;
	    Assert.assertTrue(addvacancypage.isDisplayed(), "add vacancy page is not displayed");
        System.out.println("User is in Add Vacancy Page");
	}
	@Then("add the vacancy details")
	public void add_the_vacancy_details()  throws AWTException, InterruptedException{
	  vacancy.entervacancyname("automation engineer3");
	vacancy.selectjobtitle()	;
	vacancy.selecthm()	;
	vacancy.enternop("3");
	vacancy.clicksave();
	}

	@Then("verify the details")
	public void selected_options() throws AWTException, InterruptedException {
    	String selectedvacancy = vacancy.entervacancyname("automation engineer3");
        Assert.assertEquals(selectedvacancy, "automation engineer3", "vacancy name exits already");

        String selectedjob = vacancy.selectjobtitle();
        Assert.assertEquals(selectedjob, "Automation Tester", "job not selected correctly");

      
        String selectedmanager = vacancy.selecthm();
        Assert.assertEquals(selectedmanager, "Odis  Adalwin", "manager name not entered correctly");

    
        String enterednop = vacancy.enternop("3");;
        Assert.assertEquals(enterednop, "3", "nop not entered correctly");
}
	

	@When("user selects time field ,attendence dropdown and punch in and out")
	public void user_selects_time_field_attendence_dropdown_and_punch_in_and_out() {
	   vacancy.time();
	}
	@Then("verify the user is in punch in  page")
	public void verify_the_user_is_in_punch_in_page() {
	    WebElement punchinpage=vacancy.punchin;
	    Assert.assertTrue(punchinpage.isDisplayed(), "punchin page is not displayed");
        System.out.println("User is in punchin Page");
	}
	@When("user add the punch in  details")
	public void user_add_the_punch_in_details() {
		vacancy.in();
	}
	
	
	@Then("verify the user is in punch out  page")
	public void verify_the_user_is_in_punch_out_page() {
		WebElement punchoutpage=vacancy.punchout;
	    Assert.assertTrue(punchoutpage.isDisplayed(), "punchout page is not displayed");
        System.out.println("User is in punchout Page");
		
	}
	@When("user add the punch out  details")
	public void user_add_the_punch_out_details() {
		vacancy.out();  
		
		vacancy.myrecords();
	}

	
	
	@Then("verify the frame recorded")
	public void verify_the_frame_recorded() {
		WebElement framepage=vacancy.frame;
	    Assert.assertTrue(framepage.isDisplayed(), "recorded frames  is not displayed");
        System.out.println("User is in myrecords Page");
		
	}
	@After
    public void captureScreenshotAndTearDown(Scenario scenario) {
		  captureScreenshotOnFailure(scenario);
	       tear();
    }




	
}
  


