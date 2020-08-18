package org.fasttrackit.pages;

import com.ibm.icu.impl.UResource;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa1.fasttrackit.org:8008/")
public class HomePage extends PageObject {

//    @FindBy(css = "#menu-item-58 > a")
//    private WebElementFacade accountLink;
//
//    @FindBy(css = "#menu-item-58 > a")
//    private WebElementFacade loginLink;
//
//
//
//    public void clickAccount(){
//        clickOn(accountLink);
//    }
//
//    public void clickLogin(){
//        clickOn(loginLink);
//    }

    @FindBy(css = "#menu-item-57 > a")
    private WebElementFacade homeLink;

    @FindBy(css = "#menu-item-58 > a")
    private WebElementFacade myAccountLink;

    @FindBy(css = "#menu-item-59 > a")
    private WebElementFacade cartLink;

    @FindBy(css = "#menu-item-60 > a")
    private WebElementFacade shopLink;

    @FindBy(css = "#menu-item-61 > a")
    private WebElementFacade checkoutLink;

    @FindBy(css = "a[title='View your shopping cart']")
    private WebElementFacade shoppingCartButton;

    @FindBy(css = "input[placeholder='Search …']")
    private WebElementFacade searchTextbox;

    @FindBy(css = "#meta-2 > ul > li:nth-child(1) > a")
    private WebElementFacade adminRegisterLink;

    @FindBy(css = "#meta-2 > ul > li:nth-child(2) > a")
    private WebElementFacade adminLoginLink;

    @FindBy(css = "#meta-2 > ul > li:nth-child(3) > a")
    private WebElementFacade entriesRssLink;

    @FindBy(css = "#meta-2 > ul > li:nth-child(4) > a")
    private WebElementFacade commentsRssLink;

    @FindBy(css = "#meta-2 > ul > li:nth-child(5) > a")
    private WebElementFacade wordPressLink;

    @FindBy(css = "#meta-2 > ul > li:nth-child(1) > a")
    private WebElementFacade siteAdminLink;

    @FindBy(css = "#meta-2 > ul > li:nth-child(2) > a")
    private WebElementFacade adminLogoutLink;


    public void clickHome(){
        clickOn(homeLink);
    }

    public void clickMyAccount(){
        clickOn(myAccountLink);
    }

    public void clickCart(){
        clickOn(cartLink);
    }

    public void clickShop(){
        clickOn(shopLink);
    }

    public void clickCheckout(){
        clickOn(checkoutLink);
    }

    public void clickShopingCart(){
        clickOn(shoppingCartButton);
    }

    public void searchFor(String searchText){
        clickOn(searchTextbox);
        typeInto(searchTextbox, searchText);
        searchTextbox.sendKeys(Keys.ENTER);
    }

    public void clickAdminRegister(){
        clickOn(adminRegisterLink);
    }

    public void clickAdminLogin(){
        clickOn(adminLoginLink);
    }

    public void clickEntriesRSS(){
        clickOn(entriesRssLink);
    }

    public void clickCommentRSS(){
        clickOn(commentsRssLink);
    }

    public void clickWordPress(){
        clickOn(wordPressLink);
    }

    public void clickSiteAdmin(){
        clickOn(siteAdminLink);
    }

    public void clickAdminLogout(){
        clickOn(adminLogoutLink);
    }
}