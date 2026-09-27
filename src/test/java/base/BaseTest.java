package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import factory.DriverFactory;
import utils.ConfigReader;
import utils.ConfigUtils;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setUp(){
        String browser = System.getProperty("browser", "chrome");
        driver = DriverFactory.createDriver(browser);
        //we use Get method to open saucedemo web
        ConfigReader.loadProperties();
        driver.get(ConfigUtils.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
