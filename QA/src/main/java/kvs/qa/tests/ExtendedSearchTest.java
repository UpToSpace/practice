package kvs.qa.tests;

import kvs.qa.common.CommonConditions;
import kvs.qa.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtendedSearchTest extends CommonConditions {
    private SearchPage searchPage;

    @BeforeMethod
    public void browserSetup() {
        searchPage = new SearchPage(driver);
    }

    @Test
    public void extendedSearch() throws InterruptedException {
        searchPage.extendedSearch("Mercedes", "W203 (CLC)", "Насос вакуумный",
                "54046908", true, ".", "2.2");
        Thread.sleep(100000);
    }
}
