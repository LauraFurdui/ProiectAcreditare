package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/")
public class MyAccountPage extends PageObject {


    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1)")
    private WebElementFacade welcomeMessageParagraph;

    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade errorMessage;

//    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--dashboard.is-active > a")
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/nav/ul/li[1]/a")
    private WebElementFacade dashboardLink;


//    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--orders > a")
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/nav/ul/li[2]/a")
    private WebElementFacade ordersLink;


//    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--downloads > a")
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/nav/ul/li[3]/a")
    private WebElementFacade downloadsLink;


//    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-address > a")
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/nav/ul/li[4]/a")
    private WebElementFacade addressesLink;


//    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-account > a")
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/nav/ul/li[5]/a")
    private WebElementFacade accountDetailsLink;


//    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout > a")
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/nav/ul/li[6]/a")
    private WebElementFacade logoutLink;


    @FindBy(css = "#post-7 > div > div > div > p:nth-child(1) > a")
    private WebElementFacade logOutLink;


    @FindBy(css = "#post-7 > div > div > div > p:nth-child(2) > a:nth-child(1)")
    private WebElementFacade recentOrdersLink;


    @FindBy(css = "#post-7 > div > div > div > p:nth-child(2) > a:nth-child(2)")
    private WebElementFacade shippingAndBillingAddressesLink;

    @FindBy(css = "#post-7 > div > div > div > p")
    private WebElementFacade addressPageParagraph;

    @FindBy(css = "#post-7 > div > div > div > p:nth-child(2) > a:nth-child(3)")
    private WebElementFacade editYourPasswordAndAccountDetailsLink;


    public String addressPageParagraph(){
        return addressPageParagraph.getText();
    }

    public void clickDashboard(){
        clickOn(dashboardLink);
    }

    public void clickOrders(){
        clickOn(ordersLink);
    }

    public void clickDownloads(){
        clickOn(downloadsLink);
    }

    public void clickAddresses(){
        clickOn(addressesLink);
    }

    public void clickAccountDetails(){
        clickOn(accountDetailsLink);
    }

    public void clickLogout(){
        clickOn(logoutLink);
    }

    public void clickLogOut(){
        clickOn(logOutLink);
    }

    public void clickRecentOrders(){
        clickOn(recentOrdersLink);
    }

    public void clickShippingAndBillingAddressesLink(){
        clickOn(shippingAndBillingAddressesLink);
    }

    public void clickEditYourPasswordAndAccountDetails(){
        clickOn(editYourPasswordAndAccountDetailsLink);
    }

    public String getWelcomeMessage(){
        return welcomeMessageParagraph.getText();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }
}
