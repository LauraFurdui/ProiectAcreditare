package org.fasttrackit.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.fasttrackit.features.*;
import static org.fasttrackit.utils.Constants.*;

import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class MyAccountSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private LoginPage loginPage;
    private BillingAddressPage billingAddressPage;
    private ShippingAddressPage shippingAddressPage;
    private OrdersPage ordersPage;
    private AddressesPage addressesPage;
    private EditAccountPage editAccountPage;

    @Step
    public void navigateToCheckoutPage(){
        homePage.clickCheckout();
    }

    @Step
    public void navigateToEditBillingAddressPage(){
        addressesPage.clickEditBillingAddress();
    }

    @Step
    public void navigateToShippingAddressPage(){
        addressesPage.clickEditShippingAddress();
    }

    @Step
    public void navigateToRecentOrdersPage(){
        myAccountPage.clickRecentOrders();
    }

    @Step
    public void succesfullNavigateToRecentOrders(){
        ordersPage.successfullNavigateToOrdersPage();
    }

    @Step
    public void succesfullNavigateToAddressPage(){
        myAccountPage.addressPageParagraph();
    }

    @Step
    public void successfulNavigateToBillingAddressPage(){
        billingAddressPage.getSuccessfullNavigateToBillingAddress();
    }

    @Step
    public void navigateToEditYourPasswordAndAccountDetailsPage(){
        myAccountPage.clickEditYourPasswordAndAccountDetails();
    }

    @Step
    public void successfulNavigateToEditAccountPage(){
        editAccountPage.getSuccessfulNavigateToEditAccountPage();
    }


}
