package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("El usuario carga un documento PDF válido")
    public void el_usuario_carga_un_documento_pdf_valido() {
        page.uploadPDFDocument("path/to/valid/document.pdf");
    }

    @When("El sistema procesa e indexa el documento")
    public void el_sistema_procesa_e_indexa_el_documento() {
        assertTrue(page.isDocumentIndexed());
    }

    @Then("El usuario utiliza la función de búsqueda para localizar el documento")
    public void el_usuario_utiliza_la_funcion_de_busqueda() {
        page.searchDocument("document title or keywords");
    }

    @Then("El documento se encuentra en los resultados de búsqueda")
    public void el_documento_se_encuentra_en_los_resultados_de_busqueda() {
        assertTrue(page.isDocumentFoundInSearchResults());
    }
}