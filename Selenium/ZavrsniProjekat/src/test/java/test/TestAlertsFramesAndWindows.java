package test;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAlertsFramesAndWindows extends BasePage {

    @BeforeMethod
    public void setupPage () {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    @Test (priority = 10)
    public void verifyThatALlButtonOpenTabOrWindow () {
        homePage.chooseAndClickOnElementsTab((excelReader.getStringData("HomePageNames", 3, 0)));
        alertsFramesAndWindows.chooseAndClickAlertsTab(excelReader.getStringData("Alerts", 1, 0));
        browserWindows.clickOnButton(browserWindows.newTabButton());
        browserWindows.nextTab();

        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        browserWindows.nextTab();
        browserWindows.clickOnButton(browserWindows.newWindowButton());
        browserWindows.clickOnButton(browserWindows.newWindowMessage());
        //when we click on all three buttons there will be 4 windows or tabs presented on the screen
        int expectedNumberOfTabsAndWindows = 4;

        Assert.assertEquals(driver.getWindowHandles().size(), expectedNumberOfTabsAndWindows);
    }

    @Test (priority = 20)
    public void verifyThatEveryButtonOpensRightAlert () {
        homePage.chooseAndClickOnElementsTab((excelReader.getStringData("HomePageNames", 3, 0)));
        alertsFramesAndWindows.chooseAndClickAlertsTab(excelReader.getStringData("Alerts", 2, 0));

        alertsTab.clickOnRightButton(0);
        Alert alert = driver.switchTo().alert();
        String expectedMessageRegularAlert = "You clicked a button";
        Assert.assertEquals(alert.getText(),expectedMessageRegularAlert);
        alert.accept();

        alertsTab.clickOnRightButton(1);
        wait.until(ExpectedConditions.alertIsPresent());
        String expectedMessageWaitedAlert = "This alert appeared after 5 seconds";
        Assert.assertEquals(alert.getText(),expectedMessageWaitedAlert);
        alert.accept();

        alertsTab.clickOnRightButton(2);
        alert.accept();
        String expectedMessageConfirmAlert = "You selected Ok";
        Assert.assertEquals(alertsTab.alertConfirmMessage().getText(), expectedMessageConfirmAlert);

        alertsTab.clickOnRightButton(3);
        Assert.assertEquals(alert.getText(), "Please enter your name");
        alert.accept();

    }

    @Test (priority = 30)
    public void verifyThatUserGetRightMessageForEveryNameSentToPromptAlert () {
        homePage.chooseAndClickOnElementsTab((excelReader.getStringData("HomePageNames", 3, 0)));
        alertsFramesAndWindows.chooseAndClickAlertsTab(excelReader.getStringData("Alerts", 2, 0));

        for (int i = 1; i <= excelReader.lastRow("PersonalDetails"); i++) {
            alertsTab.clickOnRightButton(3);
            Alert alert = driver.switchTo().alert();
            String ime = excelReader.getStringData("PersonalDetails", i, 1);
            alert.sendKeys(ime);
            alert.accept();
            String expectedMessage = "You entered " + ime;
            Assert.assertEquals(alertsTab.alertPromptMessage().getText(), expectedMessage);
        }
    }

    @Test (priority = 40)
    public void verifyThatEveryButtonOpensRightModal () throws InterruptedException {
        homePage.chooseAndClickOnElementsTab((excelReader.getStringData("HomePageNames", 3, 0)));
        alertsFramesAndWindows.chooseAndClickAlertsTab(excelReader.getStringData("Alerts", 5, 0));

        modalDialogs.clickOnButton(modalDialogs.smallModalButton());
        Assert.assertEquals(modalDialogs.modalHeader().getText(), "Small Modal");
        modalDialogs.clickOnButton(modalDialogs.closeSmallModalButton());

        modalDialogs.clickOnButton(modalDialogs.largeModalButton());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".modal-title.h4")));
        Assert.assertEquals(modalDialogs.modalHeader().getText(), "Large Modal");
        modalDialogs.clickOnButton(modalDialogs.closeLargeModalButton());
    }


}
