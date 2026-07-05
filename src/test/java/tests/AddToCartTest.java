package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        productsPage.addBackpackToCart();
        productsPage.openCart();
        Assert.assertTrue(cartPage.isProductAdded(),
                "Product should be added to the cart" );
    }
}
