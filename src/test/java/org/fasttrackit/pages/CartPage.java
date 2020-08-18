package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://qa1.fasttrackit.org:8008/cart/")
public class CartPage extends PageObject {

    @FindBy(id = "coupon_code")
    private WebElementFacade couponCodeTextbox;

    public void clickCouponCode(String couponCodeText){
        clickOn(couponCodeTextbox);
        typeInto(couponCodeTextbox, couponCodeText);
        couponCodeTextbox.sendKeys(Keys.ENTER);
    }


    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr:nth-child(4) > td > div > input.button")
    private WebElementFacade applyCouponButton;

    public void clickApplyCoupon(){
        clickOn(applyCouponButton);
    }


//    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr:nth-child(4) > td > button")
//    private WebElementFacade updateCartButton;

    public void clickUpdateCart(){
        clickOn(updateCartButton);
    }


    @FindBy(css = "#post-5 > div > div > div > div > div > a")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(id = "Cart")
    private WebElementFacade successfulNavigateToCartPage;

    @FindBy(xpath = "//*[@id=\"post-5\"]/div/div/form/table/tbody/tr[1]/td[3]/a")
    private WebElementFacade successfulAddToCartFirstProduct;

    @FindBy(css = "#post-5 > div > div > form > table > tbody")
    private WebElementFacade cartContentBody;

    @FindBy(name = "cart[3c59dc048e8850243be8079a5c74d079][qty]")
    private WebElementFacade quantityTextbox;

    @FindBy(name = "update_cart")
    private WebElementFacade updateCartButton;

    @FindBy(css = "#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-remove > a")
    private WebElementFacade removeButton;

    @FindBy(css = "#post-5 > div > div.woocommerce-message")
    private WebElementFacade removeMessage;


    public String getRemoveMessage(){
        return removeMessage.getText();
    }

    public void clickRemoveButton(){
        clickOn(removeButton);
    }

    public void clickUpdateCartButton(){
        clickOn(updateCartButton);
    }

    public void clickQuantity(String quantityValue){
        clickOn(quantityTextbox);
        typeInto(quantityTextbox, quantityValue);
    }

    public WebElementFacade getSetSuccessfulAddToCartFirstProduct(){
        return successfulAddToCartFirstProduct;
    }

    public WebElementFacade getSuccessfulNavigateToCartPage(){
        return successfulNavigateToCartPage;
    }

    public void setCheckProductInCart(String productPageURL) {
        Boolean foundProduct = false;
        List<WebElement> cartContents = cartContentBody.findElements(By.tagName("tr"));
        for (WebElement tr : cartContents) {
            if (tr.getAttribute("class").equals("woocommerce-cart-form__cart-item cart_item")) {
                List<WebElement> columns = cartContentBody.findElements(By.tagName("td"));
                for (WebElement td : columns) {
                    if (td.getAttribute("class").equals("product-name")) {
                        WebElement a = td.findElement(By.tagName("a"));
                        if (a.getAttribute("href").equals(productPageURL)) {
                            foundProduct = true;
                            break;
                        }
                    }
                }
            }
            if (foundProduct) {
                break;
            }
        }

        Assert.assertTrue(foundProduct);
    }

    public void setCheckQuantityProductInCart(String productQuantity) {
        String foundProductQuantity = "";
        List<WebElement> cartContents = cartContentBody.findElements(By.tagName("tr"));
        for (WebElement tr : cartContents) {
            if (tr.getAttribute("class").equals("woocommerce-cart-form__cart-item cart_item")) {
                List<WebElement> columns = cartContentBody.findElements(By.tagName("td"));
                for (WebElement td : columns) {
                    if (td.getAttribute("class").equals("product-quantity")) {
                        WebElement a = td.findElement(By.tagName("input"));
                        foundProductQuantity = a.getAttribute("value");
                        break;
                    }
                }
            }
        }

        Assert.assertTrue(foundProductQuantity.equals(productQuantity));
    }

    public void checkAddedProductsInCart(Integer addedProducts) {
        Integer inCartCount = 0;
        List<WebElement> cartContents = cartContentBody.findElements(By.tagName("tr"));
        for (WebElement tr : cartContents) {
            if (tr.getAttribute("class").equals("woocommerce-cart-form__cart-item cart_item")) {
                inCartCount += 1;
            }
        }
        Assert.assertTrue(inCartCount == addedProducts);
    }

    public void clickProceedToCheckout(){
        clickOn(proceedToCheckoutButton);
    }
}
