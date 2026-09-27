package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigUtils;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        loginPage.login(ConfigUtils.getUsername(), ConfigUtils.getPassword());
        productsPage.addBackpackToCart();
        productsPage.openCart();
        Assert.assertTrue(cartPage.isProductAdded(),
                "Product should be added to the cart" );
    }
}
