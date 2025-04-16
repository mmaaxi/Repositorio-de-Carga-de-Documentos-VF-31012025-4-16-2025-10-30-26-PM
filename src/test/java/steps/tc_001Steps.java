package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_001Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001Steps {
    WebDriver driver = new ChromeDriver();
    tc_001Page page = new tc_001Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        driver.get("http://example.com/upload");
    }

    @When("El usuario selecciona el botón de 'Cargar documento'")
    public void elUsuarioSeleccionaElBotonDeCargarDocumento() {
        page.clickUploadButton();
    }

    @Then("El sistema muestra el formulario para seleccionar un archivo")
    public void elSistemaMuestraElFormularioParaSeleccionarUnArchivo() {
        Assert.assertTrue(page.isFileInputDisplayed());
    }

    @When("El usuario selecciona un archivo PDF válido desde el sistema de archivos")
    public void elUsuarioSeleccionaUnArchivoPdfValidoDesdeElSistemaDeArchivos() {
        page.selectFile("path/to/validfile.pdf");
    }

    @Then("El campo de archivo acepta el documento y muestra el nombre del archivo")
    public void elCampoDeArchivoAceptaElDocumentoYMuestraElNombreDelArchivo() {
        Assert.assertEquals("validfile.pdf", page.getUploadedFileName());
    }

    @When("El usuario hace clic en 'Subir documento'")
    public void elUsuarioHaceClicEnSubirDocumento() {
        page.clickSubmitButton();
    }

    @Then("El sistema sube el archivo y muestra un mensaje de confirmación de carga exitosa")
    public void elSistemaSubeElArchivoYMuestraUnMensajeDeConfirmacionDeCargaExitosa() {
        Assert.assertTrue(page.isUploadSuccessMessageDisplayed());
        driver.quit();
    }
}