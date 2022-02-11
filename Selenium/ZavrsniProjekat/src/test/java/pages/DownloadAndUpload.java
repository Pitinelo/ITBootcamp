package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadAndUpload {

    public WebDriver driver;
    public WebDriverWait wait;

    public DownloadAndUpload(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement uploadImageButton () {
        return driver.findElement(By.id("uploadFile"));
    }

    public void uploadImage (String filePath) {
        uploadImageButton().sendKeys(filePath);
    }

    public WebElement uploadMessagePath () {
        return driver.findElement(By.id("uploadedFilePath"));
    }


}
