package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.*;
import org.junit.Test;

public class MyAccountTest extends BaseTest {

    private MyAccountPage myAccountPage;
    private HomePage homePage;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private MyAccountSteps myAccountSteps;

    @Steps
    private ShippingAddressSteps shippingAddressSteps;

    @Steps
    private BillingAddressSteps billingAddressSteps;

    @Steps
    private LoginTest loginTest;

    @Test
    public void acc1(){
        loginTest.lgn2();
        myAccountSteps.navigateToRecentOrdersPage();
        myAccountSteps.succesfullNavigateToRecentOrders();
    }

    @Test
    public void acc2(){
        loginTest.lgn2();
        myAccountPage.clickShippingAndBillingAddressesLink();
        myAccountSteps.succesfullNavigateToAddressPage();
    }

    @Test
    public void acc3(){
        acc2();
        myAccountSteps.navigateToEditBillingAddressPage();
        billingAddressSteps.successfulNavigateToEditBillingAddressPage();
    }

    @Test
    public void acc4(){
        acc3();
        billingAddressSteps.enterBillingFirstName();
        billingAddressSteps.enterBillingLastName();
        billingAddressSteps.chooseBillingCountry("Romania");
        billingAddressSteps.enterBillingHouseNumberAndStreetName();
        billingAddressSteps.enterBillingCity();
        billingAddressSteps.chooseBillingCounty("Cluj");
        billingAddressSteps.enterPostcodeZip();
        billingAddressSteps.enterBillingPhone();
        billingAddressSteps.clickBillingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc5(){
        acc3();
        billingAddressSteps.enterBillingFirstName();
        billingAddressSteps.enterBillingLastName();
        billingAddressSteps.chooseBillingCountry("Romania");
        billingAddressSteps.enterBillingHouseNumberAndStreetName();
        billingAddressSteps.enterBillingApartment();
        billingAddressSteps.enterBillingCity();
        billingAddressSteps.chooseBillingCounty("Cluj");
        billingAddressSteps.enterPostcodeZip();
        billingAddressSteps.enterBillingPhone();
        billingAddressSteps.clickBillingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc6(){
        acc3();
        billingAddressSteps.enterBillingFirstName();
        billingAddressSteps.enterBillingLastName();
        billingAddressSteps.enterBillingCompanyName();
        billingAddressSteps.chooseBillingCountry("Romania");
        billingAddressSteps.enterBillingHouseNumberAndStreetName();
        billingAddressSteps.enterBillingCity();
        billingAddressSteps.chooseBillingCounty("Cluj");
        billingAddressSteps.enterPostcodeZip();
        billingAddressSteps.enterBillingPhone();
        billingAddressSteps.clickBillingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc7(){
        acc3();
        billingAddressSteps.enterBillingFirstName();
        billingAddressSteps.enterBillingLastName();
        billingAddressSteps.enterBillingCompanyName();
        billingAddressSteps.chooseBillingCountry("Romania");
        billingAddressSteps.enterBillingHouseNumberAndStreetName();
        billingAddressSteps.enterBillingApartment();
        billingAddressSteps.enterBillingCity();
        billingAddressSteps.chooseBillingCounty("Cluj");
        billingAddressSteps.enterPostcodeZip();
        billingAddressSteps.enterBillingPhone();
        billingAddressSteps.clickBillingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc8(){
        acc13();
        shippingAddressSteps.enterShippingFirstName();
        shippingAddressSteps.enterShippingLastName();
        shippingAddressSteps.chooseShippingCountry("Romania");
        shippingAddressSteps.enterShippingHouseNumberAndStreetName();
        shippingAddressSteps.enterShippingCity();
        shippingAddressSteps.enterShippingCounty("Cluj");
        shippingAddressSteps.enterShippingPostcodeZip();
        shippingAddressSteps.clickShippingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc9(){
        acc13();
        shippingAddressSteps.enterShippingFirstName();
        shippingAddressSteps.enterShippingLastName();
        shippingAddressSteps.chooseShippingCountry("Romania");
        shippingAddressSteps.enterShippingHouseNumberAndStreetName();
        shippingAddressSteps.enterShippingApartment();
        shippingAddressSteps.enterShippingCity();
        shippingAddressSteps.enterShippingCounty("Cluj");
        shippingAddressSteps.enterShippingPostcodeZip();
        shippingAddressSteps.clickShippingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc10(){
        acc13();
        shippingAddressSteps.enterShippingFirstName();
        shippingAddressSteps.enterShippingLastName();
        shippingAddressSteps.enterShippingCompanyName();
        shippingAddressSteps.chooseShippingCountry("Romania");
        shippingAddressSteps.enterShippingHouseNumberAndStreetName();
        shippingAddressSteps.enterShippingCity();
        shippingAddressSteps.enterShippingCounty("Cluj");
        shippingAddressSteps.enterShippingPostcodeZip();
        shippingAddressSteps.clickShippingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc11(){
        acc13();
        shippingAddressSteps.enterShippingFirstName();
        shippingAddressSteps.enterShippingLastName();
        shippingAddressSteps.enterShippingCompanyName();
        shippingAddressSteps.chooseShippingCountry("Romania");
        shippingAddressSteps.enterShippingHouseNumberAndStreetName();
        shippingAddressSteps.enterShippingApartment();
        shippingAddressSteps.enterShippingCity();
        shippingAddressSteps.enterShippingCounty("Cluj");
        shippingAddressSteps.enterShippingPostcodeZip();
        shippingAddressSteps.clickShippingSaveAddress();
        billingAddressSteps.successfulAddressChange();
    }

    @Test
    public void acc12(){
        homePage.open();
        myAccountPage.open();
        loginTest.lgn2();
        myAccountSteps.navigateToEditYourPasswordAndAccountDetailsPage();
        myAccountSteps.successfulNavigateToEditAccountPage();
    }

    @Test
    public void acc13(){
        acc2();
        myAccountSteps.navigateToShippingAddressPage();
        shippingAddressSteps.successfulNavigatetoShippingAddressPage();
    }

}
