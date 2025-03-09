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
        System.out.println(registrationEntity.getFirstName());

        WebTablePage webTablePage = new WebTablePage(testBasic.driver);
        webTablePage.goToWebTablePage();
        String keywordSearch = "thuy";
//        String firstName="thuy";
//        String lastName="vu";
//        String email="vuthuy@gmail.com";
//        String age="40";
//        String salary="10000";
//        String department="IT";
        webTablePage.clickBtnAdd();
        RegistrationFormPage registrationFormPage = new RegistrationFormPage(testBasic.driver);
        registrationFormPage.inputForm(registrationEntity);
        registrationFormPage.clickBtnSubmit();
        webTablePage.inputTextBoxSearch(keywordSearch);
        String actualResultSearchFirstName = webTablePage.getActualString(webTablePage.resultSearchFristName);
        Assert.assertEquals(actualResultSearchFirstName, keywordSearch);

    }

    @DataProvider(name="RegistrationData")
    public RegistrationEntity[][] getRegistrationData() {
        Utils utils = new Utils();
        String[][] registrationDataTable = utils.readExelFile("DemoQA_TestData.xls", "WebTable");
        RegistrationEntity[][] registrationEntities = new RegistrationEntity[registrationDataTable.length][1];
        for (int i = 0; i < registrationDataTable.length; i++) {
            RegistrationEntity registrationEntity = new RegistrationEntity(registrationDataTable[i][0], registrationDataTable[i][1], registrationDataTable[i][2], registrationDataTable[i][3], registrationDataTable[i][4], registrationDataTable[i][5]);
            registrationEntities[i][0]=registrationEntity;
        }
        return registrationEntities;
    }
}


