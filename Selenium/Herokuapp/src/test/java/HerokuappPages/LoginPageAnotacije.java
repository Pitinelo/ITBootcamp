package HerokuappPages;

import HerokuappBase.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Klasa u kojoj smo radili drugaciji nacin trazenja elemenata 

public class LoginPageAnotacije extends BasePage {

    public LoginPageAnotacije() {
        PageFactory.initElements(driver,this);
    }

    public @FindBy ( id = "username")
    WebElement username;

    @FindBy ( id = "password")
    WebElement password;

    @FindBy ( css = ".fa.fa-2x.fa-sign-in")
    WebElement loginButton;

    public void proslediUsername (String s) {
        username.sendKeys(s);
    }

    public void proslediPass (String s) {
        password.sendKeys(s);
    }

    public void clickLoginButton () {
        loginButton.click();
    }
}
