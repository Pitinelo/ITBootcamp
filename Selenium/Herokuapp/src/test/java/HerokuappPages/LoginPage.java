package HerokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    //Lociranje elemenata na stranici preko id
    public WebElement usernameField () {
        return driver.findElement(By.id("username"));
    }

    public WebElement passwordField () {
        return driver.findElement(By.id("password"));
    }
    //prosledjivanje odredjenog stringa poljima username i pass - sama zahteva da joj se prosledi string
    public void proslediUsername (String s) {
        usernameField().clear(); //brisanje teksta koji je prethodno u polju za username
        usernameField().sendKeys(s); //prosledjivanje odredjenog teksta polju Username
    }

    public void proslediPass (String s) {
        passwordField().clear(); //brisanje teksta koji je prethodno u polju za password
        passwordField().sendKeys(s); ////prosledjivanje odredjenog teksta polju Password
    }
    //lociranje polja login uz pomoc cssSelectora
    public WebElement loginButton () {
        return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    }
    // metoda koja radi click na poljeLogin
    public void clickLoginButton () {
        loginButton().click();
    }
    //lociranje polja u kome se ispisuje poruka ukoliko se nismo uspesno ulogovali
    public WebElement loginErrorMessageField() {
        return driver.findElement(By.cssSelector(".flash.error"));
    }
    // izvlacenje teksta iz polja za ispis greske
    public String loginErrorMessage () {
        return loginErrorMessageField().getText();
    }
    // lociranje polja gde se ispisuje tekst kad smo se uspesno izlogovali
    public WebElement logoutSuccess () {
        return driver.findElement(By.cssSelector(".flash.success"));
    }

    public String logoutSuccessMessage () {
        return logoutSuccess().getText();
    }




}
