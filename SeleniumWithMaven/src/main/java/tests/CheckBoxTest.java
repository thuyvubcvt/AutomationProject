package tests;

import common.TestBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

import java.util.Arrays;
import java.util.List;

public class CheckBoxTest extends TestCase {
    @Test
    public void verifyCheckBoxCorrectly() {
        String expectedText="You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";


        HomePage homePage = new HomePage(testBasic.driver);

        ElementsPage elementsPage = homePage.clickOnElement();

        CheckBoxPage checkBoxPage = elementsPage.clickOnCheckBox();
        checkBoxPage.clickOnCheckBoxPage();



        Assert.assertTrue(checkBoxPage.getCheckedResult(checkBoxPage.chkItem,"Home"));
        checkBoxPage.clickIconExpand();
        Assert.assertTrue(checkBoxPage.getCheckedResult(checkBoxPage.chkItem,"Desktop"));

        String actualText=checkBoxPage.getActualString();
        Assert.assertEquals(actualText,expectedText);




    }


}
