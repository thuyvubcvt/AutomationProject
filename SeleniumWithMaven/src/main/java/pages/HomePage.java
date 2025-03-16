package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.models.ConfigurationsEntity;

public class HomePage extends Page {
     By lblElemment=By.xpath("//h5[(text()='Elements')]");

    public HomePage(WebDriver dr, ConfigurationsEntity configurationsEntity) {
        super(dr,configurationsEntity);
    }

    public ElementsPage clickOnElement() {
        //click Element => chuyen trang Element page
        WebElement element = driver.findElement(lblElemment);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return new ElementsPage(driver,config);

    }


}
