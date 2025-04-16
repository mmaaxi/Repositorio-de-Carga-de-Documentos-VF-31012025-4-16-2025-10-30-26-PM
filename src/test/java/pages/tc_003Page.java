package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    By uploadButton = By.id("uploadFileButton");
    By uploadForm = By.id("uploadForm");
    By fileInput = By.id("fileInput");
    By errorMessage = By.id("errorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void clickUploadOption() {
        driver.findElement(uploadButton).click();
    }

    public void verifyUploadFormIsDisplayed() {
        assert driver.findElement(uploadForm).isDisplayed();
    }

    public void uploadExceedingSizeFile() {
        driver.findElement(fileInput).sendKeys("/path/to/large/file");
    }

    public void verifyFileRejected() {
        // logic to verify if the file was rejected (e.g., check the absence of file in the system)
    }

    public void verifyExceedsLimitMessage() {
        assert driver.findElement(errorMessage).getText().contains("El tamaño del archivo excede el límite permitido");
    }
}