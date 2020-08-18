package org.fasttrackit.pages;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/shop/")
public class ShopPage extends PageObject {

    @FindBy(css = "#main > div > form > select")
    private WebElementFacade sortByDropdown;

    @FindBy(css = "#main > div > form > select > option:nth-child(1)")
    private WebElementFacade sortByPopularityValue;

    @FindBy(css = "#main > div > form > select > option:nth-child(2)")
    private WebElementFacade sortByRatingValue;

    @FindBy(css = "#main > div > form > select > option:nth-child(3)")
    private WebElementFacade sortByDateValue;

    @FindBy(css = "#main > div > form > select > option:nth-child(4)")
    private WebElementFacade sortByAscendentPriceValue;

    @FindBy(css = "#main > div > form > select > option:nth-child(5)")
    private WebElementFacade sortByDescendentPriceValue;

    @FindBy(css = "a[class*='woocommerce-LoopProduct-link'")
    private List<WebElementFacade> productThumbnails;

    @FindBy(css = "a[href*='add-to-cart=']")
    private List<WebElementFacade> shopAddToCartButtons;

//    @FindBy(css = "#main > ul > li.post-32.product.type-product.status-publish.has-post-thumbnail.product_cat-decor.clearfix.instock.shipping-taxable.product-type-external > a.button.product_type_external")
    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[8]/a[2]")
    private WebElementFacade buyOnTheWordPressSwagStoreLink;

    @FindBy(xpath = "//*[@id=\"main\"]/nav[2]/ul/li[2]/a")
    private WebElementFacade firstPageLink;

    @FindBy(xpath = "//*[@id=\"main\"]/nav[2]/ul/li[3]/a")
    private WebElementFacade secondPageLink;

    @FindBy(css = "#main > nav.woocommerce-pagination > ul > li:nth-child(3) > a")
    private WebElementFacade nextPageLink;

    @FindBy(css = "#main > nav.woocommerce-pagination > ul > li:nth-child(1) > a")
    private WebElementFacade previousPageLink;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[2]")
    private WebElementFacade addToCartButtonFirstProduct;

    @FindBy(id = "Shop")
    private WebElementFacade successfulNavigateToShopPage;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[*]/a[2]")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#main > ul")
    private WebElementFacade itemsList;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[1]/img")
    private WebElementFacade firstProduct;

    public String clickFirstProduct(){
        clickOn(firstProduct);
        waitOnPage();
        return getDriver().getCurrentUrl();
    }

    public ShopPage() {
    }

    public Integer clickAllAddToCartButton(){
        for (WebElementFacade addToCartButton : shopAddToCartButtons ) {
            addToCartButton.waitUntilClickable();
            clickOn(addToCartButton);
        }

        return shopAddToCartButtons.size();
    }

    public WebElementFacade getSuccessfulNavigateToShopPage(){
        return successfulNavigateToShopPage;
    }

    public void clickAddToCartButtonFirstProduct(){
        clickOn(addToCartButtonFirstProduct);
    }

    public void clickSortBy(){
        clickOn(sortByDropdown);
    }

    public void clickSortByPopularity(){
        clickOn(sortByPopularityValue);
    }

    public void clickSortByRating(){
        clickOn(sortByRatingValue);
    }

    public void clickSortByDate(){
        clickOn(sortByDateValue);
    }

    public void clickSortByAscendentPrice(){
        clickOn(sortByAscendentPriceValue);
    }

    public void clickSortByDescendingPrice(){
        clickOn(sortByDescendentPriceValue);
    }

    public void clickBuyOnTheWordPressSwagStore(){
        clickOn(buyOnTheWordPressSwagStoreLink);
    }

    public void clickFirstPage(){
        clickOn(firstPageLink);
    }

    public void clickSecondPage(){
        clickOn(secondPageLink);
    }

    public void clickNextPage(){
        clickOn(nextPageLink);
    }

    public void clickPreviousPage(){
        clickOn(previousPageLink);
    }

    public void clickProduct(String productName){
        String productPage = productName.toLowerCase().replaceAll(" ", "-");

        for (WebElementFacade productPageLink : productThumbnails ) {
            if (productPageLink.getAttribute("href").contains(productPage)) {
                clickOn(productPageLink);
                break;
            }
        }
    }

    public void clickShopAddToCart(String productName){
        for (WebElementFacade addToCartButton : shopAddToCartButtons ) {
            if (addToCartButton.getAttribute("aria-label").toLowerCase().contains(productName.toLowerCase())) {
                clickOn(addToCartButton);
                break;
            }
        }
    }
}