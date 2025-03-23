package tests;

import common.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;
import tests.models.RegistrationEntity;
import tests.models.TextBoxEntity;


public class TextBoxTest extends TestCase {
    @Test(dataProvider = "TextBoxValidData")
    public void submitSuccessfully(TextBoxEntity textBoxEntity) {

        HomePage homePage = new HomePage(testBasic.driver,configurationsEntity);
        ElementsPage elementsPage = homePage.clickOnElement();
        TextBoxPage textBoxPage = elementsPage.clickOnTextBox();


//        String userName = "vu phuong thuy";
//        String userEmail = "vuthuy1661986@gmail.com";
//        String currentAddress = "address";
//        String permanentAddress = "permanentAddress";
        textBoxPage.inputData(textBoxEntity.getUserName(), textBoxEntity.getUserEmail(), textBoxEntity.getCurrentAddress(), textBoxEntity.getPermanentAddress());
        textBoxPage.testBasic.zoomInOut(0.6f);
        textBoxPage.clickToSubmit();
        String actualName = textBoxPage.getActualString(textBoxPage.lblName);
        String actualEmail = textBoxPage.getActualString(textBoxPage.lblEmail);
        String actualCurrentAddress = textBoxPage.getActualString(textBoxPage.lblAddress);
        String actualPermanentAddress = textBoxPage.getActualString(textBoxPage.lblPermanentAddress);

        // So sánh giá trị thực tế với giá trị mong đợi
        Assert.assertEquals(actualName, textBoxEntity.getUserName());
        Assert.assertEquals(actualEmail, textBoxEntity.getUserEmail());
        Assert.assertEquals(actualCurrentAddress, textBoxEntity.getCurrentAddress());
        Assert.assertEquals(actualPermanentAddress, textBoxEntity.getPermanentAddress());
    }

    @Test(dataProvider = "TextBoxInvalidData")
    public void validateEmailFormat(TextBoxEntity textBoxEntity) throws InterruptedException {
//        String userName = "vu phuong thuy";
//        String userEmail = "";
//        String currentAddress = "address";
//        String permanentAddress = "permanentAddress";
        HomePage homePage = new HomePage(testBasic.driver,configurationsEntity);
        ElementsPage elementsPage = homePage.clickOnElement();
        TextBoxPage textBoxPage = elementsPage.clickOnTextBox();
        textBoxPage.inputData(textBoxEntity.getUserName(), textBoxEntity.getUserEmail(), textBoxEntity.getCurrentAddress(), textBoxEntity.getPermanentAddress());
        textBoxPage.testBasic.zoomInOut(0.6f);
        textBoxPage.clickToSubmit();
        String actualEmailValue = textBoxPage.testBasic.getAttributeByLocator(textBoxPage.txtEmail, "class");
        Assert.assertTrue(actualEmailValue.contains("field-error"));

    }

    @DataProvider(name = "TextBoxValidData")
    public Object[][] getTextBoxValidData() {
        Utils utils = new Utils();
        String[][] textBoxData = utils.readExcelFile("DemoQA_TestData.xls", "TextBox");

        // textBoxData[0] là dòng data đầu tiên (Excel dòng 2)
        // textBoxData[1] là dòng data thứ 2 (Excel dòng 3)

        if (textBoxData.length >= 2) { // chắc chắn có ít nhất 2 dòng data
            TextBoxEntity[][] textBoxEntities = new TextBoxEntity[1][1];

            int rowIndex = 0; // muốn lấy dòng thứ 2 trong Excel, phải lấy index 0 (vì header đã bị loại bỏ)
            TextBoxEntity textBoxEntity = new TextBoxEntity(
                    textBoxData[rowIndex][0],
                    textBoxData[rowIndex][1],
                    textBoxData[rowIndex][2],
                    textBoxData[rowIndex][3]
            );
            textBoxEntities[0][0] = textBoxEntity;
            return textBoxEntities;
        } else {
            return new TextBoxEntity[0][0];
        }


    }
    @DataProvider(name = "TextBoxInvalidData")
    public TextBoxEntity[][] getTextBoxInvalidData() {
        Utils utils = new Utils();
        String[][] textBoxData = utils.readExcelFile("DemoQA_TestData.xls", "TextBox");
        if (textBoxData.length > 1) {
            TextBoxEntity[][] textBoxEntities = new TextBoxEntity[1][1];

            // Muốn lấy dòng data thứ 3
            int rowIndex = 1;
            TextBoxEntity textBoxEntity = new TextBoxEntity(
                    textBoxData[rowIndex][0],
                    textBoxData[rowIndex][1],
                    textBoxData[rowIndex][2],
                    textBoxData[rowIndex][3]
            );
            textBoxEntities[0][0] = textBoxEntity;
            return textBoxEntities;
        } else {
            // Nếu không đủ data thì return rỗng
            return new TextBoxEntity[0][0];
        }
    }


}
