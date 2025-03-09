package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;


public class TextBoxTest extends TestCase {
    @Test
    public void submitSuccessfully() {

        HomePage homePage = new HomePage(testBasic.driver);
        ElementsPage elementsPage = homePage.clickOnElement();


        TextBoxPage textBoxPage = elementsPage.clickOnTextBox();


        String userName = "vu phuong thuy";
        String userEmail = "vuthuy1661986@gmail.com";
        String currentAddress = "address";
        String permanentAddress = "permanentAddress";
        textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
        String actualName = textBoxPage.getActualString(textBoxPage.lblName);
        String actualEmail = textBoxPage.getActualString(textBoxPage.lblEmail);
        String actualCurrentAddress = textBoxPage.getActualString(textBoxPage.lblAddress);
        String actualPermanentAddress = textBoxPage.getActualString(textBoxPage.lblPermanentAddress);

        // So sánh giá trị thực tế với giá trị mong đợi
        Assert.assertEquals(actualName, userName);
        Assert.assertEquals(actualEmail, userEmail);
        Assert.assertEquals(actualCurrentAddress, currentAddress);
        Assert.assertEquals(actualPermanentAddress, permanentAddress);
    }

    @Test
    public void validateEmailFormat() {
        String userName = "vu phuong thuy";
        String userEmail = "";
        String currentAddress = "address";
        String permanentAddress = "permanentAddress";
        HomePage homePage = new HomePage(testBasic.driver);
        ElementsPage elementsPage = homePage.clickOnElement();
        TextBoxPage textBoxPage = elementsPage.clickOnTextBox();
        textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
       // String actualEmailValue = textBoxPage.testBasic.getAttributeByLocator(textBoxPage.txtEmail,"class");
        //Assert.assertTrue(actualEmailValue.contains("field-error"));

    }

}
