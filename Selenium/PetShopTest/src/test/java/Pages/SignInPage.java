package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public SignInPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    // creating webelement that is linked with signup page
    public WebElement registerTextLink () {
        return driver.findElement(By.linkText("Register Now!"));
    }

    public void clickOnRegisterTextLink () {
        registerTextLink().click();
    }

    public WebElement usernameField () {
        return driver.findElement(By.name("username"));
    }
    //crating method that fill in username field with the string that is sent to it
    public void fillUsernameField (String s) {
        usernameField().clear();
        usernameField().sendKeys(s);
    }

    public WebElement passwordField () {
        return driver.findElement(By.name("password"));
    }
    //creating method that fill in password field with the string that is sent to it
    public void fillPasswordField (String s){
        passwordField().clear();
        passwordField().sendKeys(s);
    }

    public WebElement loginButton () {
        return driver.findElement(By.name("signon"));
    }

    public void clickLoginButton (){
        loginButton().click();
    }
    //locating error message that we can use for asserting that we can't login with invalid password
    public WebElement errorMessage () {
        return driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
    }
}
