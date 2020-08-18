package org.fasttrackit.features;

import org.fasttrackit.features.*;
import org.fasttrackit.utils.BaseTest;
import io.vavr.collection.List;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest{
    private CartPage cartPage;
    private ShopPage shopPage;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private ShopSteps shopSteps;

    @Test
    public void cart1(){
//        cartSteps.navigateToCartPage();
        cartPage.open();
        cartSteps.successfulNavigateToCartPage();
    }

    @Test
    public void cart2(){
        shopPage.open();
        shopSteps.addToCartFirstProduct();
        cartPage.open();
        cartSteps.enterQuantity("3");
        cartSteps.clickUpdateCart();
        cartSteps.checkQuantityProductInCart("3");
    }

    @Test
    public void cart3(){
        shopPage.open();
        shopSteps.addToCartFirstProduct();
        cartPage.open();
        cartSteps.removeProduct();
        Assert.assertEquals("“Album” removed. Undo?", cartSteps.getRemoveMessage());
    }
}
