package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.models.ConfigurationsEntity;

import java.lang.module.Configuration;

public class ElementsPage extends Page{
    //elements
    By menuTextBox =By.xpath("//span[(text()='Text Box')]");
    By menuCheckBox=By.xpath("//span[(text()='Check Box')]");
    By menuForm=By.xpath("//span[contains(text(),'Practice Form')]");

    By menuPracticeForm=By.xpath("//span[contains(text(),'Practice Form')]");

    public ElementsPage(WebDriver dr, ConfigurationsEntity configurationsEntity) {
        super(dr,configurationsEntity);
    }


    public TextBoxPage clickOnTextBox(){
        driver.findElement(menuTextBox).click();
        return new TextBoxPage(driver,config);

    }
    public CheckBoxPage clickOnCheckBox(){
        driver.findElement(menuCheckBox).click();
        return  new CheckBoxPage(driver,config);
    }

}
