package kvs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Page {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private String URL = "https://www.autopriwos.by/register.html";
    @FindBy(id = "_submit_button")
    private WebElement submitButton;

    @FindBy(id = "_clear_button")
    private WebElement clearButton;

    public RegistrationPage register(String name, String number, String email, Boolean agreement, Boolean submit, Boolean clear) {
        driver.get(URL);
        waitForVisibilityOfElement(driver, submitButton);
        WebElement nameInput = driver.findElement(By.id("data[name]"));
        nameInput.sendKeys(name);
        WebElement numberInput = driver.findElement(By.id("data[phone]"));
        numberInput.sendKeys(number);
        if(agreement) {
            WebElement agreeCheckbox = driver.findElement(By.name("data[agree]"));
            agreeCheckbox.click();
        }
        if(submit) {
            submitButton.click();
        }
        if(clear) {
            clearButton.click();
        }
        return this;
    }
}
