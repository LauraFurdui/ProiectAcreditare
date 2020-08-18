package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.Constants;


public class BillingAddressSteps {

    private MyAccountPage myAccountPage;
    private LoginPage loginPage;
    private EditAddressPage editAddressPage;
    private BillingAddressPage billingAddressPage;
    private AddressesPage addressesPage;

    @Step
    public void navigateToBillingAddressPage(){
        loginPage.open();
        loginPage.setUsername(Constants.USER_NAME);
        loginPage.setPassword(Constants.USER_PASSWORD);
        loginPage.clickLogin();
        myAccountPage.clickShippingAndBillingAddressesLink();
        editAddressPage.clickEditBillingAddress();
    }

    @Step
    public void successfulNavigateToEditBillingAddressPage(){
        billingAddressPage.getSuccessfullNavigateToBillingAddress();
    }

    @Step
    public void successfulAddressChange(){
        addressesPage.successfulAddressChange();
    }

    @Step
    public void enterBillingFirstName(){
        billingAddressPage.clickBillingFirstName();
    }

    @Step
    public void enterBillingLastName(){
        billingAddressPage.clickBillingLastName();
    }

    @Step
    public void enterBillingCompanyName(){
        billingAddressPage.clickBillingCompanyNameTextbox();
    }

    @Step
    public void chooseBillingCountry(String country){
        billingAddressPage.searchBillingCountry(country);
        billingAddressPage.clickDropdownValue(country);
    }

    @Step
    public void enterBillingHouseNumberAndStreetName(){
        billingAddressPage.clickBillingHouseNumberAndStreetName();
    }

    @Step
    public void enterBillingApartment(){
        billingAddressPage.clickBillingApartment();
    }

    @Step
    public void enterBillingSuite(){
        billingAddressPage.clickBillingSuite();
    }

    @Step
    public void enterBillingUnit(){
        billingAddressPage.clickBillingUnit();
    }

    @Step
    public void enterBillingCity(){
        billingAddressPage.clickBillingCity();
    }

    @Step
    public void chooseBillingCounty(String county){
        billingAddressPage.searchBillingCounty(county);
        billingAddressPage.clickDropdownValue(county);
    }

    @Step
    public void enterPostcodeZip(){
        billingAddressPage.clickPostcodeZip();
    }

    @Step
    public void enterBillingPhone(){
        billingAddressPage.clickBillingPhone();
    }

    @Step
    public void enterBillingEmail(){
        billingAddressPage.clickBillingEmail();
    }

    @Step
    public void clickBillingSaveAddress(){
        billingAddressPage.clickBillingSaveAddress();
    }

}
