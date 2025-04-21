package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("I am logged into GitHub")
    public void iAmLoggedIntoGitHub() {
        page.loginToGitHub("yourUsername", "yourPassword");
    }

    @When("I create a new repository with name {string}")
    public void iCreateANewRepositoryWithName(String repoName) {
        page.createNewRepository(repoName);
    }

    @Then("I should see the repository created successfully and retrieve the URL")
    public void iShouldSeeTheRepositoryCreatedSuccessfullyAndRetrieveTheURL() {
        String repoUrl = page.getRepoUrl();
        Assert.assertNotNull("Repository URL should not be null", repoUrl);
        System.out.println("Repository created at URL: " + repoUrl);
    }
}