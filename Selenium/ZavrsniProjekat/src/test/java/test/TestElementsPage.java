package test;

import base.BasePage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class TestElementsPage extends BasePage {

    @BeforeMethod
    public void setupPage () {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    @Test
    public void duzinaElements () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        System.out.println(elementsPage.elementsTabs().size());
    }

    @Test (priority = 10)
    public void verifyThatReturnDataIsSameAsUserInputed () {

       homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
       elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 1, 0));
       textBox.emailFieldFill(excelReader.getStringData("PersonalDetails", 1, 3));
       textBox.currentAddressFieldFill(excelReader.getStringData("PersonalDetails", 1, 4));
       textBox.permanentAddressFieldFill(excelReader.getStringData("PersonalDetails", 2, 4));

       for (int i = 1; i <= excelReader.lastRow("PersonalDetails"); i++) {

           textBox.fullNameFieldFill(excelReader.getStringData("PersonalDetails", i, 0));
           textBox.submitButtonClick();

           String expectedCredentials = excelReader.getStringData("PersonalDetails", i, 8);
           String expectedURL = excelReader.getStringData("URL", 1, 1);

           Assert.assertEquals(textBox.nameMessage().getText(), expectedCredentials);
           Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
       }

    }

    @Test (priority = 20)
    public void verifyThatSelectingAllChildFilesSelectParentFolder () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 2, 0));
        checkBox.plusButtonCLick();
        checkBox.clickOnFieldInTree(excelReader.getStringData("CheckBoxTree", 3, 0));
        checkBox.clickOnFieldInTree(excelReader.getStringData("CheckBoxTree", 4, 0));

        String expectedMessage = expectedMessageForPartialExcel("CheckBoxTree","home", 5);
        String expectedURL = excelReader.getStringData("URL", 2, 1);

        Assert.assertEquals(checkBox.message().getText(),expectedMessage);
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }

    @Test (priority = 25)
    public void verifyThatClickingOnParentOfWholeTreeWillSelectAllChildElements () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 2, 0));
        checkBox.plusButtonCLick();
        checkBox.clickOnFieldInTree(excelReader.getStringData("CheckBoxTree", 1, 0));

        String expectedMessage = expectedMessageForWholeExcelRow("CheckBoxTree") ;

        Assert.assertEquals(checkBox.message().getText(),expectedMessage);
    }

    @Test (priority = 30)
    public void verifyThatAllHomePageTabsAreDisplayed () {
        boolean proba = true;

        for (int i = 1; i <= excelReader.lastRow("HomePageNames"); i++ ){
            if (!homePage.imaLiElemenata(excelReader.getStringData("HomePageNames", i, 0))) {
                proba = false;
                break;
            }
        }

        Assert.assertTrue(proba);
    }

    @Test
    public void proba () {
        scrollMethod(homePage.homePageTabs(excelReader.getStringData("HomePageNames", 6, 0)));
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 6, 0));
    }

    @Test (priority = 40)
    public void verifyThatClickingOnEveryRadioButtonGetsRightMessage (){

        String expectedMessageYesButton = excelReader.getStringData("RadioButtons", 1, 0);
        String expectedMessageImpressiveButton = excelReader.getStringData("RadioButtons", 2, 0);
        String expectedMessageNoButton = excelReader.getStringData("RadioButtons", 3, 0);

        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 3, 0));
        radioButton.yesRadioButtonClick();

        Assert.assertEquals(radioButton.radioButtonMessage().getText(), expectedMessageYesButton);

        radioButton.impressiveRadioButtonClick();

        Assert.assertEquals(radioButton.radioButtonMessage().getText(), expectedMessageImpressiveButton);

        radioButton.noRadioButtonClick();

        Assert.assertEquals(radioButton.radioButtonMessage().getText(), expectedMessageNoButton);
    }

    @Test (priority = 50)
    public void verifyThatAddingUserIsDisplayedInTableList () throws InterruptedException {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 4, 0));

        while (!webTables.wholeTableList().getText().isBlank()) {
            webTables.deleteButton().click();

        }
        for (int i = 1; i <= excelReader.lastRow("PersonalDetails"); i++) {
            webTables.addTableButtonClick();
            webTables.fullNamePopUpFill(excelReader.getStringData("PersonalDetails", i, 1));
            webTables.lastNamePopUpFill(excelReader.getStringData("PersonalDetails", i, 2));
            webTables.emailFill(excelReader.getStringData("PersonalDetails", i, 3));
            webTables.ageFill(excelReader.getIntegerData("PersonalDetails", i, 5));
            webTables.salaryFill(excelReader.getIntegerData("PersonalDetails", i, 6));
            webTables.departmentFill(excelReader.getStringData("PersonalDetails", i, 7));
            webTables.submitButtonCLick();
            Assert.assertTrue(webTables.wholeTableList().getText().toUpperCase(Locale.ROOT).contains(excelReader.getStringData("PersonalDetails", i, 1).toUpperCase(Locale.ROOT)));
        }
    }

    @Test (priority = 60)
    public void verifyThatUserCantAddNewUserWithInvalidEmail () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 4, 0));

        while (!webTables.wholeTableList().getText().isBlank()) {
            webTables.deleteButton().click();
        }

        webTables.addTableButtonClick();
        webTables.fullNamePopUpFill(excelReader.getStringData("PersonalDetails", 1, 1));
        webTables.lastNamePopUpFill(excelReader.getStringData("PersonalDetails", 1, 2));
        webTables.emailFill(excelReader.getStringData("PersonalDetails", 5, 3));
        webTables.ageFill(excelReader.getIntegerData("PersonalDetails", 1, 5));
        webTables.salaryFill(excelReader.getIntegerData("PersonalDetails", 1, 6));
        webTables.departmentFill(excelReader.getStringData("PersonalDetails", 1, 7));
        webTables.submitButtonCLick();
        Assert.assertFalse(webTables.wholeTableList().getText().toUpperCase(Locale.ROOT).contains(excelReader.getStringData("PersonalDetails", 1, 1).toUpperCase(Locale.ROOT)));
    }

    @Test (priority = 70)
    public void verifyThatPerformingActionNamedOnTHeButtonProduceRightEffect () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 5, 0));
        buttons.doubleClickMeButtonAction();
        buttons.rightClickMeButtonAction();
        buttons.clickOnButton(buttons.clickMeButton());

        String doubleClickExpectedMessage = "You have done a double click";
        String rightClickExpectedMessage = "You have done a right click";
        String singletClickExpectedMessage = "You have done a dynamic click";

        Assert.assertEquals(buttons.doubleClickMessage().getText(),doubleClickExpectedMessage);
        Assert.assertEquals(buttons.rightClickMessage().getText(), rightClickExpectedMessage);
        Assert.assertEquals(buttons.singleClickMessage().getText(), singletClickExpectedMessage);
    }

    @Test (priority = 80)
    public void verifyThatClickingOnHomeTextLinkOpenHomePageInNewTab () throws InterruptedException {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 6, 0));
        links.clickOnLink(links.simpleLink());
        String expectedURL = homeURL;
        links.nextTab();
        Assert.assertEquals(driver.getCurrentUrl(),expectedURL);
    }

    @Test (priority = 90)
    public void verifyThatUserGetsRightMessageWithEveryLinkWithAPICall () throws InterruptedException {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 6, 0));

        List<WebElement> apiLinks = links.apiLinks();

        for (int i = 0; i < apiLinks.size(); i++){
            links.clickOnLink(apiLinks.get(i));
            String expectedMessage = excelReader.getStringData("Messages", (i+1), 0);
            Thread.sleep(500);
            Assert.assertEquals(links.linkResponse().getText(), expectedMessage);
        }
    }

    @Test (priority = 100)
    public void verifyThatClickingOnEachLinkRedirectUsToRightPage () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 7, 0));
        brokenLinks.clickOnTextLink(brokenLinks.validLink());

        String expectedURLValidLink = homeURL;
        Assert.assertEquals(driver.getCurrentUrl(), homeURL);

        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 7, 0));
        brokenLinks.clickOnTextLink(brokenLinks.brokenLink());

        String expectedURLBrokenLink = "http://the-internet.herokuapp.com/status_codes/500";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURLBrokenLink);
    }

    @Test (priority = 110)
    public void verifyThatUserUploadRightPicture () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 8, 0));
        for (int i = 1; i <= excelReader.lastRow("FilePaths"); i++){
            downloadAndUpload.uploadImage(excelReader.getStringData("FilePaths", i, 0));

            String expectedMessage = excelReader.getStringData("FilePaths", i, 1);

            Assert.assertEquals(downloadAndUpload.uploadMessagePath().getText(),expectedMessage);

        }
    }

    @Test (priority = 120)
    public void verifyThatAllElementsAreDisplayedAfterFiveSeconds () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 1, 0));
        elementsPage.chooseAndClickElementsTab(excelReader.getStringData("ElementsPage", 9, 0));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));

        Assert.assertTrue(dynamicProperties.enableAfterButton().isDisplayed());
        Assert.assertTrue(dynamicProperties.colorChange().isDisplayed());
        Assert.assertTrue(dynamicProperties.visibleAfter().isDisplayed());
    }







}
