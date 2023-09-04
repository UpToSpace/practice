package kvs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private String URL = "https://www.autopriwos.by/login.html";
    @FindBy(id = "_submit_button")
    private WebElement submitButton;

    @FindBy(id = "_clear_button")
    private WebElement clearButton;

    public LoginPage login(String phoneNumber, String password, boolean submit, boolean clear) {
        driver.get(URL);
        WebElement phoneNumberInput = driver.findElement(By.id("data[email]"));
        waitForVisibilityOfElement(driver, phoneNumberInput);
        phoneNumberInput.sendKeys(phoneNumber);
        WebElement passwordInput = driver.findElement(By.id("data[password]"));
        passwordInput.sendKeys(password);
        if(submit) {
            submitButton.click();
        }
        if(clear) {
            clearButton.click();
        }
        return this;
    }
}
