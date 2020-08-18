package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa1.fasttrackit.org:8008/my-account/edit-address/")
public class EditAddressPage extends PageObject {

    @FindBy(css = "#post-7 > div > div > div > div > div.u-column1.col-1.woocommerce-Address > header > a")
    private WebElementFacade editBillingAddressLink;

    @FindBy(css = "#post-7 > div > div > div > div > div.u-column2.col-2.woocommerce-Address > header > a")
    private WebElementFacade editShippingAddressLink;

    public void clickEditBillingAddress(){
        clickOn(editBillingAddressLink);
    }

    public void clickEditShippingAddress(){
        clickOn(editShippingAddressLink);
    }
}
