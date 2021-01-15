package hellocucumber;

import Pages.InventoryItemPage;
import Pages.InventoryPage;
import Pages.LogInPage3;
import Pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

class Login {
    static String isLogin(String result) {
        return "yes";
    }
}

public class StepDefinitions {
    WebDriver driver;

    //Login
    @Given("I am on the Login Page of Sauce demo")
    public void ı_am_on_the_login_page_of_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");
    }

    @When("I enter valid username and password")
    public void ı_enter_valid_username_and_password() {
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        userNameTextBox.sendKeys("standard_user");
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        passwordTextBox.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("I should be taken to Inventory Page")
    public void ı_should_be_taken_to_ınventory_page() {
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    //Select First Item link
    @Given("I am on the Inventory page of Sauce demo")
    public void ı_am_on_the_ınventory_page_of_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");
    }

    @When("I click first product")
    public void ı_click_first_product() {
        List<WebElement> productLinks = driver.findElements(By.className("inventory_item_name"));
        productLinks.get(0).click();
    }

    @Then("I should be taken to Inventory Item Page")
    public void ı_should_be_taken_to_ınventory_ıtem_page() {
        driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
    }

    //Add Item to Cart
    @Given("I am on the Inventory Item page of Sauce demo")
    public void ı_am_on_the_ınventory_ıtem_page_of_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
    }

    @When("I click the add to cart button")
    public void ı_click_the_add_to_cart_button() {
        WebElement addtToCartButton = driver.findElement(By.xpath("//*[contains(@class,'btn_primary btn_inventory')]"));
        addtToCartButton.click();
    }

    @Then("Item should be added to the basket")
    public void ıtem_should_be_added_to_the_basket() {
        driver.get("https://www.saucedemo.com/cart.html");
        WebElement shoppingCard =  driver.findElement(By.xpath("//*[contains(@class,'svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ')]"));
        shoppingCard.click();
        List<WebElement> nameOfItems = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
        int count = 0;
        while (count < nameOfItems.size()) {
            nameOfItems = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
            WebElement current = nameOfItems.get(count);
            String expected = current.getText();
            current.click();
            WebElement productName = driver.findElement(By.xpath("//*[@class='inventory_details_name']"));
            String nameOfItemInInventoryItem = productName.getText();
            if (expected.equals(nameOfItemInInventoryItem)) {
                System.out.println("item is same");
            } else {
                System.out.println("item is not same");
            }
            count++;
            WebElement backToInventoryButton = driver.findElement(By.xpath("//*[contains(@class,'inventory_details_back_button')]"));
            backToInventoryButton.click();
        }
    }

    //Proceed Shopping Cart
    @Given("I am on the Inventory Item Page of the Sauce demo")
    public void ı_am_on_the_ınventory_ıtem_page_of_the_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
    }

    @When("I click cart button")
    public void ı_click_cart_button() {
        WebElement addtToCartButton = driver.findElement(By.xpath("//*[contains(@class,'btn_primary btn_inventory')]"));
        addtToCartButton.click();
        WebElement proceedShoppingCart = driver.findElement(By.xpath("//*[contains(@class,'shopping_cart_link fa-layers fa-fw')]"));
        proceedShoppingCart.click();
    }

    @Then("I should be at Shopping Cart Page")
    public void ı_should_be_at_shopping_cart_page() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    //Check Items
    @Given("I am on the Shopping Cart Page of Sauce demo for check")
    public void ı_am_on_the_shopping_cart_page_of_sauce_demo_for_check() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/cart.html");
    }

    @When("I click on the name of any item in shopping cart")
    public void ı_click_on_the_name_of_any_item_in_shopping_cart() {
        List<WebElement> nameOfItems = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
        int count = 0;
        while (count < nameOfItems.size()) {
            nameOfItems = driver.findElements(By.xpath("//*[@class='inventory_item_name']"));
            WebElement current = nameOfItems.get(count);
            current.click();
        }
    }

    @Then("I should be at the page of the product I clicked on")
    public void ı_should_be_at_the_page_of_the_product_ı_clicked_on() {
        driver.get("https://www.saucedemo.com/inventory-item.html?id=4");
    }

    //Proceed Checkout
    @Given("I am on the Shopping Cart Page of Sauce demo for proceed")
    public void ı_am_on_the_shopping_cart_page_of_sauce_demo_for_proceed() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/cart.html");
    }

    @When("I click checkout button")
    public void ı_click_checkout_button() {
        WebElement checkoutButton =  driver.findElement(By.xpath("//*[contains(@class,'btn_action checkout_button')]"));
        checkoutButton.click();
    }

    @Then("I should be at Checkout One Page")
    public void ı_should_be_at_checkout_one_page() {
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    //Complete
    @Given("I am on the Checkout One Page of the Sauce demo")
    public void ı_am_on_the_checkout_one_page_of_the_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    @When("I fill fields after that I click continue and finish")
    public void ı_fill_fields_after_that_ı_click_continue_and_finish() {
        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@class,'btn_primary cart_button')]"));
        WebElement firstNameTextBox = driver.findElement(By.id("first-name"));
        firstNameTextBox.sendKeys("firstName");
        WebElement lastNameTextBox = driver.findElement(By.id("last-name"));
        lastNameTextBox.sendKeys("lastName");
        WebElement postalCodeTextBox = driver.findElement(By.id("postal-code"));
        postalCodeTextBox.sendKeys("postalCode");
        continueButton.click();
        WebElement finishButton=driver.findElement(By.xpath("//*[contains(@class,'btn_action cart_button')]"));
        finishButton.click();
    }

    @Then("I should be on Checkout Complete Page")
    public void ı_should_be_on_checkout_complete_page() {
        driver.get("https://www.saucedemo.com/checkout-complete.html");
    }

    //Logout
    @Given("I am on the any page of the Sauce demo")
    public void ı_am_on_the_any_page_of_the_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/checkout-complete.html");
    }

    @When("I click logout")
    public void ı_click_logout() {
        WebElement menu = driver.findElement(By.cssSelector("div.bm-burger-button"));
        menu.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
    }

    @Then("I should be logged out")
    public void ı_should_be_logged_out() {
        driver.get("https://www.saucedemo.com/index.html");
    }
}
