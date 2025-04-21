package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page jiraPage = new tc_002Page();

    @Given("que estoy en la página de configuración de integración")
    public void que_estoy_en_la_página_de_configuración_de_integración() {
        jiraPage.navigateToIntegrationPage();
    }

    @When("configuro la integración con Jira")
    public void configuro_la_integración_con_Jira() {
        jiraPage.configureJiraIntegration();
    }

    @Then("la integración debe ser correcta y los issues deben estar sincronizados")
    public void la_integración_debe_ser_correcta_y_los_issues_deben_estar_sincronizados() {
        Assert.assertTrue(jiraPage.isIntegrationSuccessful());
        Assert.assertTrue(jiraPage.areIssuesSynchronized());
    }
}