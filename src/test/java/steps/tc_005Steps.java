package steps;

import pages.tc_005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_005Steps {
    tc_005Page uploadPage = new tc_005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        uploadPage.navigateToUploadPage();
    }

    @When("intenta cargar un archivo malicioso")
    public void intenta_cargar_un_archivo_malicioso() {
        uploadPage.uploadMaliciousFile("ruta/del/archivo/malicioso");
    }

    @Then("el sistema detecta el contenido no permitido y rechaza la carga")
    public void el_sistema_detecta_el_contenido_no_permitido_y_rechaza_la_carga() {
        assertTrue(uploadPage.isUploadRejected());
    }

    @When("revisa los logs de seguridad")
    public void revisa_los_logs_de_seguridad() {
        uploadPage.checkSecurityLogs();
    }

    @Then("se registra la incidencia y se notifica al administrador del sistema")
    public void se_registra_la_incidencia_y_se_notifica_al_administrador_del_sistema() {
        assertTrue(uploadPage.isSecurityIncidentLogged());
        assertTrue(uploadPage.isAdminNotified());
    }
}