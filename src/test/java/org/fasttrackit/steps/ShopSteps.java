package org.fasttrackit.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import static org.fasttrackit.utils.Constants.*;

import org.fasttrackit.pages.ShopPage;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class ShopSteps {
    private ShopPage shopPage;
    private HomePage homePage;

    @Step
    public void navigateToShopPage(){
        homePage.open();
        homePage.clickShop();
    }

    @Step
    public void successfulNavigateToShopPage(){
        shopPage.getSuccessfulNavigateToShopPage();
    }

    @Step
    public void addToCartFirstProduct(){
        shopPage.clickAddToCartButtonFirstProduct();
    }

    @Step
    public Integer addToCartAllProducts(){
        return shopPage.clickAllAddToCartButton();
    }

    @Step
    public void navigateToSecondPage(){
        shopPage.clickSecondPage();
    }

    @Step
    public String navigateToFirstProductPage(){
        return shopPage.clickFirstProduct();
    }

}
