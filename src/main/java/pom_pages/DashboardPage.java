package pom_pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.OrangeHRMBase;
import util1.util;

public class DashboardPage extends OrangeHRMBase {

	 @FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	 WebElement username;
	 @FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	 WebElement password;
	 @FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	 WebElement loginbtn;
	 @FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	 public WebElement admin;
	 @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	 public WebElement add;
	 @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	 public WebElement userRole;
	 @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	 public WebElement VerifyApply;
	 @FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div")
	 public WebElement LeaveApproveDate;
	 public WebElement userRole() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
	 }public WebElement status() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
	 }public WebElement EmployeeName() {
		 return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
	 }public WebElement userName () {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
	 }public WebElement Password() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
	 }public WebElement ConfirmPassword() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
	 }public WebElement save() {
           return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
	 }public WebElement leave() {
	        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
	 }public WebElement Apply() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a"));
	 }public WebElement LeaveType() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div"));
	 }public WebElement FromDate() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
	 }public WebElement ToDate() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/input"));
	 }public WebElement Comments() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/textarea"));
	 }public WebElement ApplyLeave() {
	        return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button"));
	 }public WebElement MyLeave() {
            return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
	 }
		
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

	public DashboardPage() {
	     PageFactory.initElements(driver, this);
	    }

	    public void login(String un, String pwd) {
	        username.sendKeys(un);
	        util.waits(500);
	        password.sendKeys(pwd);
	        util.waits(500);
            loginbtn.click();
	    }
	    public void adminAdd() {
	    	util.waits(5000);
            admin.click();
	        util.waits(5000);
	    	add.click();
	        util.waits(500);
	    }
	    public String select()throws AWTException, InterruptedException {
	        userRole().click(); 
	        util.waits(500);
		    Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_A);
	        robot.keyRelease(KeyEvent.VK_A);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        return userRole().getAttribute("value");
	    }
	    public String selectstatus()throws AWTException, InterruptedException {
	        status().click(); 
	        util.waits(500);
		    Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_E);
	        robot.keyRelease(KeyEvent.VK_E);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        return status().getAttribute("value");
	    }
	    public String enterEmployeeName(String Value) throws InterruptedException, AWTException {
	    	EmployeeName().clear();
	    	EmployeeName().sendKeys(Value);
			util.waits(6000);
		    Robot robot = new Robot();
			util.waits(6000);
		    robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);
			util.waits(6000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
			util.waits(6000);
	        return EmployeeName().getAttribute("value");
	    }
	    
	    public String enterUserName(String Value) {
	    	userName().clear();
	    	userName().sendKeys(Value);
	    	util.waits(1000);
	    	return userName().getAttribute("Value");	
	    }
	    public String enterPassword(String Value) {
	    	Password().clear();
	    	Password().sendKeys(Value);
	    	util.waits(1000);
	    	return Password().getAttribute("Value");
	    }
	    public String enterConfirmPassword(String Value) {
	    	ConfirmPassword().clear();
	    	ConfirmPassword().sendKeys(Value);
	    	util.waits(1000);
	    	return ConfirmPassword().getAttribute("Value");	
	    }
	    public void ClickSave() {
	    	util.waits(1000);
	    	save().click();	
	    }
	    public void UserLeave() {
            leave().click();
	        util.waits(500);
	    	Apply().click();
	        util.waits(500);
	    }
	    public void login1(String un, String pwd) {
	        username.sendKeys(un);
	        util.waits(500);
	        password.sendKeys(pwd);
	        util.waits(500);
	        loginbtn.click();
	    }
	    public void login2(String un, String pwd) {
	        username.sendKeys(un);
	        util.waits(500);
	        password.sendKeys(pwd);
	        util.waits(500);
	        loginbtn.click();
	    }
	    public String selectLeaveType()throws AWTException, InterruptedException {
	        LeaveType().click(); 
	        util.waits(500);
		    Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_C);
	        robot.keyRelease(KeyEvent.VK_C);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        return LeaveType().getAttribute("value");
	    }
	    public String fromDate(String Value) {
	    	FromDate().clear();
	    	FromDate().sendKeys(Value);
	    	util.waits(1000);
	        return FromDate().getAttribute("value");	
	    }
	    public String toDate(String Value) {
	    	ToDate().clear();
	    	ToDate().sendKeys(Value);
	    	util.waits(1000);
	        return ToDate().getAttribute("value");	
	    }
	    public String comments(String Value) {

	    	util.waits(7000);
	    	return Comments().getAttribute("value");	
	    }
	    public void ClickApply() {
	    	util.waits(9000);
	    	wait.until(ExpectedConditions.elementToBeClickable(ApplyLeave()));
	    	util.waits(30000);
            ApplyLeave().click();
	    }
	    public void verifyUserLeave() {
	    	util.waits(1000);
	    	MyLeave().click();
	    }
}
	 
	 
	
	
