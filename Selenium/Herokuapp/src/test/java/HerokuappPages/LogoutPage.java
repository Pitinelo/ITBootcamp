package HerokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public LogoutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    // lociranje logOutButtona koje se nalazi na stranici kada s user uspesno ulogovao
    public WebElement logOutButton () {
        return driver.findElement(By.cssSelector(".button.secondary.radius"));
    }
    //metoda koja izvrsava click na polju logout
    public void logOutButtonClick (){
       logOutButton().click();
    }


}
