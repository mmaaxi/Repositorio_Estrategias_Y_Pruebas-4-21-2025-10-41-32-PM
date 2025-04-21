package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    private WebDriver driver;

    private By expectedElement = By.id("some-expected-element-id"); // Replace with an actual locator

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.findElement(expectedElement).isDisplayed();
    }
}