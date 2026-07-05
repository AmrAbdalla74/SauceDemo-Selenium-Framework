package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void entreUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void entrePassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    } 

    public void login(String username, String password ){
        entreUsername(username);
        entrePassword(password);
        clickLogin();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}

