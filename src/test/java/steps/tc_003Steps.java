package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver = new ChromeDriver();
    tc_003Page page = new tc_003Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("selecciona la opción 'Cargar documento'")
    public void selecciona_la_opcion_cargar_documento() {
        page.clickUploadOption();
    }

    @Then("el formulario carga correctamente")
    public void el_formulario_carga_correctamente() {
        page.verifyUploadFormIsDisplayed();
    }

    @When("selecciona un archivo que excede el límite de tamaño permitido")
    public void selecciona_un_archivo_que_excede_el_limite_de_tamano_permitido() {
        page.uploadExceedingSizeFile();
    }

    @Then("el sistema rechaza el archivo")
    public void el_sistema_rechaza_el_archivo() {
        page.verifyFileRejected();
    }

    @Then("muestra un mensaje indicando que el tamaño excede el límite")
    public void muestra_un_mensaje_indicando_que_el_tamano_excede_el_limite() {
        page.verifyExceedsLimitMessage();
    }
}