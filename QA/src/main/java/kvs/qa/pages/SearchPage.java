package kvs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends Page {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private final String URL = "https://www.autopriwos.by";

    @FindBy(linkText = "Текстовый поиск")
    private WebElement textSearch;
    @FindBy(id = "filter[textsearch]")
    private WebElement searchField;

    @FindBy(id = "search_button")
    private WebElement searchButton;

    @FindBy(id = "search_clear_button")
    private WebElement clearSearchFieldButton;

    public SearchPage Search(String searchText) throws InterruptedException {
        driver.get(URL);
        waitForVisibilityOfElement(driver, textSearch);
        textSearch.click();
        searchField.sendKeys(searchText);
        searchButton.click();
        return this;
    }

    public SearchPage extendedSearch(String brand, String model, String detail,
                                     String article, Boolean withPhoto, String constrn,
                                     String engineCapacity) {
        driver.get(URL);
        WebElement extendedButton = driver.findElement(By.className("icon-spacer"));
        waitForVisibilityOfElement(driver, extendedButton);
        extendedButton.click();

        Select brandSelect = new Select(driver.findElement(By.id("filter[auto_brand]")));
        brandSelect.selectByVisibleText(brand);

//        WebElement modelInput = driver.findElement(By.id("filter[auto_model]"));
   //     modelInput.sendKeys(model);

        Select detailSelect = new Select(driver.findElement(By.id("filter[part_type]")));
        detailSelect.selectByVisibleText(detail);

        WebElement articleInput = driver.findElement(By.id("filter[article]"));
        articleInput.sendKeys(article);

        if (withPhoto) {
            WebElement withPhotoCheckbox = driver.findElement(By.id("filter[with_photo]"));
            withPhotoCheckbox.click();
        }

        WebElement constrnInput = driver.findElement(By.name("filter[constrn]"));
        constrnInput.sendKeys(constrn);

        Select engineCapacitySelect = new Select(driver.findElement(By.id("filter[engine_capacity]")));
        engineCapacitySelect.selectByVisibleText(engineCapacity);

        searchButton.click();
        return this;
    }
    public SearchPage ClearSearchField() throws InterruptedException {
        clearSearchFieldButton.click();
        return this;
    }

}
