package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends Page {

    public By txtFullName = By.id("userName");
    public By txtEmail = By.id("userEmail");
    public By txtCurrentAddress = By.id("currentAddress");
    public By txtPermanentAddress = By.id("permanentAddress");
    public By btnSubmit=By.id("submit");


    public By lblName = By.id("name");
    public By lblEmail = By.id("email");
    public By lblAddress = By.xpath("//p[@id='currentAddress']");
    public By lblPermanentAddress = By.xpath("//p[@id='permanentAddress']");

    public TextBoxPage(WebDriver dr) {
        super(dr);
    }

    public void inputData(String userName, String userEmail, String currentAddress, String permanentAddress) {
        driver.findElement(txtFullName).sendKeys(userName);
        driver.findElement(txtEmail).sendKeys(userEmail);
        driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
        driver.findElement(txtPermanentAddress).sendKeys(permanentAddress);
        driver.findElement(btnSubmit).click();
    }

    public String getActualString(By locator) {
        String actualString = "";
        String originalString = driver.findElement(locator).getText();
        int indexOfColon = originalString.indexOf(":");
        actualString = originalString.substring(indexOfColon + 1);
        return actualString;

    }

//    public String getAttributeByLocator(By locator, String attributeName) {
//        return driver.findElement(locator).getAttribute(attributeName);
//
//    }
}
