package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage extends Page {

    public By txtSearch = By.id("searchBox");
    public By btnAdd = By.id("addNewRecordButton");
    public By resultSearchFristName=By.xpath("//div/div[@role='rowgroup'][1]/div/div[1]");

    public WebTablePage(WebDriver dr) {
        super(dr);
    }


    public RegistrationFormPage clickBtnAdd() {
        driver.findElement(btnAdd).click();
        return new RegistrationFormPage(driver);
    }


    public void inputTextBoxSearch(String keywordSearch) {
        driver.findElement(txtSearch).sendKeys(keywordSearch);
    }

    public String getActualString(By locator) {
        String actualString = "";
        String originalString = driver.findElement(locator).getText();

        return actualString;

    }

}






