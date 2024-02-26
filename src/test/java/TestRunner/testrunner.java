
package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/resources/Features/Login1.feature","src/test/resources/Features/Forgotpassword.feature","src/test/resources/Features/data3.feature","src/test/resources/Features/data5.feature"},glue= {"TestCase"},plugin= {"pretty","html:target/htmlreport.html"})

 public class testrunner   extends AbstractTestNGCucumberTests {
		


	}