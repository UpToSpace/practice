package kvs.qa.tests;

import kvs.qa.common.CommonConditions;
import kvs.qa.pages.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextSearchTest extends CommonConditions {
    private SearchPage searchPage;

    @BeforeMethod
    public void browserSetup() {
        searchPage = new SearchPage(driver);
    }

    @Test
    public void TextSearch() {
        try {
            searchPage.Search(""); // empty search
            searchPage.Search("54295850"); // search by article
            searchPage.Search("Kia"); // search by brand
            searchPage.Search("Carnival"); // search by car model
            searchPage.Search("Двигатель"); // search by car detail
            searchPage.ClearSearchField();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
