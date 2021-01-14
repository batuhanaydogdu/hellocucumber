package TestDrivenDevelopment;

import Pages.LogInPage3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDriven {
    WebDriver driver;

    // unsuccessful login attempts combination
    @Test(dataProviderClass = TestDrivenDevelopment.SignInDP.class, dataProvider = "SignInProvider")
    public void signInDPClass(String username, String pwd, boolean success) throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");
        LogInPage3 logInPage3= new LogInPage3(driver);
        logInPage3.logIn(username,pwd);
        System.out.println("Username = " + username + " Password = " + pwd + " Successful Login = " + success);
        Assert.assertEquals(success,true);
    }
}
