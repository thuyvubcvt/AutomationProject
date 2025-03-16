package pages;

import common.TestBasic;
import org.openqa.selenium.WebDriver;
import tests.models.ConfigurationsEntity;

public class Page {
    public WebDriver driver;
    public TestBasic testBasic;
    public ConfigurationsEntity config;

    public Page(WebDriver dr, ConfigurationsEntity configurationsEntity) {
        testBasic =new TestBasic(configurationsEntity);
        config=configurationsEntity;
        this.driver = dr;
        testBasic.driver = dr; //do khởi tạo public TestBasic testBasic=new TestBasic(); nên testbasic.driver=null nên phải gán lai testBasic.driver=dr

    }

    public PracticeFormPage goToPracticeForm() {
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        return new PracticeFormPage(driver,config);
    }

    public WebTablePage goToWebTablePage() {
        driver.navigate().to("https://demoqa.com/webtables");
        //  System.out.println("inra"+testBasic.driver);
        return new WebTablePage(driver,config);

    }


}
