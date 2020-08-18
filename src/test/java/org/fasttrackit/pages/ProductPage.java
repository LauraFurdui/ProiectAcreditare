package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/product/")
public class ProductPage extends PageObject {

    @FindBy(name = "quantity")
            //css = "div[id|='quantity_']")
    private WebElementFacade quantityTextbox;

    @FindBy(name = "add-to-cart")
            //(className = "single_add_to_cart_button button alt")
    private WebElementFacade addToCartButton;

    @FindBy(css = "div[rel|='tag']")
    private WebElementFacade productCategoryLink;

    @FindBy(css = "#tab-title-description > a")
    private WebElementFacade productDescriptionTab;

    @FindBy(css = "#tab-title-additional_information > a")
    private WebElementFacade productAdditionalInformationTab;

    @FindBy(css = "div[href|='#tab-reviews']")
    private WebElementFacade productReviewsTab;

    public void openProduct (String productName){
        String productPage = productName.toLowerCase().replaceAll(" ", "-");
        if (productPage.startsWith("/")) {
            openAt(productPage);
        } else {
            openAt("/" + productPage);
        }
    }

    public void clickQuantity(String quantityValue){
        clickOn(quantityTextbox);
        typeInto(quantityTextbox, quantityValue);
    }

    public void addToCart(){
        clickOn(addToCartButton);
    }

    public void productCategory(){
        clickOn(productCategoryLink);
    }

    public void productDescription(){
        clickOn(productDescriptionTab);
    }

    public void productAdditionalInformation(){
        clickOn(productAdditionalInformationTab);
    }

    public void productReviews(){
        clickOn(productReviewsTab);
    }
}
