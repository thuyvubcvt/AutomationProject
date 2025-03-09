package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PracticeFormPage;
import pages.ThanksForSubmittingTheFormPage;

import java.util.HashMap;
import java.util.Map;


public class PracticeFormTest extends TestCase {
    @Test
    public void submitSuccessfully() {

        //HomePage homePage = new HomePage(testBasic.driver);
        //System.out.println("hjhjhj"+testBasic.driver);
        //ElementsPage elementsPage = homePage.clickOnElement();

        PracticeFormPage practiceFormPage=new PracticeFormPage(testBasic.driver);
        practiceFormPage.goToPracticeForm();
        practiceFormPage.testBasic.zoomInOut(0.6f);


        String firstName = "thuy";
        String lastName = "vu";
        String userEmail = "vuthuy1661986@gmail.com";
        String gender="Male";
        String Phone = "0393188771";
        String birthday = "19 January 2015";
        String subject = "Maths";
        String hobbies="Sports";
        String urlFile="/Users/macbook/Desktop/Screenshot 2025-02-13 at 13.58.24.png";
        String address = "Nam Trung Yen";
        String state="NCR";
        String city="Delhi";


        ThanksForSubmittingTheFormPage thanksForSubmittingTheFormPage= practiceFormPage.inputData(firstName, lastName,userEmail,gender, Phone, birthday,subject,hobbies,urlFile,address,state,city);

        String actualStudentName=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Student Name");
        Assert.assertEquals(actualStudentName,lastName+" "+firstName);
        String actualStudentEmail=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Student Email");
        Assert.assertEquals(actualStudentEmail,userEmail);
        String actualGender=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Gender");
        Assert.assertEquals(actualGender,gender);
        String actualMobile=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Mobile");
        Assert.assertEquals(actualMobile,Phone);
        String actualDateOfBirth=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Date of Birth");
        Assert.assertEquals(actualDateOfBirth,birthday.replace(" 2015", ",2015"));
        String actualSubjects=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Subjects");
        Assert.assertEquals(actualSubjects,subject);
        String actualHobbies=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Hobbies");
        Assert.assertEquals(actualHobbies,hobbies);
        String actualPicture=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Picture");
        Assert.assertEquals(actualPicture,urlFile.substring(urlFile.lastIndexOf("/") + 1));
        String actualAddress=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"Address");
        Assert.assertEquals(actualAddress,address+" "+address);
        String actualStateAndCity=thanksForSubmittingTheFormPage.getTextByLocator(thanksForSubmittingTheFormPage.valueXpath,"State and City");
        Assert.assertEquals(actualStateAndCity,state+" "+city);

    }

@Test
    public void submitFail(){
    PracticeFormPage practiceFormPage=new PracticeFormPage(testBasic.driver);
    practiceFormPage.goToPracticeForm();
    practiceFormPage.testBasic.zoomInOut(0.6f);
    practiceFormPage.clickOnSubmit();
    String borderColor=practiceFormPage.getFirstNameBorderColor();
    System.out.println(borderColor);
    Assert.assertEquals(borderColor,"rgb(220, 53, 69)");
}

}
