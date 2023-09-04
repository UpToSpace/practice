package kvs.qa.tests;

import kvs.qa.common.CommonConditions;
import kvs.qa.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends CommonConditions {

    private LoginPage loginPage;
    @BeforeMethod
    public void browserSetup() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void login() throws InterruptedException {
        //loginPage.login("", "", true, false);

        //loginPage.login("Валерия", "", true, false);

        //loginPage.login("+3750000000", "12345678", false, true);

        loginPage.login("+3750000000", "12345678", true, false);
        Thread.sleep(100000);
    }
}
