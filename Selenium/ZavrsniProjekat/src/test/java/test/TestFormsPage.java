package test;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFormsPage extends BasePage {

    @BeforeMethod
    public void setupPage () {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    @Test (priority = 10)
    public void verifyThatAllInputsUSerInputIsDisplayed () {
        homePage.chooseAndClickOnElementsTab(excelReader.getStringData("HomePageNames", 2, 0));
        forms.chooseAndClickFormsTab(excelReader.getStringData("ElementsPage", 1, 1));

        forms.firstNameFill(excelReader.getStringData("Practice Form", 1, 0));
        forms.lastNameFill(excelReader.getStringData("Practice Form", 1, 1));
        forms.emailNameFill(excelReader.getStringData("Practice Form", 1, 2));
        forms.clickOnMaleRadioButton(excelReader.getIntegerData("Practice Form", 1, 3));
        forms.mobileNumberFieldFill(excelReader.getStringData("Practice Form", 1, 4));
        forms.birthDateField().click();
        forms.chooseBirthDate(excelReader.getStringData("Practice Form", 1, 5), excelReader.getIntegerData("Practice Form", 1, 6), excelReader.getIntegerData("Practice Form", 1, 7));
        forms.subjectFieldFill(excelReader.getStringData("Practice Form", 1, 8));
        forms.clickOnSportsHobbie(excelReader.getIntegerData("Practice Form", 1, 9));
        forms.uploadPhoto(excelReader.getStringData("Practice Form", 1, 10));
        forms.currentAddressFill(excelReader.getStringData("Practice Form", 1, 11));
        forms.selectState();
        forms.selectCity();
        forms.clickOnSubmitButton();

        Assert.assertTrue(forms.inputData().getText().contains(excelReader.getStringData("Practice Form", 1, 4).substring(1)));
        Assert.assertTrue(forms.inputData().getText().contains(excelReader.getStringData("Practice Form", 1, 2)));
    }




}
