package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import utils.ConfigUtils;

public class LoginTest extends BaseTest {

    @Test
    public void ValidLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);

        loginPage.login(ConfigUtils.getUsername(), ConfigUtils.getPassword());
        Assert.assertTrue(productsPage.isProductsPageDisplayed(),
                "Products page should be displayed after successful login");
    }
}
