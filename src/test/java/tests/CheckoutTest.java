package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        productsPage.addBackpackToCart();
        productsPage.openCart();

        Assert.assertTrue(cartPage.isProductAdded(),
                "Product should be added to the cart"
        );

        cartPage.clickCheckout();

        checkoutPage.fillCheckoutInfo("amr", "Ali", "2222");
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();

        Assert.assertEquals(checkoutPage.getSuccessMessage(),
                "Thank you for your order!"
        );
    }
}
