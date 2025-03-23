package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.models.ConfigurationsEntity;

public class WebTablePage extends Page {

    public By txtSearch = By.id("searchBox");
    public By btnAdd = By.id("addNewRecordButton");
    public By resultSearchFirstName=By.xpath("//div/div[@role='rowgroup'][1]/div/div[1]");
    public By resultSearchLastName=By.xpath("//div/div[@role='rowgroup'][1]/div/div[2]");


    public WebTablePage(WebDriver dr, ConfigurationsEntity configurationsEntity) {
        super(dr,configurationsEntity);
    }


    public RegistrationFormPage clickBtnAdd() {
        driver.findElement(btnAdd).click();
        return new RegistrationFormPage(driver,config);
    }


    public void inputTextBoxSearch(String keywordSearch) {
        driver.findElement(txtSearch).sendKeys(keywordSearch);
    }



}






