package test;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAlertsFramesAndWindows extends BasePage {

    @BeforeMethod
    public void setupPage () {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    @Test
    public void proba () {
        homePage.chooseAndClickOnElementsTab((excelReader.getStringData("HomePageNames", 3, 0)));
        alertsFramesAndWindows.chooseAndClickAlertsTab(excelReader.getStringData("Alerts", 1, 0));
        browserWindows.clickOnButton(browserWindows.newTabButton());
        browserWindows.nextTab();

        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        browserWindows.nextTab();
        browserWindows.clickOnButton(browserWindows.newWindowButton());
        browserWindows.clickOnButton(browserWindows.newWindowMessage());

        int expectedNumberOfTabsAndWindows = 4;

        Assert.assertEquals(driver.getWindowHandles().size(), expectedNumberOfTabsAndWindows);
    }


}
