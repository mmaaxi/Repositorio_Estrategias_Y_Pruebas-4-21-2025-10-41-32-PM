package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_004Page;
import static org.junit.Assert.assertTrue;

public class tc_004Steps {

    tc_004Page testPage = new tc_004Page();

    @Given("el usuario inicia la aplicación de pruebas")
    public void elUsuarioIniciaLaAplicacionDePruebas() {
        testPage.openApplication();
    }

    @When("el usuario ejecuta las pruebas automáticamente")
    public void elUsuarioEjecutaLasPruebasAutomaticamente() {
        testPage.executeTestsAutomatically();
    }

    @Then("las pruebas finalizan con éxito")
    public void lasPruebasFinalizanConExito() {
        assertTrue(testPage.areTestsSuccessful());
    }
}