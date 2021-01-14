package hellocucumber;

import Pages.InventoryItemPage;
import Pages.InventoryPage;
import Pages.LogInPage3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.*;

public class StepDefinitions {
    WebDriver driver;
    private String user = "standard_user";
    private String passwd= "secret_sauce";


    @Given("I am on the Login Page of Sauce demo")
    public void ı_am_on_the_login_page_of_sauce_demo() {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");

    }

    @When("I enter valid username and password")
    public void ı_enter_valid_username_and_password() throws Exception {

        LogInPage3 logInPage = new LogInPage3(driver);
        logInPage.logIn(user,passwd);

    }

    @Then("I should be taken to Inventory Page")
    public void ı_should_be_taken_to_ınventory_page() {



    }




    @Given("I am on the Inventory page of Sauce demo")
    public void ı_am_on_the_ınventory_page_of_sauce_demo() {
        InventoryPage inventoryPage = new InventoryPage(driver);
        List <WebElement> options = inventoryPage.listItems();
        options.get(2).click();




    }

    @When("I click first product")
    public void ı_click_first_product() {

        InventoryPage inventoryPage = new InventoryPage(driver);
        List<WebElement> products = inventoryPage.getProductNameLinks();
        products.get(0).click();


    }

    @Then("I should be taken to Inventory Item Page")
    public void ı_should_be_taken_to_ınventory_ıtem_page() {


    }



    @Given("I am on the Inventory Item page of Sauce demo")
    public void ı_am_on_the_ınventory_ıtem_page_of_sauce_demo() {

    }

    @When("I click the add to cart button")
    public void ı_click_the_add_to_cart_button() {
        InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
        inventoryItemPage.addtoCartButtonClick();

    }

    @Then("Item should be added to the basket")
    public void ıtem_should_be_added_to_the_basket() {

    }

    @Given("I am on the Inventory Item Page of the Sauce demo")
    public void ı_am_on_the_ınventory_ıtem_page_of_the_sauce_demo() {
    }

    @When("I click cart button")
    public void ı_click_cart_button() {

    }

    @Then("I should be at Shopping Cart Page")
    public void ı_should_be_at_shopping_cart_page() {

    }

    @Given("I am on the Shopping Cart Page of Sauce demo for check")
    public void ı_am_on_the_shopping_cart_page_of_sauce_demo_for_check() {

    }

    @When("I click on the name of any item in shopping cart")
    public void ı_click_on_the_name_of_any_item_in_shopping_cart() {

    }

    @Then("I should be at the page of the product I clicked on")
    public void ı_should_be_at_the_page_of_the_product_ı_clicked_on() {

    }
    // ProceedCheckout
    @Given("I am on the Shopping Cart Page of Sauce demo for proceed")
    public void ı_am_on_the_shopping_cart_page_of_sauce_demo_for_proceed() {

    }
    @When("I click checkout button")
    public void ı_click_checkout_button() {

    }

    @Then("I should be at Checkout One Page")
    public void ı_should_be_at_checkout_one_page() {

    }
    // Logout
    @Given("I am on the Inventory Page of Sauce demo")
    public void ı_am_on_the_ınventory_page_of_the_sauce_demo() {

    }
    @When("I click logout")
    public void ı_click_logout() {

    }

    @Then("I should be logged out")
    public void ı_should_be_logged_out() {

    }









}
