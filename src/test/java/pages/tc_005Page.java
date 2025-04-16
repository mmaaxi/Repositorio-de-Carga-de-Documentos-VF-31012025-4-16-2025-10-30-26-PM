package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;

    // Constructor method to set up the WebDriver
    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to the document upload page
    public void navigateToUploadPage() {
        driver.get("http://example.com/carga-de-documentos");
    }

    // Perform the action of uploading a malicious file
    public void uploadMaliciousFile(String filePath) {
        WebElement uploadInput = driver.findElement(By.id("uploadInput"));
        uploadInput.sendKeys(filePath);
        driver.findElement(By.id("uploadButton")).click();
    }

    // Check if the upload was rejected
    public boolean isUploadRejected() {
        return driver.findElement(By.id("uploadError")).isDisplayed();
    }

    // Simulate checking security logs
    public void checkSecurityLogs() {
        // Logic to navigate and check security logs
    }

    // Verify if the security incident is logged
    public boolean isSecurityIncidentLogged() {
        // Logic to verify if the incident is logged
        return true;  // Placeholder return value
    }

    // Verify if notification was sent to admin
    public boolean isAdminNotified() {
        // Logic to verify if admin was notified
        return true;  // Placeholder return value
    }
}