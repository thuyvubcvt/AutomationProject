package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * author: thuyvtp
 * Put all Selenium method for common usage
 */
public class TestBasic {




    public  WebDriver driver;


    public void openWebsite(String browser){
        String projectPath= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath +"/driver/chromedriver");
        //open browser


        if(browser.equalsIgnoreCase("chrome")){
            driver =  new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        //open web: homepage
        driver.get("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * get attribute value by locator and attribute name
     * @param locator
     * @param attributeName
     * @return
     */
    public String getAttributeByLocator(By locator, String attributeName) {
        return driver.findElement(locator).getAttribute(attributeName);


    }

    public void zoomInOut(float ratio){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '" +ratio+"'");
    }

    public  void click(By locator){
        WebElement element =  driver.findElement(locator);
        if(element.isDisplayed()){
            element.click();
        } else{
            System.out.println("Element not found to click");
        }
    }

    public void selectDropdownBox(By locator, String text){
        WebElement element=driver.findElement(locator);
        Select select= new Select(element);
        select.selectByVisibleText(text);

    }

    public By replaceXpath(String originalXpath, String replacedString){
        By result=null;
        String replaced=originalXpath.replace("@param",replacedString);
        result=By.xpath(replaced);

        return result;
    }

    public void scrollToEndPage()
    {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);" );
    }













}
