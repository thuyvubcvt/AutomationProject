package tests;

import common.Utils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PracticeFormPage;
import pages.RegistrationFormPage;
import pages.WebTablePage;
import tests.models.RegistrationEntity;

import java.util.ArrayList;

public class WebTableTest extends TestCase {

    @Test(dataProvider = "RegistrationData")
    public void searchByFirstNameSuccessfully(RegistrationEntity registrationEntity) {
        final String CONFIG_FILE=System.getProperty("user.dir"+"/src/main/resources/Configurations.properties");
        System.out.println("in ra sss"+CONFIG_FILE);
        System.out.println("in ra "+configurationsEntity.url);
        WebTablePage webTablePageDefault = new WebTablePage(testBasic.driver,configurationsEntity);
        webTablePageDefault.goToWebTablePage();
        RegistrationFormPage registrationFormPage = webTablePageDefault.clickBtnAdd(); // new RegistrationFormPage(testBasic.driver);
        registrationFormPage.inputForm(registrationEntity);
        WebTablePage webTablePage=registrationFormPage.clickBtnSubmit();
        webTablePage.inputTextBoxSearch(registrationEntity.getFirstName());
        webTablePage.testBasic.waitForElement(webTablePage.resultSearchFirstName,Integer.valueOf(webTablePage.config.timeOutMedium));
        String actualFirstName = webTablePage.testBasic.getActualString(webTablePage.resultSearchFirstName);
        Assert.assertEquals(actualFirstName, registrationEntity.getFirstName());

    }
    @Test(dataProvider = "RegistrationData")
    public void searchByLastNameSuccessfully(RegistrationEntity registrationEntity) {
        WebTablePage webTablePageDefault = new WebTablePage(testBasic.driver,configurationsEntity);
        webTablePageDefault.goToWebTablePage();
        RegistrationFormPage registrationFormPage = webTablePageDefault.clickBtnAdd(); // new RegistrationFormPage(testBasic.driver);
        registrationFormPage.inputForm(registrationEntity);
        WebTablePage webTablePage=registrationFormPage.clickBtnSubmit();
        webTablePage.inputTextBoxSearch(registrationEntity.getLastName());
        webTablePage.testBasic.waitForElement(webTablePage.resultSearchFirstName,Integer.valueOf(webTablePage.config.timeOutMedium));
        String actualLastName = webTablePage.testBasic.getActualString(webTablePage.resultSearchLastName);
        Assert.assertEquals(actualLastName, registrationEntity.getLastName());
    }

    @DataProvider(name="RegistrationData")
    public RegistrationEntity[][] getRegistrationData() {
        Utils utils = new Utils();
        String[][] registrationDataTable = utils.readExcelFile("DemoQA_TestData.xls", "WebTable");
        RegistrationEntity[][] registrationEntities = new RegistrationEntity[registrationDataTable.length][1];
        for (int i = 0; i < registrationDataTable.length; i++) {
            RegistrationEntity registrationEntity = new RegistrationEntity(registrationDataTable[i][0], registrationDataTable[i][1], registrationDataTable[i][2], registrationDataTable[i][3], registrationDataTable[i][4], registrationDataTable[i][5]);
            registrationEntities[i][0]=registrationEntity;
        }
        return registrationEntities;
    }
}


