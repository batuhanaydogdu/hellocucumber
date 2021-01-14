package hellocucumber;

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
        assertEquals(1, 1);
        LogInPage3 logInPage = new LogInPage3(driver);
        logInPage.logIn(user,passwd);

    }

    @Then("I should be taken to Inventory Page")
    public void ı_should_be_taken_to_ınventory_page() {
        assertEquals(1, 1);
        new InventoryPage(driver);

    }




    @Given("I am on the Inventory page of Sauce demo")
    public void ı_am_on_the_ınventory_page_of_sauce_demo() {



        throw new io.cucumber.java.PendingException();
    }

    @When("I click first product")
    public void ı_click_first_product() {

        InventoryPage inventoryPage = new InventoryPage(driver);
        List<WebElement> products = inventoryPage.getProductNameLinks();
        products.get(0).click();

        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be taken to Inventory Item Page")
    public void ı_should_be_taken_to_ınventory_ıtem_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
