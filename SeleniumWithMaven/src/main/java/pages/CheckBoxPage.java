package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage extends Page {

    public By chkHome = By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']/*[name()='svg']");
    public By iconExpand = By.xpath("//button[@class='rct-collapse rct-collapse-btn']");
    public By lblResult = By.cssSelector("#result span");
   // public By checkboxName = By.xpath("//span[@class='rct-checkbox']/*[name()='svg']");
    public String chkItem = "//*[text()='@param']/preceding-sibling::span[2]/*[name()='svg']";


    public CheckBoxPage(WebDriver dr) {
        super(dr);
    }


    public void clickOnCheckBoxPage() {
        driver.findElement(chkHome).click();

    }
    public  void clickIconExpand(){
        driver.findElement(iconExpand).click();
    }

    public String getActualString() {
        List<WebElement> elements = driver.findElements(lblResult);

        // Nối chuỗi nội dung của các phần tử <span>
        StringBuilder concatenatedText = new StringBuilder();
        for (WebElement element : elements) {
            concatenatedText.append(element.getText()).append(" ");
        }

        return concatenatedText.toString().trim();
    }

/*
    // Kiểm tra tất cả các checkbox có được check hay không
    public boolean areCheckboxesChecked() {
        // Lấy tất cả các phần tử span có class rct-text
        List<WebElement> checkboxLabels = driver.findElements(checkboxName);

        // Biến để kiểm tra trạng thái của checkbox
        boolean isChecked = false;

        // Lặp qua tất cả các checkbox và kiểm tra trạng thái
        for (WebElement element : checkboxLabels) {
            // In thông tin class của từng phần tử
            System.out.println("Class của phần tử: " + element.getAttribute("class"));

            // Nếu tìm thấy một checkbox được chọn
            if (element.getAttribute("class").contains("rct-icon-check")) {
                isChecked = true;
            }
        }

        // Trả về trạng thái cuối cùng sau khi kiểm tra tất cả
        return isChecked;
    }
*/
    public boolean getCheckedResult(String locator, String chkText){
            boolean result=true;
            By newChkLocator = testBasic.replaceXpath(locator, chkText);
            String classValue=driver.findElement(newChkLocator).getAttribute("class");
            if(!classValue.contains("rct-icon-check")){
                result=false;
            }

            return  result;

    }
}








