package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("la aplicación está cargando un documento")
    public void la_aplicacion_esta_cargando_un_documento() {
        page.openApplication();
        page.startLoadingDocument();
    }

    @When("se simula una falla en la red")
    public void se_simula_una_falla_en_la_red() {
        page.simulateNetworkFailure();
    }

    @Then("el sistema muestra un mensaje de error y opción para reintentar")
    public void el_sistema_muestra_un_mensaje_de_error_y_opcion_para_reintentar() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
        Assert.assertTrue(page.isRetryOptionDisplayed());
    }

    @When("hago clic en 'Reintentar carga'")
    public void hago_clic_en_reintentar_carga() {
        page.clickRetry();
    }

    @Then("el sistema reintenta la carga del documento exitosamente si la red se recupera")
    public void el_sistema_reintenta_la_carga_del_documento_exitosamente() {
        Assert.assertTrue(page.isDocumentLoadedSuccessfully());
    }
}