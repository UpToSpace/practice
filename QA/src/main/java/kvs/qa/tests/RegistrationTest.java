package kvs.qa.tests;

import kvs.qa.common.CommonConditions;
import kvs.qa.pages.RegistrationPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends CommonConditions {
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void browserSetup() {
        registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void registration() throws InterruptedException {
        //registrationPage.register("", "", "",true, true, false);
        //registrationPage.register("", "+375290000000", "someemail@mail.ru",true, false, true);
        //registrationPage.register("Валерия", "", "someemail@mail.ru", true, false, false);
        //registrationPage.register("Валерия", "+375290000000", "someemail@mail.ru", true, false, true);
        registrationPage.register("Валерия", "+37529", "someemail@mail.ru", false, true, false);
        Thread.sleep(100000);
    }
}
