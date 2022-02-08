package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public MyAccountPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    // locating WebElement that we can use to verify that accout informations are same as we entered - I didn't use it because when running all tests it failed
    public WebElement Address1Field () {
        return driver.findElement(By.name("account.address1"));
    }


}
