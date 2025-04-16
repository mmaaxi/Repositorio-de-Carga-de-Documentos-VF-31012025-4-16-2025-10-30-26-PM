package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("que el usuario selecciona varios documentos PDF válidos")
    public void seleccionarDocumentosPDF() {
        assertTrue(page.seleccionarDocumentosPDF());
    }

    @When("el usuario ejecuta el proceso de carga por lotes")
    public void ejecutarCargaPorLotes() {
        page.ejecutarCargaPorLotes();
    }

    @Then("el sistema permite la selección múltiple sin errores")
    public void verificarSeleccionMultiple() {
        assertTrue(page.verificarSeleccionMultiple());
    }

    @Then("se muestran mensajes de confirmación individualmente para cada archivo")
    public void verificarMensajesDeConfirmacion() {
        assertTrue(page.verificarMensajesDeConfirmacion());
    }
}