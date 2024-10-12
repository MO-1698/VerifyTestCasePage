package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TestCasesPage {
    private SHAFT.GUI.WebDriver driver;

    public TestCasesPage(SHAFT.GUI.WebDriver driver) {this.driver = driver;}


    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By TestCasesButton = By.xpath("//a[@href=\"/test_cases\"]//i[@class=\"fa fa-list\"]");
    private By TestCases = By.xpath("//h2[@class=\"title text-center\"]");


    public TestCasesPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public TestCasesPage clickOnTestCasesButton() {
        driver.element().click(TestCasesButton);
        return this;

    }

    @Step("Validate that the user is on Home Page")
    public TestCasesPage ValidateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that the user is on Test Cases Page")
    public TestCasesPage ValidateTestCases() {
        driver.element().verifyThat(TestCases).text().contains("TEST CASES");
        return this;
    }


















}