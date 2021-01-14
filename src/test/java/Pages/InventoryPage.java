package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver browserDriver) {
        driver = browserDriver;
    }
    public List <WebElement> getProductNameLinks(){
        List<WebElement> productLinks =  driver.findElements(By.className("inventory_item_name"));
        return productLinks;
    }

    public List <WebElement> listItems(){
        Select select = new Select(driver.findElement(By.xpath("//*[@class='product_sort_container']")));
        List<WebElement> options= select.getOptions();
        return options;
    }

    public List <WebElement> selectItemByClick(){
        List<WebElement> productImages =  driver.findElements(By.className("inventory_item_img"));
        return productImages;
    }

    public void productImageForHandling(){
        WebElement productImage = driver.findElement(By.className("inventory_item_img"));
        productImage.click();
    }
    public WebElement getProductSrc(){
        WebElement productImageUrl=driver.findElement(By.xpath("//*[@class='inventory_item_img'][@src='./img/sauce-backpack-1200x1500.jpgWithGarbageOnItToBreakTheUrl']"));
        return productImageUrl;
    }
}
