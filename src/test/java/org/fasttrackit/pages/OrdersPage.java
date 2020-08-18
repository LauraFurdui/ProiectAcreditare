package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/orders/")
public class OrdersPage extends PageObject{

    @FindBy(id = "Orders")
    private WebElementFacade ordersPage;

    @FindBy(css = "#post-6 > div > div > div > p.woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")
    private WebElementFacade successfulPlaceOrder;

    public WebElementFacade successfullNavigateToOrdersPage(){
        return ordersPage;
    }

    public Boolean checkSuccessfulPlaceOrder() {
        return successfulPlaceOrder.getText().equals("Thank you. Your order has been received.");
    }
}
