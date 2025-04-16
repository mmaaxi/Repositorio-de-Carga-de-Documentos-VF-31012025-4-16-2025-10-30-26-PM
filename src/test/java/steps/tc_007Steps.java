package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    
    tc_007Page page = new tc_007Page();

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEnLaPaginaDeCargaDeDocumentos() {
        page.navegarALaPaginaDeCarga();
    }

    @When("el usuario carga un documento PDF")
    public void usuarioCargaDocumentoPDF() {
        page.cargarDocumentoPDF();
    }

    @Then("el sistema debe asignar un estado inicial de 'En Proceso'")
    public void verificarEstadoInicialEnProceso() {
        String estadoInicial = page.obtenerEstadoDeDocumento();
        Assert.assertEquals("En Proceso", estadoInicial);
    }

    @And("el usuario verifica el estado del documento en el panel de seguimiento")
    public void verificarEstadoEnPanelDeSeguimiento() {
        page.actualizarEstadoDelDocumento();
    }

    @Then("el estado del documento debería cambiar a 'Cargado' tras completarse el proceso")
    public void verificarEstadoCargado() {
        String estadoFinal = page.obtenerEstadoDeDocumento();
        Assert.assertEquals("Cargado", estadoFinal);
    }
}