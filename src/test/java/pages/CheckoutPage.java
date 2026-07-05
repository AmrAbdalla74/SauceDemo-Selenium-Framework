package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    private By firstNameInput = By.id("first-name");
    private By lastNameInput = By.id("last-name");
    private By postalCodeInput = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By successMessage = By.className("complete-header");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillCheckoutInfo(String FirstName, String LastName, String PostalCode){
        driver.findElement(firstNameInput).sendKeys(FirstName);
        driver.findElement(lastNameInput).sendKeys(LastName);
        driver.findElement(postalCodeInput).sendKeys(PostalCode);
    }

    public void clickContinue(){
        driver.findElement(continueBtn).click();
    }

    public void clickFinish(){
        driver.findElement(finishBtn).click();
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }


}
