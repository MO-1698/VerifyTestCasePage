import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.TestCasesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasesTests {

    private SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){ driver = new SHAFT.GUI.WebDriver();}

    @Test(description = "Validate user is on test cases page")
    private void validateTestCases(){
        new TestCasesPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnTestCasesButton().ValidateTestCases();
    }
}
