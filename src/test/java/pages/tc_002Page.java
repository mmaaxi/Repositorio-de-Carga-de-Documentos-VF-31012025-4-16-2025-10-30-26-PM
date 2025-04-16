package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    private By uploadButton = By.id("upload_button");
    private By uploadForm = By.id("upload_form");
    private By fileInput = By.id("file_input");
    private By errorDisplay = By.id("error_display");
    private By uploadErrorMessage = By.id("upload_error_message");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadFormDisplayed() {
        return driver.findElement(uploadForm).isDisplayed();
    }

    public void selectInvalidFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isFormatNotAllowedErrorDisplayed() {
        return driver.findElement(errorDisplay).isDisplayed();
    }

    public void submitUploadForm() {
        driver.findElement(uploadButton).submit();
    }

    public boolean isFileUploaded() {
        // Logic to verify if the file has been uploaded
        // This implementation assumes checking of upload success, it's just a placeholder
        return false;
    }

    public boolean isUploadErrorMessageDisplayed() {
        return driver.findElement(uploadErrorMessage).isDisplayed();
    }
}