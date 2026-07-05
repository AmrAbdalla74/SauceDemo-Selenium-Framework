package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartItem = By.className("inventory_item_name");
    private By checkOutBtn = By.id("checkout");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isProductAdded(){
        return driver.findElement(cartItem)
                .getText()
                .equals("Sauce Labs Backpack");
    }

    public void clickCheckout(){
        driver.findElement(checkOutBtn).click();
    }



}
