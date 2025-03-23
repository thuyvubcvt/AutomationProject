package tests;

import common.Configurations;
import common.TestBasic;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import tests.models.ConfigurationsEntity;

public class TestCase {
    public final String CONFIG_FILE=System.getProperty("user.dir"+"/src/main/resources/Configurations.properties");
    public ConfigurationsEntity configurationsEntity=new ConfigurationsEntity(CONFIG_FILE);
    TestBasic testBasic=new TestBasic(configurationsEntity);

    public TestCase() {
        System.out.println("in ra"+CONFIG_FILE);
        System.out.println("in ra "+configurationsEntity.url);
    }

    // @BeforeMethod
    public void setUp() {
        testBasic.openWebsite("chrome"); // khởi tạo driver mới
    }

    @AfterMethod
    public void tearDown() {
        testBasic.driver.quit(); // đóng driver sau mỗi test
    }

}


