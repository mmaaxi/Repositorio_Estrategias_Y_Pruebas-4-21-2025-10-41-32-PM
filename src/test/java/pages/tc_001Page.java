package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001Page {

    WebDriver driver = new ChromeDriver();

    By loginField = By.id("login_field");
    By passwordField = By.id("password");
    By signInButton = By.name("commit");
    By newRepoButton = By.xpath("//a[contains(text(), 'New')]");
    By repoNameField = By.id("repository_name");
    By createRepoButton = By.cssSelector("button.btn-primary");
    By repoUrlElement = By.xpath("//a[contains(@href, '/TestRepo')]");

    public void loginToGitHub(String username, String password) {
        driver.get("https://github.com/login");
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signInButton).click();
    }

    public void createNewRepository(String repoName) {
        driver.findElement(newRepoButton).click();
        driver.findElement(repoNameField).sendKeys(repoName);
        driver.findElement(createRepoButton).click();
    }

    public String getRepoUrl() {
        WebElement repoUrl = driver.findElement(repoUrlElement);
        return repoUrl.getAttribute("href");
    }

}