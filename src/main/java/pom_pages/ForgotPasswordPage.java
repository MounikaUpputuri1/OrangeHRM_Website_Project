package pom_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
	static WebDriver driver;
	
	   private final static By user_name = By.name("username");
	   private final static By cancel_button = By.name("cancel");
	   private final static By forgot_password_link = By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']");
	   private final static By reset_password_button = By.xpath("//button[@type='submit']");
	   private final static By message_header = By.tagName("h6");
	   private final static By required_field = By.tagName("span");

	   public void forgotPassword(WebDriver driver) {
	        this.driver = driver;
	    }


	   public static void clickResetPasswordButton(){
	        driver.findElement(reset_password_button).click();
	    }

	   public static void clickForgotPassword(){
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(forgot_password_link).click();
	    }

	   public static String getMessageHeaderText(String valid) {
	        WebElement headerElement;
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        if (valid.equalsIgnoreCase("valid")){
	            headerElement = driver.findElement(message_header);

	        } else {
	            headerElement = driver.findElement(required_field);

	            }

	        return headerElement.getText();

	    }
	}


