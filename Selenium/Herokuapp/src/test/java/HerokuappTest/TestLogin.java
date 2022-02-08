package HerokuappTest;

import HerokuappBase.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Test https://the-internet.herokuapp.com/secure sajta za vreme predavanja
//Stranica ima samo dva funkcionalnosti, login i logout, pa su samo one i testirane

public class TestLogin extends BasePage {

    @BeforeMethod

    public void setupPage () {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    public void uspesniLogin () {
        String username =  excelReader.getStringData("Login", 1, 0 );
        String pass = excelReader.getStringData("Login", 1, 1);
        loginPage.proslediUsername(username);
        loginPage.proslediPass(pass);
        loginPage.clickLoginButton();

    }

    @Test (priority = 10)
    public void verifyThatUserCanLoginWithRightCredentials () {

       String username =  excelReader.getStringData("Login", 1, 0 );

       String pass = excelReader.getStringData("Login", 1, 1);

       loginPageAnotacije.proslediUsername(username);
       loginPage.proslediPass(pass);
       loginPage.clickLoginButton();

       String expectedURL = excelReader.getStringData("URL", 1 ,1);
       Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
       Assert.assertTrue(logoutPage.logOutButton().isDisplayed());
    }

    @Test (priority = 20)
    public void verifyThatUserCantLoginWithWrongUsernameAndRightPass () {

        for (int i = 1; i < 6; i++) {
            String username = excelReader.getStringData("Login", i, 2);

            String pass = excelReader.getStringData("Login", 1, 1);
            loginPage.proslediUsername(username);
            loginPage.proslediPass(pass);
            loginPage.clickLoginButton();

            String expectedURL = excelReader.getStringData("URL", 1, 1);
            Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".flash.error"))));
            Assert.assertTrue(loginPage.loginErrorMessageField().isDisplayed());
            String expectedMessage = excelReader.getStringData("Expected Messages", 1, 0);
            Assert.assertEquals(loginPage.loginErrorMessage(), expectedMessage);
        }


    }

    @Test (priority = 30)
    public void verifyThatUserCantLoginWithBlankPasswordFieldAndRightUsername () {
        String username =  excelReader.getStringData("Login", 1, 0 );
        loginPage.proslediUsername(username);
        loginPage.passwordField().clear();
        loginPage.clickLoginButton();

        String expectedURL = excelReader.getStringData("URL",1, 1);
        Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".flash.error"))));
        Assert.assertTrue(loginPage.loginErrorMessageField().isDisplayed());
        String expectedMessage = excelReader.getStringData("Expected Messages", 1, 1);
        Assert.assertEquals(loginPage.loginErrorMessage(),expectedMessage);


    }

    @Test (priority = 40)
    public void logout () {
        uspesniLogin();
        logoutPage.logOutButtonClick();
        String expectedURL = homeURL;

        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
        Assert.assertTrue(loginPage.logoutSuccess().isDisplayed());

        String expectedMessage = excelReader.getStringData("Expected messages", 1, 2);
        Assert.assertEquals(loginPage.logoutSuccessMessage(), expectedMessage);

    }

    @Test (priority = 50)
    public void verifyThatUserCantLoginWithRightUsernameAndWrongPass () {
        for (int i = 1; i <6; i++) {
            String username = excelReader.getStringData("Login", 1, 0);
            String pass = excelReader.getStringData("Login", i, 3);
            loginPage.proslediUsername(username);
            loginPage.proslediPass(pass);
            loginPage.clickLoginButton();

            String expectedURL = excelReader.getStringData("URL", 1, 1);
            Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".flash.error"))));
            Assert.assertTrue(loginPage.loginErrorMessageField().isDisplayed());
            String expectedMessage = excelReader.getStringData("Expected Messages", 1, 1);
            Assert.assertEquals(loginPage.loginErrorMessage(), expectedMessage);
        }
    }

    @Test (priority = 60)
    public void VerifyThatUserCantLoginWithWrongUsernameAndPass () {
        for (int i = 1; i <= excelReader.lastRow("Login"); i++) {
            String username = excelReader.getStringData("Login", i, 2);
            String pass = excelReader.getStringData("Login", i, 3);
            loginPage.proslediUsername(username);
            loginPage.proslediPass(pass);
            loginPage.clickLoginButton();

            String expectedURL = excelReader.getStringData("URL", 1, 1);
            Assert.assertNotEquals(driver.getCurrentUrl(), expectedURL);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".flash.error"))));
            Assert.assertTrue(loginPage.loginErrorMessageField().isDisplayed());
            String expectedMessage = excelReader.getStringData("Expected Messages", 1, 0);
            Assert.assertEquals(loginPage.loginErrorMessage(), expectedMessage);

        }
    }




}
