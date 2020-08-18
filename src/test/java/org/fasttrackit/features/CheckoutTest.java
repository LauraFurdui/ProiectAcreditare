package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{
    private CheckoutPage checkoutPage;
    private MyAccountPage myAccountPage;
    private HomePage homePage;


    @Steps
    private CheckoutSteps checkoutSteps;

    @Steps
    private MyAccountSteps myAccountSteps;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private BillingAddressSteps billingAddressSteps;

    @Steps
    private ShippingAddressSteps shippingAddressSteps;

    @Steps
    private ShopSteps shopSteps;

    public void placeOrder() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        myAccountPage.clickShippingAndBillingAddressesLink();
        myAccountSteps.navigateToEditBillingAddressPage();
        billingAddressSteps.enterBillingFirstName();
        billingAddressSteps.enterBillingLastName();
        billingAddressSteps.chooseBillingCountry("Romania");
        billingAddressSteps.enterBillingHouseNumberAndStreetName();
        billingAddressSteps.enterBillingCity();
        billingAddressSteps.chooseBillingCounty("Cluj");
        billingAddressSteps.enterPostcodeZip();
        billingAddressSteps.enterBillingPhone();
        billingAddressSteps.clickBillingSaveAddress();
        myAccountSteps.navigateToShippingAddressPage();
        shippingAddressSteps.enterShippingFirstName();
        shippingAddressSteps.enterShippingLastName();
        shippingAddressSteps.chooseShippingCountry("Romania");
        shippingAddressSteps.enterShippingHouseNumberAndStreetName();
        shippingAddressSteps.enterShippingCity();
        shippingAddressSteps.enterShippingCounty("Cluj");
        shippingAddressSteps.enterShippingPostcodeZip();
        shippingAddressSteps.clickShippingSaveAddress();
        shopSteps.navigateToShopPage();
        shopSteps.addToCartFirstProduct();
        myAccountSteps.navigateToCheckoutPage();
        checkoutSteps.placeOrder();
    }
    @Test
    public void chkt1(){
        placeOrder();
        checkoutSteps.checkSuccessfulPlaceOrder();
    }

    @Test
    public void chkt2(){
        placeOrder();
        checkoutPage.getDriver().navigate().back();
//        checkoutPage.waitOnPage();
        checkoutSteps.checkSuccessfulExpiredSession();
    }

    @Test
    public void chkt3(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUsername(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        myAccountPage.clickShippingAndBillingAddressesLink();
        myAccountSteps.navigateToEditBillingAddressPage();
        billingAddressSteps.enterBillingFirstName();
        billingAddressSteps.enterBillingLastName();
        billingAddressSteps.chooseBillingCountry("Romania");
        billingAddressSteps.enterBillingHouseNumberAndStreetName();
        billingAddressSteps.enterBillingCity();
        billingAddressSteps.chooseBillingCounty("Cluj");
        billingAddressSteps.enterPostcodeZip();
        billingAddressSteps.enterBillingPhone();
        billingAddressSteps.clickBillingSaveAddress();
        shopSteps.navigateToShopPage();
        shopSteps.addToCartFirstProduct();
        myAccountSteps.navigateToCheckoutPage();
        checkoutSteps.checkAutocomplete();
    }

    @Test
    public void chkt4(){
        homePage.open();
        homePage.clickShop();
        shopSteps.addToCartFirstProduct();
        myAccountSteps.navigateToCheckoutPage();
        checkoutSteps.checkReturningCustomer();
    }

    @Test
    public void chkt5(){
        homePage.open();
        homePage.clickShop();
        shopSteps.addToCartFirstProduct();
        myAccountSteps.navigateToCheckoutPage();
        checkoutSteps.enterFirstName();
        checkoutSteps.enterLastName();
        checkoutSteps.chooseBillingCountry("Romania");
        checkoutSteps.enterBillingHouseNumberAndStreetName();
        checkoutSteps.enterBillingTown();
//        checkoutSteps.clickBillingCountyTextbox();
//        checkoutSteps.selectBillingCountyCluj();
        checkoutSteps.chooseBillingCounty("Cluj");
        checkoutSteps.enterBillingPostcodeZip();
        checkoutSteps.enterBillingPhone();
        checkoutSteps.enterEmailAddress();
        checkoutSteps.placeOrder();
        checkoutSteps.checkSuccessfulPlaceOrder();
    }
}
