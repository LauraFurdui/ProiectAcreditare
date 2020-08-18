package org.fasttrackit.features;

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ShopPage;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

import java.util.Random;

public class TestingCode extends BaseTest {

    private HomePage homePage;
    private ProductPage productPage;
    private ShopPage shopPage;
    private LoginPage loginPage;

    @Test
    public void testCode() {
        homePage.open();
        homePage.clickHome();
        homePage.waitOnPage();

        homePage.clickMyAccount();
        homePage.waitOnPage();

        homePage.clickCart();
        homePage.waitOnPage();

        homePage.clickShop();
        homePage.waitOnPage();

        homePage.clickCheckout();
        homePage.waitOnPage();

        homePage.clickShopingCart();
        homePage.waitOnPage();

        homePage.clickAdminRegister();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();

        homePage.clickAdminLogin();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();

        homePage.clickEntriesRSS();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();

        homePage.clickCommentRSS();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();

        homePage.clickWordPress();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();

        homePage.clickSiteAdmin();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();

        homePage.clickAdminLogout();
        homePage.waitOnPage();
        homePage.open();
        homePage.waitOnPage();
    }

    @Test
    public void testProductPage(){
        productPage.openProduct("album");
        productPage.openProduct("/Beanie with Logo");
    }

    @Test
    public void testShop() {
        shopPage.open();
        shopPage.clickProduct(Constants.PRODUCT_NAMES[0]);
        shopPage.open();
        shopPage.clickShopAddToCart(Constants.PRODUCT_NAMES[0]);
        homePage.clickCart();
        shopPage.waitOnPage();
    }

    @Test
    public void testAberatii() {
        loginPage.setCredentials(Constants.USER_EMAIL, null);
        loginPage.clickLogin();

        loginPage.setCredentials(Constants.USER_EMAIL, " ");
        loginPage.clickLogin();

        loginPage.setCredentials(Constants.USER_EMAIL, randomString(Constants.USER_PASSWORD.length()));
        loginPage.clickLogin();

        loginPage.setCredentials(Constants.USER_EMAIL, randomString(Constants.USER_PASSWORD.length() - 3));
        loginPage.clickLogin();

        loginPage.setCredentials(Constants.USER_EMAIL, randomString(Constants.USER_PASSWORD.length() + 3));
        loginPage.clickLogin();

        loginPage.setCredentials(Constants.USER_EMAIL, "dsdaÎLȘȚ");
        loginPage.clickLogin();

    }

    public String randomString(int length) {
        int rightLimit = 122; // letter 'z'
        int leftLimit = 97; // letter 'a'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }
}
