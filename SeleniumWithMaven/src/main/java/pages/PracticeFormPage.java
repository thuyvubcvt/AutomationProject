package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PracticeFormPage extends Page {

    public By txtLastName = By.id("lastName");
    public By txtFirstName = By.id("firstName");
    public By txtEmail = By.id("userEmail");
    public String radioGender = "//label[contains(text(),'@param')]";
    public By txtPhone = By.id("userNumber");
    public By txtBirthday = By.id("dateOfBirthInput");
    public By ddYear = By.xpath("//select[@class='react-datepicker__year-select']");
    public By ddMonth = By.xpath("//select[@class='react-datepicker__month-select']");
    public String lblDateXpath = "//div[text()='@param']";

    public By txtSubject = By.id("subjectsInput");
    public String checkboxHobbies = "//label[contains(text(),'@param')]";
    public By btnUpload=By.xpath("//input[@id='uploadPicture']");
    public By txtAddress = By.id("currentAddress");
    public String ddlState = "//div[text()='@param']";
    public By txtState = By.id("state");
    public String ddlCity = "//div[text()='@param']";
    public By txtCity = By.id("city");

    public By btnSubmit = By.id("submit");


    public PracticeFormPage(WebDriver dr) {
        super(dr);
    }

    public ThanksForSubmittingTheFormPage inputData(String LastName, String FirstName, String Email, String gender, String Phone,
                          String birthday, String subject, String hobbies,String urlFile, String address, String state,String city) {
        driver.findElement(txtLastName).sendKeys(LastName);
        driver.findElement(txtFirstName).sendKeys(FirstName);
        driver.findElement(txtEmail).sendKeys(Email);
        By genderLocator = testBasic.replaceXpath(radioGender, gender);
        System.out.println("in ra hhhh"+genderLocator);
        testBasic.click(genderLocator);
        driver.findElement(txtPhone).sendKeys(Phone);

        inputBirthDay(birthday);

       driver.findElement(txtSubject).sendKeys(subject);
       driver.findElement(txtSubject).sendKeys(Keys.ENTER);

        By hobbiesLocator = testBasic.replaceXpath(checkboxHobbies, hobbies);
        testBasic.click(hobbiesLocator);
        driver.findElement(btnUpload).sendKeys(urlFile);
        driver.findElement(txtAddress).sendKeys(address+Keys.ENTER);
        driver.findElement(txtAddress).sendKeys(address);
        testBasic.scrollToEndPage();

        selectValueInDropdownBox(txtState,ddlState,state);
        selectValueInDropdownBox(txtCity,ddlCity,city);

        driver.findElement(btnSubmit).click();
        return new ThanksForSubmittingTheFormPage(driver);
    }

    public void inputBirthDay(String birthday) {
        String[] birthdayArr = birthday.split(" ");
        testBasic.click(txtBirthday);
        testBasic.selectDropdownBox(ddYear, birthdayArr[2]);
        testBasic.selectDropdownBox(ddMonth, birthdayArr[1]);
        By date = testBasic.replaceXpath(lblDateXpath, birthdayArr[0]);
        testBasic.click(date);

    }

    public void selectValueInDropdownBox(By locator,String dropdownXpath, String value)
    {

        By ddlLoc= testBasic.replaceXpath(dropdownXpath,value);
       driver.findElement(locator).click();

        driver.findElement(ddlLoc).click();
    }

    public void clickOnSubmit(){

        driver.findElement(btnSubmit).click();
    }
    public String getFirstNameBorderColor() {
        String borderColor=driver.findElement(txtFirstName).getCssValue("border-color");
        return borderColor;
    }

}
