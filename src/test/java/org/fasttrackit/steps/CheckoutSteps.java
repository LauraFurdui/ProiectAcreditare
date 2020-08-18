package org.fasttrackit.steps;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.utils.BaseTest;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.steps.MyAccountSteps;
import org.junit.Assert;

public class CheckoutSteps {
    private CheckoutPage checkoutPage;
    private  OrdersPage ordersPage;
    private BillingAddressPage billingAddressPage;

    @Steps
    private MyAccountSteps myAccountSteps;

    @Step
    public void checkAutocomplete(){
        checkoutPage.checkAutocomplete();
    }

    @Step
    public void checkSuccessfulPlaceOrder(){
        Assert.assertTrue(ordersPage.checkSuccessfulPlaceOrder());
    }

    @Step
    public void expiredSession(){
        checkoutPage.getExpiredSession();
    }

    @Step
    public void checkSuccessfulExpiredSession(){
        Assert.assertTrue(checkoutPage.getExpiredSession());
    }

    @Step
    public void checkReturningCustomer(){
        Assert.assertTrue(checkoutPage.getReturningCustomer());
    }

    @Step
    public void enterFirstName(){
        checkoutPage.clickBillingFirstName();
    }

    @Step
    public void enterLastName(){
        checkoutPage.clickBillingLastName();
    }

    @Step
    public void enterCompanyName(){
        checkoutPage.clickCompanyNameTextbox();
    }

    @Step
    public void enterBillingHouseNumberAndStreetName(){
        checkoutPage.clickBillingHouseNumberAndStreetName();
    }

    @Step
    public void enterBillingApartment(){
        checkoutPage.clickBillingApartment();
    }

    @Step
    public void enterBillingSuite(){
        checkoutPage.clickBillingSuite();
    }

    @Step
    public void enterBillingUnit(){
        checkoutPage.clickBillingUnit();
    }

    @Step
    public void enterBillingTown(){
        checkoutPage.clickBillingCity();
    }

    @Step
    public void enterBillingPostcodeZip(){
        checkoutPage.clickPostcodeZip();
    }

    @Step
    public void enterBillingPhone(){
        checkoutPage.clickBillingPhone();
    }

    @Step
    public void enterEmailAddress(){
        checkoutPage.clickBillingEmail();
    }

    @Step
    public void tickCreateAccount(){
        checkoutPage.clickCreateAccount();
    }

    @Step
    public void enterPassword(){
        checkoutPage.clickCreatePassword();
    }

    @Step
    public void placeOrder(){
        checkoutPage.clickPlaceOrder();
    }

    @Step
    public void chooseBillingCounty(String county){
        checkoutPage.searchBillingCounty(county);
        checkoutPage.clickDropdownValue(county);
    }

    @Step
    public void chooseBillingCountry(String country){
        checkoutPage.searchBillingCountry(country);
        checkoutPage.clickDropdownValue(country);
    }

    @Step
    public void clickBillingCountyTextbox(){
        checkoutPage.clickBillingCountyTextbox();
    }

    @Step
    public void selectBillingCountyCluj(){
        checkoutPage.selectBillingCountyCluj();
    }
}
