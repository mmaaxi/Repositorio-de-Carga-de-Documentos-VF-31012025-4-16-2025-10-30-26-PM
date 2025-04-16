package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class tc_006Page {

    WebDriver driver;

    @FindBy(id = "uploadInput")
    private WebElement uploadInput;

    @FindBy(className = "confirmationMessage")
    private List<WebElement> confirmationMessages;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean seleccionarDocumentosPDF() {
        try {
            uploadInput.sendKeys("/path/to/document1.pdf\n/path/to/document2.pdf\n/path/to/document3.pdf");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void ejecutarCargaPorLotes() {
        uploadInput.submit();
    }

    public boolean verificarSeleccionMultiple() {
        return uploadInput.getAttribute("files").split("\n").length == 3;
    }

    public boolean verificarMensajesDeConfirmacion() {
        return confirmationMessages.size() == 3;
    }
}