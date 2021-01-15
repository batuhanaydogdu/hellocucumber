package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOnePage {
    WebDriver driver;
    private By firstNameLocator = By.id("first-name");
    private By lastNameLocator = By.id("last-name");
    private By postalCodeLocator = By.id("postal-code");

    public CheckoutOnePage(WebDriver driver) {
        this.driver = driver;
    }

    private CheckoutOnePage setFirstName(String firstName) {
        WebElement firstNameTextBox = driver.findElement(firstNameLocator);
        firstNameTextBox.sendKeys(firstName);
        return this;
    }

    private CheckoutOnePage setLastName(String lastName) {
        WebElement lastNameTextBox = driver.findElement(lastNameLocator);
        lastNameTextBox.sendKeys(lastName);
        return this;
    }

    private CheckoutOnePage setPostalCode(String postalCode) {
        WebElement postalCodeTextBox = driver.findElement(postalCodeLocator);
        postalCodeTextBox.sendKeys(postalCode);
        return this;
    }

    public void continueTo(String firstName, String lastName, String postalCode) {
        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@class,'btn_primary cart_button')]"));
        setFirstName(firstName);
        setLastName(lastName);
        setPostalCode(postalCode);
        continueButton.click();
    }
}
