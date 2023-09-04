package kvs.qa.common;

import kvs.qa.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("browser", "chrome");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = Driver.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser()
    {
        Driver.closeDriver();
    }
}