package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.Constants;

public class ShippingAddressSteps {

    private MyAccountPage myAccountPage;
    private LoginPage loginPage;
    private EditAddressPage editAddressPage;
    private ShippingAddressPage shippingAddressPage;

    @Step
    public void navigateToBillingAddressPage(){
        loginPage.open();
        loginPage.setUsername(Constants.USER_NAME);
        loginPage.setPassword(Constants.USER_PASSWORD);
        loginPage.clickLogin();
        myAccountPage.clickShippingAndBillingAddressesLink();
        editAddressPage.clickEditShippingAddress();
    }

    @Step
    public void successfulNavigatetoShippingAddressPage(){
        shippingAddressPage.getSuccessfulNavigateToShippingAddress();
    }

    @Step
    public void enterShippingFirstName(){
        shippingAddressPage.clickShippingFirstName();
    }

    @Step
    public void enterShippingLastName(){
        shippingAddressPage.clickShippingLastName();
    }

    @Step
    public void enterShippingCompanyName(){
        shippingAddressPage.clickShippingCompanyName();
    }

    @Step
    public void chooseShippingCountry(String country){
        shippingAddressPage.searchShippingCountry(country);
        shippingAddressPage.clickDropdownValue(country);
    }

    @Step
    public void enterShippingHouseNumberAndStreetName(){
        shippingAddressPage.clickShippingHouseNumberAndStreetName();
    }

    @Step
    public void enterShippingApartment(){
        shippingAddressPage.clickShippingApartment();
    }

    @Step
    public void enterShippingSuite(){
        shippingAddressPage.clickShippingSuite();
    }

    @Step
    public void enterShippingUnit(){
        shippingAddressPage.clickShippingUnit();
    }

    @Step
    public void enterShippingCity(){
        shippingAddressPage.clickShippingCity();
    }

    @Step
    public void enterShippingCounty(String county){
        shippingAddressPage.searchShippingCounty(county);
        shippingAddressPage.clickDropdownValue(county);
    }

    @Step
    public void enterShippingPostcodeZip(){
        shippingAddressPage.clickShippingPostcodeZip();
    }

    @Step
    public void clickShippingSaveAddress(){
        shippingAddressPage.clickShippingSaveAddress();
    }
}
