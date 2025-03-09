package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.models.RegistrationEntity;

public class RegistrationFormPage extends Page{
    By txtFirstName= By.id("firstName");
    By txtLastName=By.id("lastName");
    By txtEmail= By.id("userEmail");

    By txtAge= By.id("age");
    By txtSalary= By.id("salary");
    By txtDepartment= By.id("department");
    By  btnSubmit=By.id("submit");

    public RegistrationFormPage(WebDriver dr) {
        super(dr);
    }

    public void inputForm(RegistrationEntity registrationEntity){
        driver.findElement(txtFirstName).sendKeys(registrationEntity.getFirstName());
        driver.findElement(txtLastName).sendKeys(registrationEntity.getLastName());
        driver.findElement(txtEmail).sendKeys(registrationEntity.getEmail());
        driver.findElement(txtAge).sendKeys(registrationEntity.getAge());
        driver.findElement(txtSalary).sendKeys(registrationEntity.getSalary());
        driver.findElement(txtDepartment).sendKeys(registrationEntity.getDepartment());


    }
    public WebTablePage clickBtnSubmit(){
        driver.findElement(btnSubmit).click();
        return new WebTablePage(driver);
    }

}

