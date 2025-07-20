package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BaseTest {
    @BeforeMethod
    public void setup() {
        DriverFactory.getDriver().manage().window().maximize();
        //System.setProperty("allure.results.directory", "target/allure-results");

    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
