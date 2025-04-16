package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page documentUploadPage;

    @Given("el usuario está en la interfaz principal")
    public void usuarioEnInterfazPrincipal() {
        // Código para inicializar el WebDriver y navegar a la interfaz principal
        documentUploadPage = new tc_010Page(driver);
    }

    @When("el usuario accede al módulo de carga de documentos")
    public void accederModuloDeCarga() {
        documentUploadPage.navigateToDocumentUploadModule();
    }

    @Then("la interfaz se carga sin retraso y se visualizan claramente opciones y botones")
    public void verificarInterfazSinRetraso() {
        documentUploadPage.verifyInterfaceLoadsSuccessfully();
    }

    @When("el usuario intercambia el idioma de la interfaz")
    public void intercambiarIdiomaInterfaz() {
        documentUploadPage.changeInterfaceLanguage();
    }

    @Then("el sistema adapta correctamente la visualización en el idioma seleccionado")
    public void verificarCambioDeIdioma() {
        documentUploadPage.verifyLanguageChange();
    }

    @When("el usuario finaliza la carga del documento")
    public void finalizarCargaDocumento() {
        documentUploadPage.uploadDocument();
    }

    @Then("la navegación es intuitiva y se recibe feedback visual consistente")
    public void verificarNavegacionIntuitiva() {
        documentUploadPage.verifyIntuitiveNavigation();
    }
}