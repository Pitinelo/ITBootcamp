package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

    public WebDriver driver;
    public WebDriverWait wait;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    //creating all webelemnts fields and methods to fill those with SendKeys
    public WebElement usernameField () {
        return driver.findElement(By.name("username"));
    }

    public void fillUsernameField (String s) {
        usernameField().sendKeys(s);
    }

    public WebElement newPasswordField () {
        return driver.findElement(By.name("password"));
    }

    public void fillNewPasswordField (String s) {
        newPasswordField().sendKeys(s);
    }

    public WebElement repeatPasswordField () {
        return driver.findElement(By.name("repeatedPassword"));
    }

    public void fillRepeatPasswordField (String s) {
        repeatPasswordField().sendKeys(s);
    }

    public WebElement firstNameField () {
        return driver.findElement(By.name("account.firstName"));
    }

    public void fillFirstNameField (String s) {
        firstNameField().sendKeys(s);
    }

    public WebElement lastNameField () {
        return driver.findElement(By.name("account.lastName"));
    }

    public void fillLastNameField (String s) {
        lastNameField().sendKeys(s);
    }

    public WebElement emailField () {
        return driver.findElement(By.name("account.email"));
    }

    public void fillEmailField (String s) {
        emailField().sendKeys(s);
    }

    public WebElement phoneField () {
        return driver.findElement(By.name("account.phone"));
    }

    public void fillPhoneField (int i) {
        phoneField().sendKeys(String.valueOf(i));
    }

    public WebElement address1Field () {
        return driver.findElement(By.name("account.address1"));
    }

    public void fillAddress1 (String s){
        address1Field().sendKeys(s);
    }

    public WebElement cityField() {
        return driver.findElement(By.name("account.city"));
    }

    public void fillCityField (String s){
        cityField().sendKeys(s);
    }

    public WebElement stateField () {
        return driver.findElement(By.name("account.state"));
    }

    public void fillStateField (String s) {
        stateField().sendKeys(s);
    }

    public WebElement zipField () {
        return driver.findElement(By.name("account.zip"));
    }

    public void fillZipField (int i){
        zipField().sendKeys(String.valueOf(i));
    }

    public WebElement countryField () {
        return driver.findElement(By.name("account.country"));
    }

    public void fillCountryField (String s) {
        countryField().sendKeys(s);
    }

    public WebElement language () {
        return driver.findElement(By.name("account.languagePreference"));
    }

    public void chooseLanguage (String s){
        language().sendKeys(s);
    }

    public WebElement favoriteCategory () {
        return driver.findElement(By.name("account.favouriteCategoryId"));
    }

    public void chooseFavoriteCategory (String s) {
        favoriteCategory().sendKeys(s);
    }

    public WebElement saveAccountInfoButton () {
        return driver.findElement(By.name("newAccount"));
    }

    public void clickSaveNewAccountButton () {
        saveAccountInfoButton().click();
    }



}
