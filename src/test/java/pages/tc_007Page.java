package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    WebDriver driver;
    
    By botonCargar = By.id("botonCargar");
    By estadoDocumento = By.id("estadoDocumento");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void navegarALaPaginaDeCarga() {
        driver.navigate().to("http://www.ejemplo.com/carga");
    }

    public void cargarDocumentoPDF() {
        WebElement cargarBtn = driver.findElement(botonCargar);
        cargarBtn.click();
        // Assuming a file chooser dialog is handled elsewhere
    }

    public String obtenerEstadoDeDocumento() {
        return driver.findElement(estadoDocumento).getText();
    }

    public void actualizarEstadoDelDocumento() {
        // Implement logic to refresh or wait for status change
    }
}