package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver browserDriver) {
        driver = browserDriver;
        WebElement shoppingCard =  driver.findElement(By.xpath("//*[contains(@class,'svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ')]"));
        shoppingCard.click();
    }

    public List<WebElement> getNameofItems () {
        List<WebElement> nameofItems =  driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
        return nameofItems;
    }

    public void checkoutButtonClick(){
        WebElement checkoutButton =  driver.findElement(By.xpath("//*[contains(@class,'btn_action checkout_button')]"));
        checkoutButton.click();
    }
}
