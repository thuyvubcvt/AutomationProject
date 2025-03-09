package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends Page{
    //elements
    By menuTextBox =By.xpath("//span[(text()='Text Box')]");
    By menuCheckBox=By.xpath("//span[(text()='Check Box')]");
    By menuForm=By.xpath("//span[contains(text(),'Practice Form')]");

    By menuPracticeForm=By.xpath("//span[contains(text(),'Practice Form')]");

    public ElementsPage(WebDriver dr) {
        super(dr);
    }


    public TextBoxPage clickOnTextBox(){
        driver.findElement(menuTextBox).click();
        return new TextBoxPage(driver);

    }
    public CheckBoxPage clickOnCheckBox(){
        driver.findElement(menuCheckBox).click();
        return  new CheckBoxPage(driver);
    }

}
