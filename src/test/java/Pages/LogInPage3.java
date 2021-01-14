package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage3 extends BasePage{
    private By userNameLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");

    public LogInPage3 (WebDriver browserDriver){
        super(browserDriver);
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));*/
    }

    public void logIn (String userName, String password) throws Exception {
        setUserName(userName);
        setPasswd(password);
        clickLogInButton();
    }
    private LogInPage3 setUserName (String userName){
        WebElement userNameTextBox = driver.findElement(userNameLocator);
        userNameTextBox.sendKeys(userName);
        return this;
    }
    private LogInPage3 setPasswd (String passwrd){
        WebElement passwordTextBox = driver.findElement(passwordLocator);
        passwordTextBox.sendKeys(passwrd);
        return this;
    }
    private InventoryPage clickLogInButton () throws Exception {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        verifySuccessfulLogin();
        return new InventoryPage(driver);
    }

    private void verifySuccessfulLogin() throws Exception {
        try{
            /*wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));*/
        }
        catch (TimeoutException e){
            String errorTextLogin = driver.findElement(By.cssSelector("h3[data-test=error]")).getText();
            throw new Exception("Login Failed: " + errorTextLogin);
        }
    }

}
