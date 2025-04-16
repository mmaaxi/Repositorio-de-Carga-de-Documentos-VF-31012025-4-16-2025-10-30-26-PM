package steps;

import io.cucumber.java.en.*;
import pages.tc_002Page;
import org.junit.Assert;

public class tc_002Steps {
    tc_002Page page = new tc_002Page();

    @Given("que estoy en la página de carga de documentos")
    public void que_estoy_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("selecciono el botón 'Cargar documento'")
    public void selecciono_el_botón_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("se despliega el formulario de carga")
    public void se_despliega_el_formulario_de_carga() {
        Assert.assertTrue(page.isUploadFormDisplayed());
    }

    @When("selecciono un archivo JPG incorrecto")
    public void selecciono_un_archivo_JPG_incorrecto() {
        page.selectInvalidFile("documento_incorrecto.jpg");
    }

    @Then("el sistema muestra un error indicando formato no permitido")
    public void el_sistema_muestra_un_error_indicando_formato_no_permitido() {
        Assert.assertTrue(page.isFormatNotAllowedErrorDisplayed());
    }

    @When("intento subir el archivo")
    public void intento_subir_el_archivo() {
        page.submitUploadForm();
    }

    @Then("el archivo no se sube y se mantiene en el formulario un mensaje de error")
    public void el_archivo_no_se_sube_y_se_mantiene_en_el_formulario_un_mensaje_de_error() {
        Assert.assertFalse(page.isFileUploaded());
        Assert.assertTrue(page.isUploadErrorMessageDisplayed());
    }
}