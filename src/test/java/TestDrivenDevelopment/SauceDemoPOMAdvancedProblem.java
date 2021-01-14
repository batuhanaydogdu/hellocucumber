package TestDrivenDevelopment;

import Pages.InventoryItemPage;
import Pages.InventoryPage;
import Pages.LogInPage3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SauceDemoPOMAdvancedProblem {
    WebDriver driver;
    WebDriverWait wait;
    private String user = "problem_user";
    private String passwd = "secret_sauce";

    @Test
    public void SauceDemoAdvanced() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");

        // login
        LogInPage3 logInPage = new LogInPage3(driver);
        logInPage.logIn(user,passwd);

        // image handling for Sauce Labs Backpack product
        InventoryPage inventoryPage = new InventoryPage(driver);
        WebElement imageUrlExpected= inventoryPage.getProductSrc();
        inventoryPage.productImageForHandling();
        InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
        WebElement imageUrlReturning= inventoryItemPage.getProductSrc();

        if (imageUrlExpected.equals(imageUrlReturning))
        {
            System.out.println("Image Handled");
        } else {
            System.out.println("Image is not same");
        }
    }

    public static void main(String args[]) throws Exception {
        SauceDemoPOMAdvancedProblem test = new SauceDemoPOMAdvancedProblem();
        test.SauceDemoAdvanced();
    }
}
