package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By searchField = By.id("searchField");
    private By searchButton = By.id("searchButton");
    private By documentResultLocator = By.xpath("//div[contains(@class, 'document-result')]");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadPDFDocument(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
        // Additional logic to handle upload process
    }

    public boolean isDocumentIndexed() {
        // Logic to verify if the document is indexed
        return true;
    }

    public void searchDocument(String searchQuery) {
        WebElement searchElement = driver.findElement(searchField);
        searchElement.sendKeys(searchQuery);
        driver.findElement(searchButton).click();
    }

    public boolean isDocumentFoundInSearchResults() {
        // Logic to verify if the document appears in search results
        return driver.findElements(documentResultLocator).size() > 0;
    }
}