package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileInput = By.id("fileInput");
    By submitButton = By.id("submitButton");
    By successMessage = By.id("successMessage");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileInputDisplayed() {
        return driver.findElement(fileInput).isDisplayed();
    }

    public void selectFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public String getUploadedFileName() {
        WebElement fileInputElement = driver.findElement(fileInput);
        return fileInputElement.getAttribute("value").substring(fileInputElement.getAttribute("value").lastIndexOf("\\") + 1);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}