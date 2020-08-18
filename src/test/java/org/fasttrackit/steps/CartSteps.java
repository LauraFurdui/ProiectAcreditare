package org.fasttrackit.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;
import static org.fasttrackit.utils.Constants.*;

import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class CartSteps {
    private CartPage cartPage;
    private HomePage homePage;

    @Step
    public void navigateToCartPage(){
        homePage.open();
        homePage.clickCart();
    }

    @Step
    public void successfulNavigateToCartPage(){
        cartPage.getSuccessfulNavigateToCartPage();
    }

    @Step
    public void successfullAddToCartFirstProduct(){
        cartPage.getSuccessfulNavigateToCartPage();
    }

    @Step
    public void checkAddedProductsInCart(Integer addedItems) {
        cartPage.checkAddedProductsInCart(addedItems);
    }

    @Step
    public void checkProductInCart(String productPageURL){
        cartPage.setCheckProductInCart(productPageURL);
    }

    @Step
    public void checkQuantityProductInCart (String productQuantity){
        cartPage.setCheckQuantityProductInCart(productQuantity);
    }

    @Step
        public void enterQuantity(String quantity){
            cartPage.clickQuantity(quantity);
        }

     @Step
    public void clickUpdateCart(){
        cartPage.clickUpdateCartButton();
     }

     @Step
    public void removeProduct(){
        cartPage.clickRemoveButton();
     }

     @Step
    public String getRemoveMessage(){
        return cartPage.getRemoveMessage();
     }
}
