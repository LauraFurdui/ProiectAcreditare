package org.fasttrackit.features;

import io.vavr.collection.List;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.TestsRequirement;
import org.fasttrackit.pages.*;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.steps.ShopSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.fasttrackit.features.*;
import org.junit.Assert;
import org.junit.Test;

public class ShopTest extends BaseTest{
    private ShopPage shopPage;
    private CartPage cartPage;
    private HomePage homePage;

//    @Tests
//    private CartTest cartTest;

    @Steps
    private ShopSteps shopSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private ProductSteps productSteps;


    @Test
    public void shop1(){
        shopSteps.navigateToShopPage();
        shopSteps.successfulNavigateToShopPage();
    }

    @Test
    public void shop2(){
        shop1();
        shopSteps.addToCartFirstProduct();
        cartSteps.navigateToCartPage();
        cartSteps.successfulNavigateToCartPage();
    }

    @Test
    public void shop3(){
        shop1();
        Integer addToCartButtonsCount = 0;
        addToCartButtonsCount += shopSteps.addToCartAllProducts();
        shopSteps.navigateToSecondPage();
        addToCartButtonsCount += shopSteps.addToCartAllProducts();
        cartSteps.navigateToCartPage();
        cartSteps.checkAddedProductsInCart(addToCartButtonsCount);
    }

    @Test
    public void shop4(){
        shop1();
        String productPageURL = shopSteps.navigateToFirstProductPage();
        productSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.checkProductInCart(productPageURL);
    }

    @Test
    public void shop5(){
        shop1();
        shopSteps.navigateToFirstProductPage();
        productSteps.enterQuantity("3");
        productSteps.addToCart();
        cartSteps.navigateToCartPage();
        cartSteps.checkQuantityProductInCart("3");
    }
}
