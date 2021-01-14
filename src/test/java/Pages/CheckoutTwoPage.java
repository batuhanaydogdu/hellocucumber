package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutTwoPage {
    WebDriver driver;

    public CheckoutTwoPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickFinish(){
        WebElement finishButton=driver.findElement(By.xpath("//*[contains(@class,'btn_action cart_button')]"));
        finishButton.click();
    }

}
