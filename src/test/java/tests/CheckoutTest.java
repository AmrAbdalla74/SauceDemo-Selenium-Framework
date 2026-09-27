package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigUtils;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login(ConfigUtils.getUsername(), ConfigUtils.getPassword());

        productsPage.addBackpackToCart();
        productsPage.openCart();

        cartPage.clickCheckout();

        checkoutPage.fillCheckoutInfo(
                ConfigUtils.getFirstName(),
                ConfigUtils.getLastName(),
                ConfigUtils.getPostalCode()
        );
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();

        Assert.assertEquals(checkoutPage.getSuccessMessage(),
                "Thank you for your order!"
        );
    }
}
