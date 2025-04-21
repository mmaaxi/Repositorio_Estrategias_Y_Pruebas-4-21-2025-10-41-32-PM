package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_003Page;

public class tc_003Steps {

    private WebDriver driver;
    private tc_003Page googleSheetsPage;

    @Given("I open Google Sheets with the URL {string}")
    public void i_open_google_sheets_with_the_url(String url) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        googleSheetsPage = new tc_003Page(driver);
    }

    @Then("Google Sheets should load with the expected information")
    public void google_sheets_should_load_with_the_expected_information() {
        Assert.assertTrue("Google Sheets did not load as expected", googleSheetsPage.isPageLoaded());
        driver.quit();
    }
}