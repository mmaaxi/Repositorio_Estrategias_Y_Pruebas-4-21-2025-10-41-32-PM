package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;
    private By integrationPageLocator = By.id("integration-page");
    private By jiraConfigButton = By.id("jira-configure");
    private By successMessageLocator = By.id("success-message");
    private By issuesSyncLocator = By.id("issues-synced");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToIntegrationPage() {
        driver.findElement(integrationPageLocator).click();
    }

    public void configureJiraIntegration() {
        driver.findElement(jiraConfigButton).click();
    }

    public boolean isIntegrationSuccessful() {
        return driver.findElement(successMessageLocator).isDisplayed();
    }

    public boolean areIssuesSynchronized() {
        return driver.findElement(issuesSyncLocator).isDisplayed();
    }
}