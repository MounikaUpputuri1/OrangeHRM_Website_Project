package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMBase {
    public static WebDriver driver;
    private static Properties prop = new Properties();

    public static void initialization() {
        try (FileInputStream input = new FileInputStream("src/main/java/config_properties/config.properties")) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browser = prop.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = prop.getProperty("url");
        driver.get(url);
    }

    public void captureScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String currentDir = System.getProperty("user.dir");
                FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
                System.out.println("Screenshot captured and saved successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String getUsername(String string) {
        return prop.getProperty("username");
    }

    public static String getUsername() {
        return prop.getProperty("username");
    }

    public static String getPassword() {
        return prop.getProperty("password");
    }
    public static String getUsername1() {
        return prop.getProperty("username1");
    }

    public static String getPassword1() {
        return prop.getProperty("password1");
    }
    public static String getUsername2() {
        return prop.getProperty("username2");
    }

    public static String getPassword2() {
        return prop.getProperty("password2");
    }
    public void tear() {
        if (driver != null) {
            driver.quit();
        }
    }
}
