package pom_pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase {

	private final static By user_name = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
    private final static By password_id = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    private final static By login_button = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    private final static By error_alert = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
    private final static By required_field = By.tagName("span");
    private final static By login_header = By.tagName("h6");
    private final static By logout_link = By.tagName("span");

    public static void open() throws InterruptedException{

    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(2000); //wait for 2 seconds or 2000 milliseconds//
    }

    public static void enterUsername(String username){
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(user_name).sendKeys(getUsername("Admin"));
    }
    public static void enterPassword(){
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(password_id).sendKeys("admin123");
    }
    public static void clickLogin(){
        driver.findElement(login_button).click();
    }
    public static void clickLogout(){
    	 driver.findElement(By.tagName("span")).click();
         driver.findElement(logout_link).click();
    }
    
    
    	public static String validateErrorMessage(String type){
            String error = null;
            switch (type){
                case "valid":
                    error = driver.findElement(login_header).getText();
                    break;
                case "invalid":
                    error = driver.findElement(required_field).getText();
                    break;
            }
            return error;
        }
    	 

    }
