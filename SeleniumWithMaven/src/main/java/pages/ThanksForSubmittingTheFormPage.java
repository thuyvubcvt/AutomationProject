package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksForSubmittingTheFormPage extends Page {

    public String valueXpath="//td[text()='@param']/following-sibling::td";
    public ThanksForSubmittingTheFormPage(WebDriver dr) {
        super(dr);
    }
 public String getTextByLocator(String valueXpath,String fieldName)
 {
     String result="";
     By valueLocator=testBasic.replaceXpath(valueXpath,fieldName);
     result=driver.findElement(valueLocator).getText();
     return result;
 }
}
