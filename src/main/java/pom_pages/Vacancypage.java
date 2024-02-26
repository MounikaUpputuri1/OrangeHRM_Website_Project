package pom_pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.OrangeHRMBase;
import util1.util;

public class Vacancypage extends OrangeHRMBase {
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	 WebElement username;
	 @FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	 WebElement password;
	 @FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	 WebElement loginbtn;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
	public WebElement recruitment;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
	public WebElement vacansies;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	public WebElement add;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/h6")
	public WebElement addvacancy;
	
	public WebElement vacancyname() {
       return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input"));
}
	public WebElement jobtitle() {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[2]/i"));
	}
	public WebElement hm() {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input"));
	}
	public WebElement nop() {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input"));
	}
	
	public WebElement save() {
		return driver.findElement(By.xpath(" /html/body/div/div[1]/div[2]/div[2]/div/div/form/div[7]/button[2]"));
	}
	
	@FindBy(xpath=" /html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")
	public WebElement time;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span/i")
	public WebElement attendence;

		@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")
	public WebElement punchinout ;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/h6")
	public WebElement punchin;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
	public WebElement in;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/h6")
	public WebElement punchout;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button")
	public WebElement out;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")
public WebElement myrecords;
	
	
	
	//public WebElement myrecords() {
	//	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a"));
	//}
	
	
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/div[1]/div")
	public WebElement frame;
	
	
	
	public Vacancypage() {
       PageFactory.initElements(driver, this);
   }
	public void login(String un, String pwd) {
		
		 username.sendKeys(un);
	        util.waits(500);
	        password.sendKeys(pwd);
	        util.waits(500);
        loginbtn.click();
		}
	public void recruitment() {
		recruitment.click();
		util.waits(500);
		vacansies.click();
		util.waits(500);
		 add.click();
		 util.waits(500);
	}
    public String entervacancyname(String Value) {
		vacancyname().click();
		vacancyname().sendKeys(Value);
		util.waits(1000);
   	return vacancyname().getAttribute("Value");
	}
	public String selectjobtitle() throws AWTException, InterruptedException {
		jobtitle().click();
		 Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);
	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        return jobtitle().getAttribute("value");
		
	}
	
	public String selecthm() throws AWTException, InterruptedException {
		hm().click();
		 Robot robot = new Robot();
		 
		 Actions actions = new Actions(driver);
		 actions.keyDown(Keys.SHIFT).sendKeys("O").keyUp(Keys.SHIFT).perform();

		 util.waits(2000);
		 
		// robot.keyPress(KeyEvent.VK_O);
	       // robot.keyRelease(KeyEvent.VK_O);
	        
	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);
	      
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        return jobtitle().getAttribute("value");
		
	}
	 public String enternop(String Value) {
			nop().click();
			nop().sendKeys(Value);
	        util.waits(1000);
	    	return vacancyname().getAttribute("Value");
		}
    
	  public void clicksave() {
	    	util.waits(1000);
	    	save().click();
    }
	  public void time() {
			time.click();
			util.waits(500);
			attendence.click();
			util.waits(500);
			 punchinout.click();
			
		}
	  
	  public void in() {
		  util.waits(2000);
		  in.click();
		  util.waits(2000);
		  
	  }
	  
	  public void out() {
		  util.waits(2000);
		  out.click();
		  util.waits(500);
		  
	  }
	  
	  public void myrecords() {
		  util.waits(500);
		  myrecords.click();
		  util.waits(500);
	  }
	  
	  
	  public void frame() {
		  util.waits(500);
		  frame.click();
		  util.waits(500);
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }



