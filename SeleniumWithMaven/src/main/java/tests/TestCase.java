package tests;

import common.TestBasic;
import org.testng.annotations.BeforeTest;

public class TestCase {
    TestBasic testBasic=new TestBasic();
    @BeforeTest
    public  void setUp(){
        testBasic.openWebsite("chrome");

    }
}
