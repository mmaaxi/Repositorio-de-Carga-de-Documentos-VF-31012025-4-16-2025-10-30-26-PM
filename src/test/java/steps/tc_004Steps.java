package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page documentPage = new tc_004Page();

    @Given("El usuario ha accedido a la página de carga de documentos")
    public void el_usuario_ha_accedido_a_la_pagina_de_carga_de_documentos() {
        documentPage.navigateToUploadPage();
    }

    @When("El usuario carga un documento PDF válido")
    public void el_usuario_carga_un_documento_pdf_valido() {
        documentPage.uploadPDFDocument("ruta/del/documento.pdf");
    }

    @Then("El sistema debe procesar el documento sin errores")
    public void el_sistema_debe_procesar_el_documento_sin_errores() {
        Assert.assertTrue(documentPage.isDocumentProcessedSuccessfully());
    }

    @When("El usuario abre el documento cargado desde el repositorio")
    public void el_usuario_abre_el_documento_cargado_desde_el_repositorio() {
        documentPage.openUploadedDocument();
    }

    @Then("El documento debe visualizarse correctamente y preservar el formato original")
    public void el_documento_debe_visualizarse_correctamente_y_preservar_el_formato_original() {
        Assert.assertTrue(documentPage.isDocumentIntegrityPreserved());
    }
}